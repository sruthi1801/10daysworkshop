import { Component } from '@angular/core';
import { Products } from '../products';
import { ProductService } from '../product.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-warranty',
  templateUrl: './warranty.component.html',
  styleUrls: ['./warranty.component.css']
})
export class WarrantyComponent {
  product:Products[];
  constructor(private p:ProductService,private router:Router){}
  
  ngOnInit():void{
    this.getAllProducts();
    //const urlParams = new URLSearchParams(this.urll);
  
  }
  private getAllProducts() {
      //throw new Error('Method not implemented.');
  
      this.p.getoutofwarranty().subscribe(data =>{
        this.product=data;
        
      })
    }
}
