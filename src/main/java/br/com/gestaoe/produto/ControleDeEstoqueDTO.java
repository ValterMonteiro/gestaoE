package br.com.gestaoe.produto;

import java.io.Serializable;
import java.time.LocalDate;

public class ControleDeEstoqueDTO implements Serializable {

	private static final long serialVersionUID = 1L;	
	
	private Long id;
    private String descricao;
    

    
    
	public ControleDeEstoqueDTO() {	}


	public ControleDeEstoqueDTO(Long id, String descricao) {
		this.id = id;
		this.descricao = descricao;
		
	}
	
	public ControleDeEstoqueDTO(ControleDeEstoque controleDeEstoque) {
		id = controleDeEstoque.getId();
		descricao = controleDeEstoque.getDescricao();
		
		
	}

	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	

    
}
