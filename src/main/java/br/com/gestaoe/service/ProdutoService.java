/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gestaoe.produto;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;
    
    @Transactional(readOnly = true)
	public List<ProdutoDto> findAll(){
		List<Produto> lista = repository.findAll();
		return lista.stream().map(x -> new ProdutoDto(x)).collect(Collectors.toList());
	}
    
    
    @Transactional(readOnly = true)
	public ProdutoDto findById(Long id) {
		Optional<Produto> obj = repository.findById(id);
		
		Produto entity = obj.orElseThrow(() -> new ResourceNotFoundException("O registro solicitado não foi localizado."));
		return new ProdutoDto(entity);		
	}

	@Transactional
	public ProdutoDto insert(ProdutoDto dto) {
		Produto entity = new Produto();
		entity.setDescricao(dto.getDescricao());
		entity.setData(dto.getData());
		
		
		entity = repository.save(entity);

		return new ProdutoDto(entity);
	}

	@Transactional
	public ProdutoDto update(Long id, ProdutoDto dto) {
		
		try {
			Produto entity = repository.getReferenceById(id);
			
			entity.setDescricao(dto.getDescricao());
			entity.setData(dto.getData());
			
			
			entity = repository.save(entity);
	
			return new ProdutoDto(entity);
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

	
	
	//relatorio controle de estoque
	
	@Transactional(readOnly = true)
	public List<ControleDeEstoqueDTO> findByProdutoDescricaoSQL(String descricao) {
		return repository.findByProdutoDescricaoSQL(descricao);
	}
	
     
}