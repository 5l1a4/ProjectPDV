/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.analistas.projectpdv.model.repository;

import com.analistas.projectpdv.model.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Micholini
 */
public interface IProductoRepository extends JpaRepository<Producto, Long> {
    
}
                    