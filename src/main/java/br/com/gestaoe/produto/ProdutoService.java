/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gestaoe.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gestaoe.arch.service.AbstractService;

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