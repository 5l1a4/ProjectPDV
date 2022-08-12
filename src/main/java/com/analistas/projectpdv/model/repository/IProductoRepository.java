/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.analistas.projectpdv.model.repository;

import com.analistas.projectpdv.model.entities.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Micholini
 */
public interface IProductoRepository extends JpaRepository<Producto, Long> {
    
    //En SQL:
    // select * from productos where cod_bat like ? or descripcion like ?
    // where act = 1
    @Query("select p from Producto p where p.codigoBarras like %:criterio% or p.descripcion like %:criterio%"
            + " and p.activo = true")
    List<Producto> buscarPorCriterio(@Param("criterio") String criterio);
 
}
                    