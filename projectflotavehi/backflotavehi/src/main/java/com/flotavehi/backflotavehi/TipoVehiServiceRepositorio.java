
package com.flotavehi.backflotavehi;

import java.util.List;

/**
 *
 * @author Carlos Torres Montoya
 */
public interface TipoVehiServiceRepositorio {

    // declarar los metodos como es con sprint
    TipoVehi save(TipoVehi tv);
    List<TipoVehi>findAll();
    TipoVehi findOne(int idtv);
    void delete(TipoVehi tv);
    
    
    
    
    
}
