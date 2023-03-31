/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.analistas.projectpdv.controller;

import com.analistas.projectpdv.model.entities.Producto;
import com.analistas.projectpdv.model.service.IProductoService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
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
    public ResponseEntity<?> nuevoProducto(Model model){
    
        Producto producto = new Producto();
        return ResponseEntity.ok(producto);
        
    }
    
    @PostMapping("/form")
    public ResponseEntity<?> guardarProducto(@Valid Producto producto, BindingResult result,
            Model model, RedirectAttributes redirect ) {    
        
        productoService.guardar(producto);
        return ResponseEntity.ok().build();
    }


    @GetMapping("/del/{id}")
    public String borrarProducto(@PathVariable("id") long id, Model model, RedirectAttributes redirect){
                
        Producto producto = (Producto) productoService.buscarPorId(id);
        
        redirect.addFlashAttribute("danger", "Borrado con exito");
        productoService.borrarPorId(id);
        
        return"redirect:/productos/listado";
    }
   
    @GetMapping("/editar/{id}")
    public String editarProducto(@PathVariable("id") long id, Model model, RedirectAttributes redirect){
            
        Producto producto = (Producto) productoService.buscarPorId(id);
        
        model.addAttribute("producto", producto);          
        return "productos/form";
    }
    
    @GetMapping("/activo/{id}")
    public String activo(@PathVariable("id") Long id) {

        Producto p = productoService.buscarPorId(id);
        p.setActivo(!p.isActivo());
        productoService.guardar(p);

        return "redirect:/productos/listado";
    }
}
