/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.analistas.projectpdv.model.service;

import com.analistas.projectpdv.model.entities.Venta;
import java.util.List;

/**
 *
 * @author Micholini
 */
public interface IVentaService {    
    
    public List<Venta> listarTodo();
    
    public Venta buscarPorId(long id);
    
    public void guardar(Venta venta);
    
}
