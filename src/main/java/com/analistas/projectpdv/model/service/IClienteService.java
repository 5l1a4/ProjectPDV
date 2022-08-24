/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.analistas.projectpdv.model.service;

import com.analistas.projectpdv.model.entities.Cliente;
import java.util.List;

/**
 *
 * @author Micholini
 */
public interface IClienteService {
    
    public List<Cliente> buscarTodos();
    
    public List<Cliente> buscarPor (String criterio);
    
    public Cliente buscarPorId(Long id);
    
    public void guardar(Cliente cliente);
    
    public void borrarPorId(Long id);
}
