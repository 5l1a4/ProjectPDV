/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.analistas.projectpdv.model.service;

import com.analistas.projectpdv.model.entities.Cliente;
import com.analistas.projectpdv.model.repository.IClienteRespository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Micholini
 */
@Service
public class ClienteServiceImpl implements IClienteService{

    @Autowired
    IClienteRespository clienteRepo;
    
    @Override
    @Transactional(readOnly = true)
    public List<Cliente> buscarTodos() {
        return clienteRepo.findAll();
    }

    @Override
    public List<Cliente> BuscarPor(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return clienteRepo.findById(id).orElse(null);
    }

    @Override
    public void guardar(Cliente cliente) {
        clienteRepo.save(cliente);
    }

    @Override
    public void borrarPorId(Long id) {
        clienteRepo.deleteById(id);
    }
    
}
