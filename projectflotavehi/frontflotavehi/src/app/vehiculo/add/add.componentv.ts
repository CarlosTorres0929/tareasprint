// Author:  Carlos Torres <ct059489@gmail.com>

import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from 'src/app/Service/service.service';
import { vehiculo } from 'src/app/Modelo/vehiculo';

@Component({
  selector: 'app-add',
  templateUrl: './add.componentv.html',
  styleUrls: ['./add.componentv.css']
})
export class AddComponent implements OnInit {

  //Crear el objeto tipovehiculo
  vehiculo:vehiculo=new vehiculo();

  //Crear las variables router y service en el constructor
  constructor(private router:Router, private service:ServiceService) { }

  ngOnInit() {
  }

  // Metodo guardar que utiliza el metodo createTipovehiculos del archivo service
  // public idtv= { idtv: ''};
  // public nomtv= { nomtv: ''};  
  Guardar(){  
    this.service.createvehiculos(this.vehiculo)
    .subscribe(data=>{
      alert(" Vehiculo Guardado");
      this.router.navigate(["listar"]);   //navegar hacia el componente listar que esta enrrutado en el archivo app-routing
    })
  }
  

}


