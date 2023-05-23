import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductsComponent } from './products/products.component';
import { BynameComponent } from './byname/byname.component';
import { ByplaceComponent } from './byplace/byplace.component';
import { WarrantyComponent } from './warranty/warranty.component';

@NgModule({
  declarations: [
    AppComponent,
    ProductsComponent,
    BynameComponent,
    ByplaceComponent,
    WarrantyComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule 
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
