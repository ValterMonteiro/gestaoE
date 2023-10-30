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

import br.com.gestaoe.dto.VendaDto;
import br.com.gestaoe.entities.Venda;
import br.com.gestaoe.repositories.VendaRepository;
import br.com.gestaoe.service.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;

@Service
public class VendaService {

    @Autowired
    private VendaRepository repository;
    
    @Transactional(readOnly = true)
	public List<VendaDto> findAll(){
		List<Venda> lista = repository.findAll();
		return lista.stream().map(x -> new VendaDto(x)).collect(Collectors.toList());
	}
    
    
    @Transactional(readOnly = true)
	public VendaDto findById(Long id) {
		Optional<Venda> obj = repository.findById(id);
		
		Venda entity = obj.orElseThrow(() -> new ResourceNotFoundException("O registro solicitado não foi localizado."));
		return new VendaDto(entity);		
	}

	@Transactional
	public VendaDto insert(VendaDto dto) {
		Venda entity = new Venda();
		
		//entity.setFuncionario(dto.getFuncionario());
		//entity.setCliente(dto.getCliente());
		entity.setData(dto.getData());
		entity.setNfeVenda(dto.getNfeVenda()); 
		
		
		entity = repository.save(entity);

		return new VendaDto(entity);
	}

	@Transactional
	public VendaDto update(Long id, VendaDto dto) {
		
		try {
			Venda entity = repository.getReferenceById(id);
			
			//entity.setFuncionario(dto.getFuncionario());
			//entity.setCliente(dto.getCliente());
			entity.setData(dto.getData());
			entity.setNfeVenda(dto.getNfeVenda()); 
			
			entity = repository.save(entity);
	
			return new VendaDto(entity);
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