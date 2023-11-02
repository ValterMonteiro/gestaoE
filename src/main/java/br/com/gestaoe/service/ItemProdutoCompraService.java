/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gestaoe.service;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.gestaoe.dto.ItemProdutoCompraDto;
import br.com.gestaoe.entities.ItemProdutoCompra;
import br.com.gestaoe.repositories.ItemProdutoCompraRepository;
import br.com.gestaoe.service.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;


@Service
public class ItemProdutoCompraService {

    @Autowired
    private ItemProdutoCompraRepository repository;
    
    @Transactional(readOnly = true)
	public List<ItemProdutoCompraDto> findAll(){
		
		List<ItemProdutoCompra> lista = repository.findAll();
		return lista.stream().map(x -> new ItemProdutoCompraDto(x)).collect(Collectors.toList());
	}
    
    
	@Transactional(readOnly = true)
	public ItemProdutoCompraDto findById(Long id) {
		Optional<ItemProdutoCompra> obj = repository.findById(id);
		ItemProdutoCompra entity = obj.orElseThrow(
					()-> new ResourceNotFoundException("O registro solicitado não foi encontrado!")
				);
		return  new ItemProdutoCompraDto(entity);
	}

	
	@Transactional
	public ItemProdutoCompraDto insert(ItemProdutoCompraDto dto) {
		
		//Conversão de DTO para Entidade
		ItemProdutoCompra entity = new ItemProdutoCompra();
		entity.setId(dto.getId());
		entity.setProduto(dto.getProduto());
		entity.setEntradaQuantidade(dto.getEntradaQuantidade());
		entity.setPrecoCusto(dto.getPrecoCusto());
		entity.setCompra(dto.getCompra());
		
		entity = repository.save(entity);
		
		return new ItemProdutoCompraDto(entity);
	}
	
	@Transactional
	public ItemProdutoCompraDto update(Long id, ItemProdutoCompraDto dto) {
		
		try {
			ItemProdutoCompra entity = repository.getReferenceById(id);
			entity.setId(dto.getId());
			entity.setProduto(dto.getProduto());
			entity.setEntradaQuantidade(dto.getEntradaQuantidade());
			entity.setPrecoCusto(dto.getPrecoCusto());
			entity.setCompra(dto.getCompra());
			
			entity = repository.save(entity);
			
			return new ItemProdutoCompraDto(entity);
		}catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException("O recurso com o ID "+id+" não foi localizado!");
		}
		
	}

	
	public void delete(Long id) {		
		
		try {
			repository.deleteById(id);
			
		}catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("O recurso com o ID "+id+" não foi localizado!");
		}
		
	}
	

}