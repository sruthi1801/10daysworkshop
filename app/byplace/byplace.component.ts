import { Component } from '@angular/core';
import { Products } from '../products';
import { ActivatedRoute } from '@angular/router';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-byplace',
  templateUrl: './byplace.component.html',
  styleUrls: ['./byplace.component.css']
})
export class ByplaceComponent {
  place:string;
  product:Products[];
  
  constructor(private p:ProductService,private route: ActivatedRoute){}
  
  ngOnInit():void{
    this.place = this.route.snapshot.params['place'];
    //this.product=new Products();
    this.p.getProductbyplace(this.place).subscribe(data=>{
      this.product=data;
      //console.log(this.place);
     
    })
    
  }
}
