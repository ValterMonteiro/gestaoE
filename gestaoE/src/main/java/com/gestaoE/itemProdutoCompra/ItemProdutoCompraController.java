/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoE.itemProdutoCompra;

import br.edu.ifms.arch.controller.AbstractSimpleController;
import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author valti
 */
@RestController
@RequestMapping("/api/itemProdutoCompra")
public class ItemProdutoCompraController 
        extends AbstractSimpleController<ItemProdutoCompra, Long, ItemProdutoCompraDto, 
        ItemProdutoCompraForm, ItemProdutoCompraRepository, ItemProdutoCompraService>  {

    @Autowired
    @Override
    public void setService(ItemProdutoCompraService service) {
        super.service = service;
        super.setMapper(ItemProdutoCompraMapper.INSTANCE);
    }

    @Override
    public URI createUri(ItemProdutoCompra entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/api/itemProdutoCompra/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }
}