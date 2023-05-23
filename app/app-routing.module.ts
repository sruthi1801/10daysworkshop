import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BynameComponent } from './byname/byname.component';
import { ProductsComponent } from './products/products.component';
import { ByplaceComponent } from './byplace/byplace.component';
import { WarrantyComponent } from './warranty/warranty.component';

const routes: Routes = [
  
  {path:'',component:ProductsComponent},
  {path:'find/:name',component:BynameComponent},
  {path:'get/:place',component:ByplaceComponent},
  {path:'warranty',component:WarrantyComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
