/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.analistas.projectpdv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Micholini
 */

@Controller
public class HomeController {
    
    
    @GetMapping({"/", "/home"})
    public String home(Model model){
        
        model.addAttribute("homeAct", true);
        return "home";
    }
}
