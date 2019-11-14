import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { tipovehiculo } from '../Modelo/tipovehiculo';

// @Injectable({
//   providedIn: 'root'
// })
@Injectable()
export class ServiceService {

  constructor(private http:HttpClient) { }
  //Url del proyecto back
  Url='http://localhost:81/gestionvehiculos';

  //Metodo para listar los tv desde el project back
  getTipovehiculos(){
    return this.http.get<Tipovehiculo[]>(this.Url);
  }
  //Metodo para listar los datos vehiculos desde el proyecto back mediante su Url con this.Url en el siguiente metodo (getvehiculos)
  getvehiculos(){
    return this.http.get<vehiculo[]>(this.Url);
  }
  // Metodo para guardar registros tipovehiculos. 
  createTipovehiculos(tipovehiculo:Tipovehiculo){
    return this.http.post<Tipovehiculo>(this.Url,tipovehiculo);
  }
   // Metodo para guardar registros vehiculos. 
   createvehiculos(vehiculo:vehiculo){
    return this.http.post<vehiculo>(this.Url,vehiculo);
  }
  //luego ir al archivo add.component.ts y crear el metodo Guardar()

  // Este metodo toma el id que se requiere actualizar tipovehiculos
  getTipovehiculoId(idtv:number){
    return this.http.get<Tipovehiculo>(this.Url+"/"+idtv);
  }

  // Este metodo toma el id que se requiere actualizar vehiculos
  getvehiculoId(placa:String){
    return this.http.get<vehiculo>(this.Url+"/"+placa);
  }
  // estes es el metodo para actualizar tipovehiculos
  updateTipovehiculo(tipovehiculo:Tipovehiculo){
    return this.http.put<Tipovehiculo>(this.Url+"/"+tipovehiculo.idtv,tipovehiculo);
  }

   // estes es el metodo para actualizar vehiculos
   updatevehiculo(vehiculo:vehiculo){
    return this.http.put<vehiculo>(this.Url+"/"+vehiculo.placa,vehiculo);
  }

  //Metodo para eliminar tipovehiculos
  deleteTipovehiculo(tipovehiculo:Tipovehiculo){
    return this.http.delete<Tipovehiculo>(this.Url+"/"+tipovehiculo.idtv);
  }

  //Metodo para eliminar vehiculos
  deletevehiculo(vehiculo:vehiculo){
    return this.http.delete<vehiculo>(this.Url+"/"+vehiculo.placa);
  }

  // Luego ir al archivo listar.component.ts para crear el metod Editar() que se invoca en el formulario del archivo listar.component.html
}