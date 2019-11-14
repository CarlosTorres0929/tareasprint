/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flotavehi.backflotavehi;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Carlos Torres
 */
@Service

public class TipoVehiServiceRepoImplements implements TipoVehiService{
    
   // Implementar metodos de la clase TipoVehiService y TipoVehiSerciveRepositorio 
    
    // con la anotacion@Autowired se crea una variable de tipo repositorio para poder utilizar metodos de la interface TipoVehiRepositorio
    @Autowired
    private TipoVehiServiceRepositorio repositorio;
    
    @Override
    public List<TipoVehi> listar(){
        return repositorio.findAll();
    }
    
    @Override
    public TipoVehi listarId(int idtv){
        return repositorio.findOne(idtv);
    }
    
    
    @Override
    public TipoVehi add(TipoVehi tv){
        return repositorio.save(tv);
    }
    
    
    @Override
    public TipoVehi edit(TipoVehi tv){
        return repositorio.save(tv);
    }
    
    
    @Override
    public TipoVehi delete(int idtv){
        TipoVehi tv = repositorio.findOne(idtv);
        
        if(tv != null){
                repositorio.delete(tv);
        }
            return tv;
        
       
    }
    
}
