// Author: Carlos Torres <ct059489@gmail.com>
import { Component, OnInit } from '@angular/core';
import { vehiculo } from 'src/app/Modelo/vehiculo';
import { ServiceService } from '../../Service/service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-listar',
  templateUrl: './listar.componentv.html',
  styleUrls: ['./listar.componentv.css']
})
export class ListarComponent implements OnInit {

  vehiculos:vehiculo[];
  constructor(private service:ServiceService, private router:Router) { }

  ngOnInit() {
    this.service.getvehiculos()
    .subscribe(
      data=>{
        this.vehiculos=data;
      }
    )
  }

  Editar(vehiculo:vehiculo):void{
    localStorage.setItem("placa",vehiculo.placa.toString());  //Enviando el id de la fila seleccionada
    //Luego debe navegar hacia el formulario edit; el cual esta como uno de los path en el archivo
    //app-routing-module
    this.router.navigate(['edit']);  //si se desea ir a la aplicacion y en el listado precionar el boton 
    // editar de alguno de los registros. Debe mostrar el formulario para editar pero aun vacio
    //Luego ir al archivo edit.component.ts. para crear el metodo editar el cual recibe el id a actualizar
  }

  Delete(vehiculo:vehiculo){
    this.service.deletevehiculo(vehiculo)
    .subscribe(data=>{
      this.vehiculos=this.vehiculos.filter(tv=>tv!==vehiculo);
      alert("Usuario eliminado...");
    })
  }
}
