import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {forkJoin, Observable} from "rxjs";
import {Cart} from "../../entity/cart";

@Injectable({
  providedIn: 'root'
})
export class CartService {

  private serviceUrl: string = "http://localhost:8080/api/store/carts";

  constructor(private _httpClient: HttpClient) {
  }

  getCartByUsername(username: any): Observable<Cart> {
    return this._httpClient.get<Cart>(`${this.serviceUrl}/${username}`);
  }

  saveCart(cart: Cart): Observable<Cart> {
    return this._httpClient.post<Cart>(this.serviceUrl, cart);
  }

  deleteCart(username: string): Observable<Cart> {
    console.log("cart to delete: " + username);
    //console.log(`${this.serviceUrl}/${username}`);
    return this._httpClient.delete<Cart>(`${this.serviceUrl}/${username}`);
  }

  updateCart(cart: Cart) {
    return this._httpClient.put(`${this.serviceUrl}/${cart.username}`, cart);
  }
}
