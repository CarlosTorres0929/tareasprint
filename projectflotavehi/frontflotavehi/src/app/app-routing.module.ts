import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ListarComponent } from './tipoVehi/listar/listar.component';
import { AddComponent } from './tipoVehi/add/add.component';


const routes: Routes = [
  {path:'listar', component:ListarComponent},
  {path:'add', component:AddComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
