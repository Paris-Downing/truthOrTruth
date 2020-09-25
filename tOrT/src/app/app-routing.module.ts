import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import {CategoryComponent} from './category/category.component';
import { HomeComponent } from './home/home.component';


const routes: Routes = [
  { path: 'category', component: CategoryComponent },
  { path: '**', redirectTo: '', component: HomeComponent, pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
