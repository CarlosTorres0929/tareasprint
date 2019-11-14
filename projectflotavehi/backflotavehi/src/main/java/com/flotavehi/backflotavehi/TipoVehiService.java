
package com.flotavehi.backflotavehi;

import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author carlos torres
 */
public interface TipoVehiService extends Repository<TipoVehi, Integer>{
    
    // metodos para el crud

    TipoVehi add(TipoVehi tv);
    List<TipoVehi>listar();
    TipoVehi listarId(int idtv);
    TipoVehi edit(TipoVehi tv);
    TipoVehi delete(int idtv);
}
