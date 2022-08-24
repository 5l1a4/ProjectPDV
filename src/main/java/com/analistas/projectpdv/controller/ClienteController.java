/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.analistas.projectpdv.controller;

import com.analistas.projectpdv.model.entities.Cliente;
import com.analistas.projectpdv.model.service.IClienteService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/clientes")
@SessionAttributes({"cliente"})
public class ClienteController {

    @Autowired
    IClienteService clienteService;

    @GetMapping("/listado")
    public String listarClientes(Model model) {

        model.addAttribute("clientes", clienteService.buscarTodos());
        return "clientes/list";
    }

    @GetMapping("/nuevo")
    public String nuevoCliente(Model model) {

        model.addAttribute("cliente", new Cliente());
        return "clientes/form";
    }

    @PostMapping("/form")
    public String guardarCliente(@Valid Cliente cliente, BindingResult result,
            Model model, RedirectAttributes redirect) {

       //verificación de Errores
        if(result.hasErrors()){
            model.addAttribute("danger", "Datos erroneos");
            return "clientes/form";
        }
        
        if(cliente.getId() == null || cliente.getId() == 0){
            redirect.addFlashAttribute("success", "Cliente añadido con exito");
        }else{
            redirect.addFlashAttribute("warning", "Cliente modificado correctamente");
        }
        clienteService.guardar(cliente);
        return "redirect:/clientes/listado";
    }

    @GetMapping("/del/{id}")
    public String borrarCliente(@PathVariable("id") long id, Model model, RedirectAttributes redirect) {

        Cliente cliente = (Cliente) clienteService.buscarPorId(id);
        
        redirect.addFlashAttribute("danger", "Borrado con Exito");
        clienteService.borrarPorId(id);
        return "redirect:/clientes/listado";
    }

    @GetMapping("/editar/{id}")
    public String editarCliente(@PathVariable("id") long id, Model model) {

        Cliente cliente = (Cliente) clienteService.buscarPorId(id);

        model.addAttribute("cliente", cliente);
        return "clientes/form";
    }

}
