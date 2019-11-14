// Carlos Torres

package com.flota.flotavehiculos;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Desde el controlador se hara referencia al proyecto front-end
@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/Vehiculo"})


public class VehiculoControlador {
    //agregar las anotaciones respectivas
    //Desde aca se hara referencia al proyecto front-end, brindandole todo el servicio que solicite
    @Autowired
    VehiculoService service;
    
    //Anotacion para listar los  vehiculo
    @GetMapping
    public List<Vehiculo>listar(){
        return service.listar();
    }
    

    @PostMapping
    public Vehiculo agregar(@RequestBody Vehiculo v){
       return service.add(v);       
    }
       
    @GetMapping(path = {"/{placa}"})
    public Vehiculo listarId(@PathVariable("placa")String placa){
        return service.listarId(placa);
    }
    @PutMapping(path = {"/{placa}"})
    public Vehiculo editar(@RequestBody Vehiculo v,@PathVariable("placa") String placa){
        v.setIdtv(placa);
        return service.edit(v);
    }
    @DeleteMapping(path = {"/{placa}"})
    public Vehiculo delete(@PathVariable("placa") String  placa){
        return service.delete(placa);
    }
}
