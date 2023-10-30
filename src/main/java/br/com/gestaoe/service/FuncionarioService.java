/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gestaoe.funcionario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityNotFoundException;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository repository;
    
    @Transactional(readOnly = true)
	public List<FuncionarioDto> findAll(){
		List<Funcionario> lista = repository.findAll();
		return lista.stream().map(x -> new FuncionarioDto(x)).collect(Collectors.toList());
	}
    
    
    @Transactional(readOnly = true)
	public FuncionarioDto findById(Long id) {
		Optional<Funcionario> obj = repository.findById(id);
		
		Funcionario entity = obj.orElseThrow(() -> new ResourceNotFoundException("O registro solicitado não foi localizado."));
		return new FuncionarioDto(entity);		
	}

	@Transactional
	public FuncionarioDto insert(FuncionarioDto dto) {
		Funcionario entity = new Funcionario();
		
		entity.setNome(dto.getNome());
		entity.setCpf(dto.getCpf());
		entity.setRua(dto.getRua());
		entity.setNumero(dto.getNumero()); 
		entity.setBairro(dto.getBairro());
		entity.setCidade(dto.getCidade()); 
		entity.setCep(dto.getCep()); 
		entity.setUf(dto.getUf());
		entity.setTelefone(dto.getTelefone()); 
		entity.setEmail(dto.getEmail());
		
		entity = repository.save(entity);

		return new FuncionarioDto(entity);
	}

	@Transactional
	public FuncionarioDto update(Long id, FuncionarioDto dto) {
		
		try {
			Funcionario entity = repository.getReferenceById(id);
			
			entity.setNome(dto.getNome());
			entity.setCpf(dto.getCpf());
			entity.setRua(dto.getRua());
			entity.setNumero(dto.getNumero()); 
			entity.setBairro(dto.getBairro());
			entity.setCidade(dto.getCidade()); 
			entity.setCep(dto.getCep()); 
			entity.setUf(dto.getUf());
			entity.setTelefone(dto.getTelefone()); 
			entity.setEmail(dto.getEmail());
			
			entity = repository.save(entity);
	
			return new FuncionarioDto(entity);
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