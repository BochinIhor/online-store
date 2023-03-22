import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Product} from "../../entity/product";

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private serviceUrl: string = "http://localhost:8080/api/store/products";

  constructor(private _httpClient: HttpClient) { }

  getAllProducts(): Observable<Product[]> {
    return this._httpClient.get<Product[]>(this.serviceUrl);
  }

  saveProduct(product: Product): Observable<Product> {
    return this._httpClient.post<Product>(this.serviceUrl, product);
  }

  getProductById(id: number): Observable<Product> {
    return this._httpClient.get<Product>(`${this.serviceUrl}/${id}`);
  }

  deleteProduct(id: number): Observable<any> {
    return this._httpClient.delete<Product>(`${this.serviceUrl}/${id}`);
  }
}
