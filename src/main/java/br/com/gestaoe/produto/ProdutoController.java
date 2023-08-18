/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gestaoe.produto;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.gestaoe.arch.controller.AbstractSimpleController;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController 
        extends AbstractSimpleController<Produto, Long, ProdutoDto, ProdutoForm, 
        ProdutoRepository, ProdutoService>  {

    @Autowired
    @Override
    public void setService(ProdutoService service) {
        super.service = service;
        super.setMapper(ProdutoMapper.INSTANCE);
    }

    @Override
    public URI createUri(Produto entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/api/produto/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }
}