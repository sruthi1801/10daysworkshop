import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Products } from './products';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
private baseURL="http://localhost:8081/product";
private baseURL1="http://localhost:8081/product/get";
private baseURL2="http://localhost:8081/product/save";
private baseURL3="http://localhost:8081/product/warranty";
  constructor(private httpClient: HttpClient) { }
  getEmployeesList(): Observable<Products[]>{
    return this.httpClient.get<Products[]>(`${this.baseURL1}`);
  }
  createProduct(product:Products) :Observable<object>{
    return this.httpClient.post(`${this.baseURL2}`,product);
  }
  getProductbyplace(place:string) :Observable<Products[]>{
    return this.httpClient.get<Products[]>(`${this.baseURL}/${place}`);
  }

  getProductbyname(name:string) :Observable<Products[]>{
    return this.httpClient.get<Products[]>(`${this.baseURL1}/${name}`);
  }
  getoutofwarranty() :Observable<Products[]>{
    return this.httpClient.get<Products[]>(`${this.baseURL3}`);
  }



}
