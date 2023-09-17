/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gestaoe.produto;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * 
 */
@Entity
@Table(name = "tb_produto")
public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;
	private LocalDate data;
	private Long saidaQuantidade;
	private Long entradaQuantidade;
	private double precoCusto;
	private double precoVenda;
	
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}

	

	public Produto(Long id, String descricao, LocalDate data, Long saidaQuantidade, Long entradaQuantidade,
			double precoCusto, double precoVenda) {
		this.id = id;
		this.descricao = descricao;
		this.data = data;
		this.saidaQuantidade = saidaQuantidade;
		this.entradaQuantidade = entradaQuantidade;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		
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
	
	

	@Override
	public int hashCode() {
		return Objects.hash(descricao, id);
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(descricao, other.descricao) && Objects.equals(id, other.id);
	}
	
}