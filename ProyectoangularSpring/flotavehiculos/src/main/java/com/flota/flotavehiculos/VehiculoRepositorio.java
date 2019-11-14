// Carlos Torres
package com.flota.flotavehiculos;

import java.util.List;
import org.springframework.data.repository.Repository;

public interface VehiculoRepositorio extends Repository<Vehiculo, Integer>{
    //Declarar todos los metodos que se utilizaran
    //se crean con los nombres que recomienda spring
    List<Vehiculo>findAll();
    Vehiculo findOne(String placa);
    Vehiculo save(Vehiculo v);
    void delete(Vehiculo v);
}
