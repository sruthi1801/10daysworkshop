import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Products } from '../products';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-byname',
  templateUrl: './byname.component.html',
  styleUrls: ['./byname.component.css']
})
export class BynameComponent {


name:string;
product:Products[];

constructor(private p:ProductService,private route: ActivatedRoute){}

ngOnInit():void{
  this.name = this.route.snapshot.params['name'];
  //this.product=new Products();
  this.p.getProductbyname(this.name).subscribe(data=>{
    this.product=data;
    //console.log(this.place);
   
  })
  
}
 
}
