// Carlos Torres 
package com.flota.flotavehiculos;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehiculoServiceImp implements VehiculoService{
    //Para agregar todos los metodos de esta interface. E implementar por ahora solo el de listar
    //Para ello se debe colocar las anotaciones correspondientes (@Service y @Autowired)
    //esta ultima anotacion para crear una variable de tipo repositorio para traer el metodo findAll() listar todo
    @Autowired
    private VehiculoRepositorio repositorio;
    
    @Override
    public List<Vehiculo> listar() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return repositorio.findAll();
    }

    @Override
    public Vehiculo listarId(String placa) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return repositorio.findOne(placa);
    }

    @Override
    public Vehiculo add(Vehiculo v) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return repositorio.save(v);
    }
    // Luego en el controlador crear el siguiente metodo mapeado
      // @PostMapping
      // public Tipovehiculo agregar(@RequestBody Tipovehiculo tv){
      //   return service.add(tv);
      // }

    @Override
    public Vehiculo edit(Vehiculo v) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return repositorio.save(v);
    }

    @Override
    public Vehiculo delete(String placa) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Vehiculo v = repositorio.findOne(placa);
        if(v != null){
            repositorio.delete(v);
        }
        return v;
    }
        
}
