import {Component, DoCheck} from '@angular/core';
import {Router} from "@angular/router";
import {AuthService} from "../services/auth/auth.service";
import {MatDialog, MatDialogConfig} from "@angular/material/dialog";
import {CartComponent} from "../cart/cart.component";

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})
export class HeaderComponent implements DoCheck {

  isLoggedIn = false;
  isAdmin = false;

  constructor(private router: Router,
              private dialog: MatDialog,
              private authService: AuthService) {
  }

  ngDoCheck(): void {
    this.isLoggedIn = this.authService.isLoggedIn();
    if (this.router.url == "/") {
      if (this.authService.getUserRole() == "admin") this.isAdmin = true;
    } else this.isAdmin = false;
  }

  logoutClick() {
    sessionStorage.clear();
    this.router.navigate(['/login']);
  }

  openCart() {
    const dialogConfig = new MatDialogConfig();
    dialogConfig.enterAnimationDuration = '500ms';
    dialogConfig.exitAnimationDuration = '500ms';
    dialogConfig.width = '70%';
    dialogConfig.height = '80%';
    dialogConfig.data = {};

    const updateDialog = this.dialog.open(CartComponent, dialogConfig);

    updateDialog.afterClosed().subscribe(result => {
    });

    const dialogSubmitSubscription =
      updateDialog.componentInstance.submitClicked.subscribe(() => {
        dialogSubmitSubscription.unsubscribe();
      });
  }
}
