package edu.eci.cvds.sampleprj.dao.mybatis.mappers;


import java.util.Date;
import java.util.List;

import edu.eci.cvds.samples.entities.TipoItem;
import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.samples.entities.Item;

/**
 *
 * @author 2106913
 */
public interface ItemMapper {
    
    
    public List<Item> consultarItems();        
    
    public Item consultarItem(@Param("itid")int id);
    
    public void insertarItem(@Param("it") Item it);


    public List<Item> consultarItemsDisponibles();

    public TipoItem consultarTipoItem(@Param("id_item") int id);

    public void actualizarTarifa(@Param("id_item")int id, @Param("tarifa") long tarifa);
}
