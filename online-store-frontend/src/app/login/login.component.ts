import {Component} from '@angular/core';
import {FormBuilder, Validators} from "@angular/forms";
import {ToastrService} from "ngx-toastr";
import {AuthService} from "../services/auth/auth.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent {

  result: any;

  constructor(private formBuilder: FormBuilder,
              private toastrService: ToastrService,
              private authService: AuthService,
              private router: Router) {
  }

  ngOnInit() {

  }

  loginForm = this.formBuilder.group({
    username: this.formBuilder.control('', Validators.required),
    password: this.formBuilder.control('', Validators.required)
  })

  proceedLogin() {
    if (this.loginForm.valid) {
      this.authService.getUserByName(this.loginForm.value.username).subscribe(res => {
        this.result = res;
        if (this.result.password === this.loginForm.value.password) {
          sessionStorage.setItem('username', this.result.username);
          sessionStorage.setItem('role', this.result.role);
          this.router.navigate(['/']);
        } else {
          console.log("invalid username or password");
        }
      });
    } else {
      this.toastrService.warning('Please enter valid data.');
    }
  }
}
