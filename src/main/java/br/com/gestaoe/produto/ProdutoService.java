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
		entity.setSaidaQuantidade(dto.getSaidaQuantidade());
		entity.setEntradaQuantidade(dto.getEntradaQuantidade());
		entity.setPrecoCusto(dto.getPrecoCusto());
		entity.setPrecoVenda(dto.getPrecoVenda());
		
		entity = repository.save(entity);

		return new ProdutoDto(entity);
	}

	@Transactional
	public ProdutoDto update(Long id, ProdutoDto dto) {
		
		try {
			Produto entity = repository.getReferenceById(id);
			
			entity.setDescricao(dto.getDescricao());
			entity.setData(dto.getData());
			entity.setSaidaQuantidade(dto.getSaidaQuantidade());
			entity.setEntradaQuantidade(dto.getEntradaQuantidade());
			entity.setPrecoCusto(dto.getPrecoCusto());
			entity.setPrecoVenda(dto.getPrecoVenda());
			
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
	public List<ControleDeEstoque> getControleDeEstoque() {
		
		
		
        // Suponha que você tenha um método personalizado no seu ProdutoRepository
        // que execute a consulta SQL que você mencionou e retorne os resultados
        List<Object[]> resultado = repository.customQueryForControleDeEstoque();

        // Mapeie os resultados para objetos ControleDeEstoque
        return resultado.stream().map(row -> {
        	ControleDeEstoqueImpl controle = new ControleDeEstoqueImpl();
            //controle.setData((LocalDate) row[0]);
        	controle.setData(((java.sql.Date) row[0]).toLocalDate()); // Converte a data para LocalDate
            //controle.setId((Long) row[1]);
        	controle.setId(Long.valueOf((Integer) row[1])); // Converte Integer para Long
            controle.setDescricao((String) row[2]);
            //controle.setEntradaQuantidade((Long) row[3]);
            controle.setEntradaQuantidade(Long.valueOf((Integer) row[3])); // Converte Integer para Long
            controle.setEntradaValorUnit((Double) row[4]);
            controle.setEntradaValorTotal((Double) row[5]);
            //controle.setSaidaQuantidade((Long) row[6]);
            controle.setSaidaQuantidade(Long.valueOf((Integer) row[6])); // Converte Integer para Long
            controle.setSaidaValorUnit((Double) row[7]);
            controle.setSaidaValorTotal((Double) row[8]);
            //controle.setSaldoQuantidade((Long) row[9]);
            controle.setSaldoQuantidade(Long.valueOf((Integer) row[9])); // Converte Integer para Long
            controle.setSaldoValorUnit((Double) row[10]);
            controle.setSaldoValorTotal((Double) row[11]);
            return controle;
        }).collect(Collectors.toList());
    }
     
}