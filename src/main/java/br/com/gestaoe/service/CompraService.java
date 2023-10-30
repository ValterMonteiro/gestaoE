/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gestaoe.compra;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CompraService {

    @Autowired
    private CompraRepository repository;
    
    @Transactional(readOnly = true)
	public List<CompraDto> findAll(){
		List<Compra> lista = repository.findAll();
		return lista.stream().map(x -> new CompraDto(x)).collect(Collectors.toList());
	}
    
    
    @Transactional(readOnly = true)
	public CompraDto findById(Long id) {
		Optional<Compra> obj = repository.findById(id);
		
		Compra entity = obj.orElseThrow(() -> new ResourceNotFoundException("O registro solicitado não foi localizado."));
		return new CompraDto(entity);		
	}

	@Transactional
	public CompraDto insert(CompraDto dto) {
		Compra entity = new Compra();
		
		entity.setFuncionario(dto.getFuncionario());
		entity.setFornecedor(dto.getFornecedor());
		entity.setData(dto.getData());
		entity.setNfeCompra(dto.getNfeCompra()); 
		
		
		entity = repository.save(entity);

		return new CompraDto(entity);
	}

	@Transactional
	public CompraDto update(Long id, CompraDto dto) {
		
		try {
			Compra entity = repository.getReferenceById(id);
			
			entity.setFuncionario(dto.getFuncionario());
			entity.setFornecedor(dto.getFornecedor());
			entity.setData(dto.getData());
			entity.setNfeCompra(dto.getNfeCompra()); 
			
			entity = repository.save(entity);
	
			return new CompraDto(entity);
		} catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException(
					"O recurso com o ID "+id+" não foi localizado");
		}
	}

	public void delete(Long id) {
		try {
		if(repository.existsById(id)) {
			repository.deleteById(id);
		}
		}catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("O registro solicitado não foi localizado.");
		}
	}
     
}