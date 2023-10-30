package br.com.gestaoe.dto;

import java.io.Serializable;
import java.time.LocalDate;

import br.com.gestaoe.entities.ControleDeEstoque;

public class ControleDeEstoqueDTO implements Serializable {

	private static final long serialVersionUID = 1L;	
	
	private Long id;
    //private String descricao;
    //private int entradaQuantidade;
    

    
    
	public ControleDeEstoqueDTO() {	}


	public ControleDeEstoqueDTO(Long id) {
		this.id = id;
		//this.descricao = descricao;
		//this.entradaQuantidade = entradaQuantidade;
		
	}
	
	
	public ControleDeEstoqueDTO(ControleDeEstoque controleDeEstoque) {
		id = controleDeEstoque.getId();
		//descricao = controleDeEstoque.getDescricao();
		//entradaQuantidade = controleDeEstoque.getEntradaQuantidade();
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	
	


	

	

	
	


	


	

    
}
