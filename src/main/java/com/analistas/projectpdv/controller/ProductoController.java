/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.analistas.projectpdv.controller;

import com.analistas.projectpdv.model.entities.Producto;
import com.analistas.projectpdv.model.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Micholini
 */
@Controller
@RequestMapping("/productos")
public class ProductoController {
    
    @Autowired
    IProductoService productoService;
    
    @GetMapping("/listado")
    public String listarProductos(Model model){
    
        model.addAttribute("productos", productoService.buscarTodos());
        
        return "productos/list";
    }
    
    @GetMapping("/nuevo")
    public String nuevoProducto(Model model){
    
    
        model.addAttribute("producto", new Producto());
        return"productos/form";
    }
    
    @PostMapping("/form")
    public String guardarProducto(Model model, Producto producto){
    
        productoService.guardar(producto);
        return"redirect:/productos/listado";
    }
}
