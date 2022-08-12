/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.analistas.projectpdv.model.service;

import com.analistas.projectpdv.model.entities.Producto;
import java.util.List;

/**
 *
 * @author Micholini
 */
public interface IProductoService {
    
    public List<Producto> buscarTodos();
    
    public List<Producto> buscarPor(String criterio);
    
    public Producto buscarPorId(Long id);
    
    public void guardar(Producto producto);
    
    public void borrarPorId(Long id);
}
