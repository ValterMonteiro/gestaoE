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

import br.com.gestaoe.dto.ItemProdutoVendaDto;
import br.com.gestaoe.entities.ItemProdutoVenda;
import br.com.gestaoe.repositories.ItemProdutoVendaRepository;
import br.com.gestaoe.service.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;


@Service
public class ItemProdutoVendaService {

    @Autowired
    private ItemProdutoVendaRepository repository;
    
    @Transactional(readOnly = true)
	public List<ItemProdutoVendaDto> findAll(){
		
		List<ItemProdutoVenda> lista = repository.findAll();
		return lista.stream().map(x -> new ItemProdutoVendaDto(x)).collect(Collectors.toList());
	}
    
    
	@Transactional(readOnly = true)
	public ItemProdutoVendaDto findById(Long id) {
		Optional<ItemProdutoVenda> obj = repository.findById(id);
		ItemProdutoVenda entity = obj.orElseThrow(
					()-> new ResourceNotFoundException("O registro solicitado não foi encontrado!")
				);
		return  new ItemProdutoVendaDto(entity);
	}

	
	@Transactional
	public ItemProdutoVendaDto insert(ItemProdutoVendaDto dto) {
		
		//Conversão de DTO para Entidade
		ItemProdutoVenda entity = new ItemProdutoVenda();
		entity.setId(dto.getId());
		entity.setProduto(dto.getProduto());
		entity.setSaidaQuantidade(dto.getSaidaQuantidade());
		entity.setPrecoVenda(dto.getPrecoVenda());
		entity.setVenda(dto.getVenda());
		
		entity = repository.save(entity);
		
		return new ItemProdutoVendaDto(entity);
	}
	
	@Transactional
	public ItemProdutoVendaDto update(Long id, ItemProdutoVendaDto dto) {
		
		try {
			ItemProdutoVenda entity = repository.getReferenceById(id);
			entity.setId(dto.getId());
			entity.setProduto(dto.getProduto());
			entity.setSaidaQuantidade(dto.getSaidaQuantidade());
			entity.setPrecoVenda(dto.getPrecoVenda());
			entity.setVenda(dto.getVenda());
			
			entity = repository.save(entity);
			
			return new ItemProdutoVendaDto(entity);
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