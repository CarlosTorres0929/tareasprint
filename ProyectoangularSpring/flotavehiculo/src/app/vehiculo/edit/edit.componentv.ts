// Author: Carlos Torres <ct059489@gmail.com>
import { Component, OnInit } from '@angular/core';
import { vehiculo } from 'src/app/Modelo/vehiculo';
import { Router } from '@angular/router';
import { ServiceService } from 'src/app/Service/service.service';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.componentv.html',
  styleUrls: ['./edit.componentv.css']
})
export class EditComponent implements OnInit {

  vehiculo :vehiculo=new vehiculo();
  constructor(private router:Router, private service:ServiceService) { }

  ngOnInit() {
    this.Editar();
  }

  //Metodo para editar el id recibido
  Editar(){
    let placa=localStorage.getItem("placa"); //la placa viene del archivo listar.component.ts

    //actualizar sus datos
    this.service.getvehiculoId(+placa)
    .subscribe(data=>{
      this.vehiculo=data;
    })
  }

  //Metodo para actualizar(guardar) los cambios
  Actualizar(vehiculo:vehiculo){
    this.service.updatevehiculo(vehiculo)
    .subscribe(data=>{
      this.vehiculo=data;
      alert("Vehiculo Actualizado");
      this.router.navigate(["listar"]);
    })
  }
}
