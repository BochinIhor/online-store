import {Component} from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from "@angular/forms";
import {User} from "../models/user";
import {ToastrService} from "ngx-toastr";
import {Observable} from "rxjs";
import {UserService} from "../services/user/user.service";

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.scss']
})
export class ProfileComponent {
  currentUser!: User;

  constructor(private userService: UserService,
              private formBuilder: FormBuilder,
              private toastrService: ToastrService) {
  }

  userProfileForm = this.formBuilder.group({
    username: this.formBuilder.control(''),
    email: this.formBuilder.control('', Validators.email),
    password: this.formBuilder.control('', Validators.pattern('(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[A-Za-z\\d$@$!%*?&].{8,}')),
    phoneNumber: this.formBuilder.control(''),
    firstname: this.formBuilder.control(''),
    lastname: this.formBuilder.control(''),
    role: this.formBuilder.control(''),
  })

  ngOnInit() {
    this.getCurrentUser();
  }

  getCurrentUser() {
    this.userService.getUserByName(sessionStorage.getItem('username')).subscribe(res => {
      this.currentUser = res;
      this.userProfileForm.controls.username.setValue(this.currentUser.username);
      this.userProfileForm.controls.email.setValue(this.currentUser.email);
      this.userProfileForm.controls.firstname.setValue(this.currentUser.firstname);
      this.userProfileForm.controls.lastname.setValue(this.currentUser.lastname);
      this.userProfileForm.controls.phoneNumber.setValue(this.currentUser.phoneNumber);
    });
  }

  saveUser() {
    this.userProfileForm.controls.role.setValue(this.currentUser.role);
    if (this.userProfileForm.controls.password.value == "") {
      this.userProfileForm.controls.password.setValue(this.currentUser.password);
    }
    if (this.userProfileForm.valid) {
      if (this.userProfileForm.controls.password.value == this.currentUser.password) {
        this.toastrService.warning("Password is not correct");
      } else {
        this.userService.updateUser(<User>this.userProfileForm.value).subscribe(res => {
          this.toastrService.success('Saved successfully');
        })
      }
    } else {
      this.toastrService.warning("Please enter valid data");
    }
  }

}
