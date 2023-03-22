import {Component, OnInit, ViewChild} from '@angular/core';
import {User, UserColumns} from "../entity/user";
import {MatTableDataSource} from "@angular/material/table";
import {MatSort} from "@angular/material/sort";
import {MatPaginator} from "@angular/material/paginator";
import {MatDialog, MatDialogConfig} from "@angular/material/dialog";
import {UpdatepopupComponent} from "../updatepopup/updatepopup.component";
import {UserService} from "../services/user/user.service";
import {Product} from "../entity/product";
import {FormBuilder, Validators} from "@angular/forms";
import {ToastrService} from "ngx-toastr";

@Component({
  selector: 'app-adminpanel',
  templateUrl: './adminpanel.component.html',
  styleUrls: ['./adminpanel.component.scss']
})
export class AdminpanelComponent implements OnInit {
  displayedColumns: string[] = UserColumns.map((col) => col.key);
  columnsSchema: any = UserColumns;
  myDataSource = new MatTableDataSource<User>();
  valid: any = {};
  user = new User();
  resultsLength = 0;

  constructor(private userService: UserService,
              private dialog: MatDialog,
              private formBuilder: FormBuilder,
              private toastrService: ToastrService) {
  }

  @ViewChild(MatPaginator) paginator!: MatPaginator;
  @ViewChild(MatSort) sort!: MatSort;

  ngOnInit() {
    this.getUsers();
  }

  /*USERS LIST CODE START*/

  getUsers(): void {
    this.userService.getAllUsers()
      .subscribe(userData => {
        this.myDataSource.data = userData;
        this.myDataSource.sort = this.sort;
        this.myDataSource.paginator = this.paginator;
        this.sort.sortChange.subscribe(() => (this.paginator.pageIndex = 0));
      });
  }

  editUser(user: User) {
    this.openDialog(user);
  }

  openDialog(user: User) {
    const dialogConfig = new MatDialogConfig();
    dialogConfig.enterAnimationDuration = '500ms';
    dialogConfig.exitAnimationDuration = '500ms';
    dialogConfig.width = '60%';
    dialogConfig.data = {
      username: user.username,
      password: user.password,
      email: user.email,
      phoneNumber: user.phoneNumber,
      firstname: user.firstname,
      lastname: user.lastname,
      role: user.role
    };

    const updateDialog = this.dialog.open(UpdatepopupComponent, dialogConfig);

    updateDialog.afterClosed().subscribe(result => {
    });

    const dialogSubmitSubscription =
      updateDialog.componentInstance.submitClicked.subscribe(result => {
        this.myDataSource.data = result;
        dialogSubmitSubscription.unsubscribe();
      });
  }

  deleteUser(userToDel: User): void {
    this.userService.deleteUser(userToDel.username);
    this.myDataSource.data = this.myDataSource.data.filter((user: User) => user.username !== userToDel.username);
  }

  removeSelectedUsers() {
    const users = this.myDataSource.data.filter((u: User) => u.isSelected);
    this.userService.deleteUsers(users);
    this.myDataSource.data = this.myDataSource.data.filter((u: User) => !u.isSelected);
  }

  isAllSelected() {
    return this.myDataSource.data.every((item) => item.isSelected)
  }

  isAnySelected() {
    return this.myDataSource.data.some((item) => item.isSelected)
  }

  selectAll(event: any) {
    this.myDataSource.data = this.myDataSource.data.map((item) => ({
      ...item,
      isSelected: event.checked,
    }))
  }
  /*USERS LIST CODE END*/



  /*PRODUCT ADD CODE START*/
  newProduct!: Product;

  productForm = this.formBuilder.group({
    name: this.formBuilder.control(''),
    type: this.formBuilder.control(''),
    price: this.formBuilder.control(''),
    description: this.formBuilder.control(''),
    imageUrl: this.formBuilder.control(''),
  })

  saveProduct() {

  }
  /*PRODUCT ADD CODE END*/
}
