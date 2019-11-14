package com.flotavehi.backflotavehi;

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

/**
 *
 * @author Carlos Torres
 */

// Referencia al proyecto Front-end
@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/backflotavehi"})
public class TipoVehiControlador {
    
    // Se hara referencia al proyecto front-end brindandole los servicios
    
    @Autowired
    TipoVehiService service;
    
    @GetMapping
    public List<TipoVehi>listar(){
        return service.listar();
    }
    
    @PostMapping
    // La anotacion @RequestBody deserializa el json
    public TipoVehi agregar(@RequestBody TipoVehi tv){
        return service.add(tv);
    }
    
    @GetMapping(path = {"/{idtv}"})
    public TipoVehi listarId(@PathVariable("idtv")int idtv){
        return service.listarId(idtv);
    }
    
    @PutMapping(path = {"/{idtv}"})
    public TipoVehi editar(@RequestBody TipoVehi tv, @PathVariable("idtv")int idtv){
        tv.setIdtv(idtv);
        return service.edit(tv);
    }
    
    @DeleteMapping(path = {"/{idtv}"})
    public TipoVehi delete(@PathVariable("idtv")int idtv){
        return service.delete(idtv);
    }
    
}
