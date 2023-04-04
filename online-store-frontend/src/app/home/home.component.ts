import { Component } from '@angular/core';
import {ProductService} from "../services/product/product.service";
import {Router} from "@angular/router";
import {Product} from "../entity/product";
import {MatDialog, MatDialogConfig} from "@angular/material/dialog";
import {CartComponent} from "../cart/cart.component";

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent {
  product = new Product();
  previewImg!: string;
  products: Product[] = [];
  currentUser = sessionStorage.getItem('username');

  constructor(private productService: ProductService,
              private dialog: MatDialog,
              private _router: Router) {}

  filters = {
    keyword: '',
    sortBy: 'Name'
  }

  ngOnInit(): void {
    this.getProducts();
  }

  getProducts(): void {
    this.productService.getAllProducts().subscribe(productsData => {
      this.products = this.filterProducts(productsData);
    });
  }

  filterProducts(products: Product[]) {
    return products.filter(e =>{
      return e.name.toLowerCase().includes(this.filters.keyword.toLowerCase());
      // @ts-ignore
    }).sort((a, b) => {
      if(this.filters.sortBy === 'Назва') {
        return a.name.toLowerCase() < b.name.toLowerCase() ? -1:1;
      }else if(this.filters.sortBy === 'Від дешевих до дорогих') {
        return a.price < b.price ? -1: 1;
      }else if(this.filters.sortBy === 'Від дорогих до дешевих') {
        return b.price < a.price ? -1: 1;
      }
    })
  }

  getProductImage(product: Product, num: number): string {
    if(num == 1) this.previewImg = product.imageUrls.split(',')[0];
    if(num == 2) this.previewImg = product.imageUrls.split(',')[1];
    return this.previewImg;
  }

  goToProduct(id: number) {
    console.log("chosen product is " + id);
  }

  addToCart(product: Product) {
    if(this.currentUser == null) this._router.navigateByUrl("/login");
    else {
      this.openDialog(product);
    }
  }

  openDialog(product: Product) {
    const dialogConfig = new MatDialogConfig();
    dialogConfig.enterAnimationDuration = '500ms';
    dialogConfig.exitAnimationDuration = '500ms';
    dialogConfig.width = '70%';
    dialogConfig.height = '80%';
    dialogConfig.data = {
      productName: product.name
    };

    const updateDialog = this.dialog.open(CartComponent, dialogConfig);

    updateDialog.afterClosed().subscribe(result => {
    });

    const dialogSubmitSubscription =
      updateDialog.componentInstance.submitClicked.subscribe(() => {
        dialogSubmitSubscription.unsubscribe();
      });
  }

}
