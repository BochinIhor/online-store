import {Component} from '@angular/core';
import {FormBuilder, Validators} from "@angular/forms";
import {ToastrService} from "ngx-toastr";
import {AuthService} from "../services/auth/auth.service";
import {Router} from "@angular/router";
import {CartService} from "../services/cart/cart.service";
import {Cart} from "../entity/cart";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent {

  result: any;
  cart!: Cart;

  constructor(private formBuilder: FormBuilder,
              private toastrService: ToastrService,
              private authService: AuthService,
              private cartService: CartService,
              private router: Router) {
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
          this.getUserCart(this.result.username);
          this.router.navigate(['/']);
        } else {
          this.toastrService.warning('Invalid username or password.');
        }
      });
    } else {
      this.toastrService.warning('Please enter valid data.');
    }
  }

  getUserCart(user: string) {
    this.cartService.getCartByUsername(user).subscribe(res => {
      this.cart = res;
      sessionStorage.setItem('cart', this.cart.products);
      // console.log(sessionStorage.getItem('cart'));
    });
  }

}
