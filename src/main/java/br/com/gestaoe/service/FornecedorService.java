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

import br.com.gestaoe.dto.FornecedorDto;
import br.com.gestaoe.entities.Fornecedor;
import br.com.gestaoe.repositories.FornecedorRepository;
import br.com.gestaoe.service.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository repository;
    
    @Transactional(readOnly = true)
	public List<FornecedorDto> findAll(){
		List<Fornecedor> lista = repository.findAll();
		return lista.stream().map(x -> new FornecedorDto(x)).collect(Collectors.toList());
	}
    
    
    @Transactional(readOnly = true)
	public FornecedorDto findById(Long id) {
		Optional<Fornecedor> obj = repository.findById(id);
		
		Fornecedor entity = obj.orElseThrow(() -> new ResourceNotFoundException("O registro solicitado não foi localizado."));
		return new FornecedorDto(entity);		
	}

	@Transactional
	public FornecedorDto insert(FornecedorDto dto) {
		Fornecedor entity = new Fornecedor();
		
		entity.setRazaoSocial(dto.getRazaoSocial());
		entity.setCnpj(dto.getCnpj());
		entity.setRua(dto.getRua());
		entity.setNumero(dto.getNumero()); 
		entity.setBairro(dto.getBairro());
		entity.setCidade(dto.getCidade()); 
		entity.setCep(dto.getCep()); 
		entity.setUf(dto.getUf());
		entity.setTelefone(dto.getTelefone()); 
		entity.setEmail(dto.getEmail());
		
		entity = repository.save(entity);

		return new FornecedorDto(entity);
	}

	@Transactional
	public FornecedorDto update(Long id, FornecedorDto dto) {
		
		try {
			Fornecedor entity = repository.getReferenceById(id);
			
			entity.setRazaoSocial(dto.getRazaoSocial());
			entity.setCnpj(dto.getCnpj());
			entity.setRua(dto.getRua());
			entity.setNumero(dto.getNumero()); 
			entity.setBairro(dto.getBairro());
			entity.setCidade(dto.getCidade()); 
			entity.setCep(dto.getCep()); 
			entity.setUf(dto.getUf());
			entity.setTelefone(dto.getTelefone()); 
			entity.setEmail(dto.getEmail());
			
			entity = repository.save(entity);
	
			return new FornecedorDto(entity);
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