/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.analistas.projectpdv.controller;

import com.analistas.projectpdv.model.entities.LineaVenta;
import com.analistas.projectpdv.model.entities.Producto;
import com.analistas.projectpdv.model.entities.Venta;
import com.analistas.projectpdv.model.service.IClienteService;
import com.analistas.projectpdv.model.service.IProductoService;
import com.analistas.projectpdv.model.service.IVentaService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    
    @Autowired
    IVentaService ventaService;
    
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
    
    @PostMapping("/guardar")
    public String guardarVenta(
            @Valid Venta venta,
            BindingResult result,
            @RequestParam(name = "item_id[]", required = true) List<String> itemId,
            @RequestParam(name = "cantidad[]", required = true) List<String> cantidad,
            Model model, RedirectAttributes flash, SessionStatus status
    ){
        
        //Verificarción de errores
        if(result.hasErrors()) {
            model.addAttribute("error", "Corrija los errores");
            return "ventas/form";
        }
        
        if(itemId == null || itemId.size() == 1){
            model.addAttribute("warning", "Añadir productos");
            return "ventas/form";
        }
        
        //si no hay errores
        LineaVenta linea;
        Producto producto;
        
        for(int i = 1; i < itemId.size(); i++){
            linea = new LineaVenta();
            Long id = Long.parseLong(itemId.get(i));
            producto = productoService.buscarPorId(id);
            
            linea.setProducto(producto);
            linea.setCantidad(Integer.parseInt(cantidad.get(i)));
            
            venta.addLineaVenta(linea);
        }
        
        //guardar venta
        ventaService.guardar(venta);
        status.setComplete();
        flash.addFlashAttribute("success", "Venta registrada");
        
        return"redirect:/ventas/nueva";
    }
    
    @GetMapping(value = "/buscar-productos/{criterio}", produces = { "application/json" })
    public @ResponseBody List<Producto> listaProductos(@PathVariable("criterio") String criterio){
    
        return productoService.buscarPor(criterio);
    }
    
}
