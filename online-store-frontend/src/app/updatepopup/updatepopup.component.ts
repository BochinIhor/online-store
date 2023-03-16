import {Component, EventEmitter, Inject, OnInit, Output} from '@angular/core';
import {FormBuilder, Validators} from "@angular/forms";
import {AuthService} from "../services/auth/auth.service";
import {ToastrService} from "ngx-toastr";
import {User} from "../models/user";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {UserService} from "../services/user/user.service";

interface Role {
  value: string;
  viewValue: string;
}

@Component({
  selector: 'app-updatepopup',
  templateUrl: './updatepopup.component.html',
  styleUrls: ['./updatepopup.component.scss']
})
export class UpdatepopupComponent implements OnInit {
  roles: Role[] = [
    {value: 'admin', viewValue: 'Admin'},
    {value: 'user', viewValue: 'User'},
  ];
  editUser: User;
  @Output() submitClicked = new EventEmitter<any>();

  constructor(private userService: UserService,
              private formBuilder: FormBuilder,
              private toastrService: ToastrService,
              public updateDialog: MatDialogRef<UpdatepopupComponent>,
              @Inject(MAT_DIALOG_DATA) public data: User) {
    this.editUser = data;
  }

  ngOnInit() {
    this.userProfileForm.controls.username.setValue(this.editUser.username);
    this.userProfileForm.controls.password.setValue(this.editUser.password);
    this.userProfileForm.controls.email.setValue(this.editUser.email);
    this.userProfileForm.controls.firstname.setValue(this.editUser.firstname);
    this.userProfileForm.controls.lastname.setValue(this.editUser.lastname);
    this.userProfileForm.controls.phoneNumber.setValue(this.editUser.phoneNumber);
    this.userProfileForm.controls.role.setValue(this.editUser.role);
  }

  userProfileForm = this.formBuilder.group({
    username: this.formBuilder.control(''),
    email: this.formBuilder.control('', Validators.email),
    password: this.formBuilder.control(''),
    phoneNumber: this.formBuilder.control(''),
    firstname: this.formBuilder.control(''),
    lastname: this.formBuilder.control(''),
    role: this.formBuilder.control(''),
  })

  selectRole(value: string): void {
    this.userProfileForm.controls.role.setValue(value);
    console.log("role is " + value);
  }

  updateUser() {
    //this.editUser.username = this.userProfileForm.controls.username.value;
  }

  saveUser() {
    if (this.userProfileForm.valid) {
      this.userService.updateUser(<User>this.userProfileForm.value).subscribe(res => {
        this.toastrService.success('Saved successfully');
        this.updateDialog.close();
      })
    } else {
      this.toastrService.warning("Please enter valid data");
    }
  }
}
