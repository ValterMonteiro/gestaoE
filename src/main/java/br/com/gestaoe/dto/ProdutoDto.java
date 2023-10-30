/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gestaoe.dto;

import java.io.Serializable;
import java.time.LocalDate;

import br.com.gestaoe.entities.Produto;



public class ProdutoDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String descricao;
	private LocalDate data;
	
	
	
	public ProdutoDto(){}
	

	public ProdutoDto(Long id, String descricao, LocalDate data) {
		this.id = id;
		this.descricao = descricao;
		this.data = data;
		
		
	}



	public ProdutoDto(Produto entity) {
		this.id = entity.getId();
		this.descricao = entity.getDescricao();
		this.data = entity.getData();
		
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

	public LocalDate getData() {
		return data;
	}
	
	
	
	public void setData(LocalDate data) {
		this.data = data;
	}

    
}