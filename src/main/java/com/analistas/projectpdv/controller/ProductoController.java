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
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author Micholini
 */
@Controller
@RequestMapping("/productos")
@SessionAttributes({"producto"})
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
    public String guardarProducto(Model model, Producto producto, 
            BindingResult result, RedirectAttributes flash, SessionStatus status){
    
        if(result.hasErrors()){
            flash.addAttribute("error", "Error Existente");
            
            model.addAttribute("error", "Debes Completar el Formulario");
            return "articulos/form";
        }
        
        productoService.guardar(producto);
        return"redirect:/productos/listado";
    }
    
    @GetMapping("/del/{id}")
    public String borrarProducto(@PathVariable("id") long id, Model model, RedirectAttributes redirect){
                
        Producto producto = (Producto) productoService.buscarPorId(id);
        
        productoService.borrarPorId(id);
        
        return"redirect:/productos/listado";
    }
   
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable("id") long id, Model model, RedirectAttributes redirect){
    
//        Producto producto = (Producto) productoService.buscarPorId(id);
          model.addAttribute("newPro", "Modificar Producto");
          model.addAttribute("producto", productoService.buscarPorId(id));
        
//        model.addAttribute("producto", producto);
                    
        return "productos/form";
    }
}
