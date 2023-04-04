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
  curProduct!: Product;
  cart!: Cart;
  productsString: string[] = [];
  products: Product[] = [];
  ids: number[] = [];
  counts: number[] = [];
  count!: number;


  @Output() submitClicked = new EventEmitter<any>();

  constructor(private cartService: CartService,
              private productService: ProductService,
              public cartDialog: MatDialogRef<CartComponent>,
              @Inject(MAT_DIALOG_DATA) public data: Product) {
    this.newProduct = data;
  }

  ngOnInit() {
    this.getCart();
  }

  getCart() {
    this.cartService.getCartByUsername(this.currentUser).subscribe(cart => {
      this.cart = cart;
    }).unsubscribe();
    this.getProductList();
  }

  getProductList() {
    this.productsString = this.cart.products.split(";");
    console.log(this.productsString);
    for(let i = 0; i < this.productsString.length; i++) {
      this.ids[i] = Number(this.productsString[i].split(',')[0]);
      console.log(this.ids[i]);
      this.productService.getProductById(this.ids[i]).subscribe(res => {
        this.products[i] = res;
      }).unsubscribe();
    }
    console.log(this.products);
  }

  getProductData(prod: Product) {
    this.productService.getProductById(prod.id).subscribe(res => {
      this.curProduct = res;
    }).unsubscribe();
    if(this.curProduct != null) return this.curProduct;
    return null;
  }

  getProductImage(prod: Product) {
    let preview;
    if(this.getProductData(prod) != null)
      { // @ts-ignore
        preview = this.getProductData(prod).imageUrls.split(",")[0];
        return preview;
      }
    return null;
  }





  saveCart() {
    //this.cartService.saveCart()
  }
}
