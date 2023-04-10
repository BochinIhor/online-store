import {Component} from '@angular/core';
import {FormBuilder, Validators} from "@angular/forms";
import {ToastrService} from "ngx-toastr";
import {AuthService} from "../services/auth/auth.service";
import {Router} from "@angular/router";
import {User} from "../entity/user";

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent {
  userExist = false;

  constructor(private formBuilder: FormBuilder,
              private toastrService: ToastrService,
              private authService: AuthService,
              private router: Router) {
  }

  registerForm = this.formBuilder.group({
    username: this.formBuilder.control('', Validators.compose([Validators.required, Validators.minLength(5)])),
    email: this.formBuilder.control('', Validators.email),
    password: this.formBuilder.control('', Validators.compose([Validators.required, Validators.pattern('(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[A-Za-z\\d$@$!%*?&].{4,}')])),
    phoneNumber: this.formBuilder.control(''),
    firstname: this.formBuilder.control(''),
    lastname: this.formBuilder.control(''),
    role: this.formBuilder.control(''),
    isActive: this.formBuilder.control(false)
  })

  proceedRegistration() {
    if (this.registerForm.valid) {
      if (this.authService.canRegister(<User>this.registerForm.value)) {
      this.authService.proceedRegistration(<User>this.registerForm.value).subscribe(res => {
        this.toastrService.success('You may now proceed to login.', 'Registered successfully');
        this.router.navigateByUrl('/login');
      })
      } else {
        this.toastrService.warning("User already exists");
      }
    } else {
      this.toastrService.warning("Please enter valid data");
    }
  }

}
