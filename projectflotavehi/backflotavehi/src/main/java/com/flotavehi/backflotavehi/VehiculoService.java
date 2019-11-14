// Carlos Torres
package com.flota.flotavehiculos;

import java.util.List;

public interface VehiculoService {
    //Aqui estaran los metodos que se van a utilizar para el CRUD
    List<Vehiculo>listar();
    Vehiculo listarId(String placa);
    Vehiculo add(Vehiculo v);
    Vehiculo edit(Vehiculo v);
    Vehiculo delete(String Placa);
}
