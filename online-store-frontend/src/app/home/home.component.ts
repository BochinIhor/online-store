import { Component } from '@angular/core';
import {ProductService} from "../services/product/product.service";
import {Router} from "@angular/router";
import {Product} from "../entity/product";
import {Observable} from "rxjs";

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

  editExpense(id: number): void {
    this._router.navigateByUrl('/editexpense/' + id);
  }

  deleteExpense(id: number) {
    this.productService.deleteProduct(id).subscribe(
      data => {
        console.log("Product was deleted: " + data);
      });
    this.products = this.products.filter((product: Product) => product.id != id);
  }

  filterProducts(products: Product[]) {
    return products.filter(e =>{
      return e.name.toLowerCase().includes(this.filters.keyword.toLowerCase());
      // @ts-ignore
    }).sort((a, b) => {
      if(this.filters.sortBy === 'Name') {
        return a.name.toLowerCase() < b.name.toLowerCase() ? -1:1;
      }else if(this.filters.sortBy === 'Amount') {
        return a.price < b.price ? -1: 1;
      }
    })
  }

  getProductImage(id: number): string {
    this.productService.getProductById(id).subscribe(res => {
      this.product = res;
    })
    this.previewImg = this.product.imageUrls.split(',')[0];
    return this.previewImg;
  }

}
