/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gestaoe.produto;

import java.io.Serializable;
import java.time.LocalDate;



public class ProdutoDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String descricao;
	private LocalDate data;
	private Long saidaQuantidade;
	private Long entradaQuantidade;
	private double precoCusto;
	private double precoVenda;
	
	
	public ProdutoDto(){}
	

	public ProdutoDto(Long id, String descricao, LocalDate data, Long saidaQuantidade, Long entradaQuantidade,
			double precoCusto, double precoVenda) {
		this.id = id;
		this.descricao = descricao;
		this.data = data;
		this.saidaQuantidade = saidaQuantidade;
		this.entradaQuantidade = entradaQuantidade;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		
	}



	public ProdutoDto(Produto entity) {
		this.id = entity.getId();
		this.descricao = entity.getDescricao();
		this.data = entity.getData();
		this.saidaQuantidade = entity.getSaidaQuantidade();
		this.entradaQuantidade = entity.getEntradaQuantidade();
		this.precoCusto = entity.getPrecoCusto();
		this.precoVenda = entity.getPrecoVenda();
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

	public Long getSaidaQuantidade() {
		return saidaQuantidade;
	}
	
	
	
	public void setSaidaQuantidade(Long saidaQuantidade) {
		this.saidaQuantidade = saidaQuantidade;
	}
	public Long getEntradaQuantidade() {
		return entradaQuantidade;
	}
	
	
	
	public void setEntradaQuantidade(Long entradaQuantidade) {
		this.entradaQuantidade = entradaQuantidade;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}



	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}



	public double getPrecoVenda() {
		return precoVenda;
	}



	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
    
    
}