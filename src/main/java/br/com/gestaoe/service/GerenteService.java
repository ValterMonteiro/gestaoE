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

import br.com.gestaoe.dto.GerenteDto;
import br.com.gestaoe.entities.Gerente;
import br.com.gestaoe.repositories.GerenteRepository;
import br.com.gestaoe.service.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;

@Service
public class GerenteService {

    @Autowired
    private GerenteRepository repository;
    
    @Transactional(readOnly = true)
	public List<GerenteDto> findAll(){
		List<Gerente> lista = repository.findAll();
		return lista.stream().map(x -> new GerenteDto(x)).collect(Collectors.toList());
	}
    
    
    @Transactional(readOnly = true)
	public GerenteDto findById(Long id) {
		Optional<Gerente> obj = repository.findById(id);
		
		Gerente entity = obj.orElseThrow(() -> new ResourceNotFoundException("O registro solicitado não foi localizado."));
		return new GerenteDto(entity);		
	}

	@Transactional
	public GerenteDto insert(GerenteDto dto) {
		Gerente entity = new Gerente();
		
		entity = repository.save(entity);

		return new GerenteDto(entity);
	}

	@Transactional
	public GerenteDto update(Long id, GerenteDto dto) {
		
		try {
			Gerente entity = repository.getReferenceById(id);
			
			
			entity = repository.save(entity);
	
			return new GerenteDto(entity);
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