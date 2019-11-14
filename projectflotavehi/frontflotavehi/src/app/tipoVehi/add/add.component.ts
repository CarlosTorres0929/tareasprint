import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from 'src/app/Service/service.service';
import { tipovehiculo } from 'src/app/Modelo/tipovehiculo';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {
  //Crear instancia del modelo
  Tipovehiculo:tipovehiculo=new tipovehiculo();

  //Crear parametros router y service en el constructor

  constructor(private router:Router, private service:ServiceService) { }

  ngOnInit() {
  }

  //Metodo guardar que utiliza el metodo createTipovehiculos de la class ServiceService
  Guardar(){
    this.service.createTipovehiculos(this.Tipovehiculo)
    .subscribe(data=>{
      alert("Tipo vehículo Registrado");
      //Luego navegar hacia el componente listar
      this.router.navigate(["listar"]);
    })
  }

}
