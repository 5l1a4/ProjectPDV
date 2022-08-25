/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.analistas.projectpdv.controller;

import com.analistas.projectpdv.model.entities.Producto;
import com.analistas.projectpdv.model.entities.Venta;
import com.analistas.projectpdv.model.service.IClienteService;
import com.analistas.projectpdv.model.service.IProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author Micholini
 */
@Controller
@RequestMapping("/ventas")
@SessionAttributes({"venta"})
public class VentaController {
    
    @Autowired
    IClienteService clienteService;
    
    @Autowired
    IProductoService productoService;
    
    @GetMapping("/listado")
    public String listarVentas(){
        
        return"ventas/list";
    }
    
    @GetMapping("/nueva")
    public String nuevaVenta(Model model){
    
        Venta venta = new Venta();
        
        model.addAttribute("venta", venta);
        model.addAttribute("clientes", clienteService.buscarTodos());
        
        return"ventas/form";
    }
    
    @GetMapping(value = "/buscar-productos/{criterio}", produces = { "application/json" })
    public @ResponseBody List<Producto> listaProductos(@PathVariable("criterio") String criterio){
    
        return productoService.buscarPor(criterio);
    }
    
}
