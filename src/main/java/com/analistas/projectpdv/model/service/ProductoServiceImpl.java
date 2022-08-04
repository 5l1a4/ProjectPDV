/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.analistas.projectpdv.model.service;

import com.analistas.projectpdv.model.entities.Producto;
import com.analistas.projectpdv.model.repository.IProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Micholini
 */
@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    IProductoRepository productoRepo;
    
    @Override
    @Transactional(readOnly = true)
    public List<Producto> buscarTodos() {
        return productoRepo.findAll();
    }

    @Override
    public Producto buscarPor(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producto buscarPorId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional(readOnly = false)
    public void guardar(Producto producto) {
        productoRepo.save(producto);
    }

    @Override
    public void borrarPorId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
