/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.analistas.projectpdv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author Micholini
 */
@Controller
@RequestMapping("/clientes")
@SessionAttributes({"cliente"})
public class ClienteController {
    
    @GetMapping("/listado")
    public String listarClientes(){

        return "clientes/list";
    }
    
}
