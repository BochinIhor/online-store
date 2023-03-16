import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {HomeComponent} from "./home/home.component";
import {LoginComponent} from "./login/login.component";
import {RegisterComponent} from "./register/register.component";
import {CartComponent} from "./cart/cart.component";
import {AuthGuard} from "./guard/auth/auth.guard";
import {ProfileComponent} from "./profile/profile.component";
import {AdminpanelComponent} from "./adminpanel/adminpanel.component";
import {AdminGuard} from "./guard/admin/admin.guard";

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'login', component: LoginComponent},
  {path: 'register', component: RegisterComponent},
  {path: 'profile', component: ProfileComponent, canActivate: [AuthGuard]},
  {path: 'adminpanel', component: AdminpanelComponent, canActivate: [AuthGuard, AdminGuard]},
  {path: 'cart', component: CartComponent, canActivate: [AuthGuard]}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
