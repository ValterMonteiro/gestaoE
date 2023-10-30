/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gestaoe.produto;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.gestaoe.itemProdutoCompra.ItemProdutoCompra;
import br.com.gestaoe.itemProdutoVenda.ItemProdutoVenda;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
	
	
	@OneToMany(mappedBy = "entradaQuantidade", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<ItemProdutoCompra> itemProdutoCompra = new ArrayList<>();
	
	@OneToMany(mappedBy = "saidaQuantidade")
	private List<ItemProdutoVenda> itemProdutoVenda = new ArrayList<>();
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}

	

	public Produto(Long id, String descricao, LocalDate data,
			List<ItemProdutoCompra> itemProdutoCompra, List<ItemProdutoVenda> itemProdutoVenda ) {
		this.id = id;
		this.descricao = descricao;
		this.data = data;		
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
	

	@Override
	public int hashCode() {
		return Objects.hash(id);
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
		return Objects.equals(id, other.id);
	}
	
}