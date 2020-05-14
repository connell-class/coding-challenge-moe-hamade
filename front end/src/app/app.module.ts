import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GroceryListComponent } from './grocery-list/grocery-list.component';
import { GroceryItemComponent } from './grocery-item/grocery-item.component';

@NgModule({
  declarations: [
    AppComponent,
    GroceryListComponent,
    GroceryItemComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
