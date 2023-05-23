import { Component } from '@angular/core';
import { Products } from '../products';
import { ProductService } from '../product.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent {
product:Products[];
constructor(private p:ProductService,private router:Router){}

ngOnInit():void{
  this.getAllProducts();
  //const urlParams = new URLSearchParams(this.urll);

}
private getAllProducts() {
    //throw new Error('Method not implemented.');

    this.p.getEmployeesList().subscribe(data =>{
      this.product=data;
      
    })
  }
}
