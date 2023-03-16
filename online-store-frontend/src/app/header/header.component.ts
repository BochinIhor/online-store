import {Component, DoCheck} from '@angular/core';
import {Router} from "@angular/router";
import {AuthService} from "../services/auth/auth.service";

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})
export class HeaderComponent implements DoCheck {

  isLoggedIn = false;
  isAdmin = false;

  constructor(private router: Router,
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
}
