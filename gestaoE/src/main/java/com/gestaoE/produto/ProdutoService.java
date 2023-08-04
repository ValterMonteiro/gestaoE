/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoE.produto;

import com.gestaoE.arch.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 07041626105
 */
@Service
public class ProdutoService 
        extends AbstractService<Produto, Long, ProdutoForm, ProdutoRepository> {

    @Autowired
    @Override
    public void setRepository(ProdutoRepository repository) {
        super.repository = repository;
        super.setMapper(ProdutoMapper.INSTANCE);
    }
    
    
}