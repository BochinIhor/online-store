import {Component, EventEmitter, Inject, OnInit, Output} from '@angular/core';
import {Product} from "../entity/product";
import {Cart} from "../entity/cart";
import {CartService} from "../services/cart/cart.service";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {ProductService} from "../services/product/product.service";

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.scss']
})
export class CartComponent implements OnInit {

  //cart = username | 'productId,count;productId,count'

  currentUser = sessionStorage.getItem('username');
  newProduct: Product;
  productsString: string[] = [];
  products: Product[] = [];
  ids: number[] = [];
  counts: number[] = [];
  totalPrice: number;


  @Output() submitClicked = new EventEmitter<any>();

  constructor(private cartService: CartService,
              private productService: ProductService,
              public cartDialog: MatDialogRef<CartComponent>,
              @Inject(MAT_DIALOG_DATA) public data: Product) {
    this.newProduct = data;
    this.totalPrice = 0;
  }

  ngOnInit() {
    console.log(sessionStorage.getItem('cart'));
    this.getProductList();
  }

  getProductList() {
    // @ts-ignore
    this.productsString = sessionStorage.getItem('cart').split(";");
    for(let i = 0; i < this.productsString.length; i++) {
      this.ids.push(Number(this.productsString[i].split(',')[0]));
      this.counts.push(Number(this.productsString[i].split(',')[1]));
      this.productService.getProductById(this.ids[i]).subscribe(res => {
        this.products.push(res);
        this.totalPrice += this.products[i].price * this.counts[i];
      });
    }
  }

  getProductImage(prod: Product) {
    let preview;
    preview = prod.imageUrls.split(",")[0];
    return preview;
  }

  getProductQuantity(prod: Product) {
    let id = prod.id;
    for(let i = 0; i < this.ids.length; i++) {
      if(id == this.ids[i]) {
        return this.counts[i];
      }
    }
    return null;
  }

  getProductPrice(prod: Product) {
    let id = prod.id;
    for(let i = 0; i < this.ids.length; i++) {
      if(id == this.ids[i]) {
        return this.counts[i] * prod.price;
      }
    }
    return prod.price;
  }

  increase(prod: Product) {
    let id = prod.id;
    for(let i = 0; i < this.ids.length; i++) {
      if(id == this.ids[i]) {
        this.counts[i] += 1;
        this.totalPrice += prod.price;
        return this.counts[i];
      }
    }
    return null;
  }

  decrease(prod: Product) {
    let id = prod.id;
    for(let i = 0; i < this.ids.length; i++) {
      if(id == this.ids[i]) {
        this.counts[i] -= 1;
        this.totalPrice -= prod.price;
        return this.counts[i];
      }
    }
    return null;
  }

  updateCart() {
    let cart = new Cart();
    // @ts-ignore
    cart.username = sessionStorage.getItem('username');
    // @ts-ignore
    cart.products = sessionStorage.getItem('cart');
    this.cartService.updateCart(cart);
  }

  closeDialog() {
    let cartString = "";
    for(let i = 0; i < this.ids.length; i++) {
      cartString += this.ids[i] + "," + this.counts[i] + ";";
    }
    cartString = cartString.slice(0, -1);
    console.log(cartString);
    sessionStorage.setItem('cart', cartString);
    this.updateCart();
    this.cartDialog.close();
  }
}
