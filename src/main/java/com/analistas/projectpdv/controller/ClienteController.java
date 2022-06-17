/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.analistas.projectpdv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Micholini
 */
@Controller
@RequestMapping("/clientes")
public class ClienteController {
    
    @GetMapping("/listado")
    public String listClientes(Model model){

        model.addAttribute("clienteAct", true);
        return "clientes/list";
    }
    
}
