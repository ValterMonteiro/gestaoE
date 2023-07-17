/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoE.itemProdutoCompra;


import br.edu.ifms.arch.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 07041626105
 */
@Service
public class ItemProdutoCompraService 
        extends AbstractService<ItemProdutoCompra, Long, ItemProdutoCompraForm, 
        ItemProdutoCompraRepository> {

    @Autowired
    @Override
    public void setRepository(ItemProdutoCompraRepository repository) {
        super.repository = repository;
        super.setMapper(ItemProdutoCompraMapper.INSTANCE);
    }
    
    
}