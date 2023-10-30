/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gestaoe.dto;


import java.io.Serializable;

import br.com.gestaoe.entities.ItemProdutoCompra;
import br.com.gestaoe.entities.Produto;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 *
 * @author 07041626105
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class ItemProdutoCompraDto  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Produto produto;
    private int entradaQuantidade;
	private double precoCusto;
	
	
	public ItemProdutoCompraDto(){}


	public ItemProdutoCompraDto(Long id, Produto produto, int entradaQuantidade, double precoCusto) {
		this.id = id;
		this.produto = produto;
		this.entradaQuantidade = entradaQuantidade;
		this.precoCusto = precoCusto;
	}


	public ItemProdutoCompraDto(ItemProdutoCompra entity) {
		this.id = entity.getId();
		this.produto = entity.getProduto();
		this.entradaQuantidade = entity.getEntradaQuantidade();
		this.precoCusto = entity.getPrecoCusto();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public int getEntradaQuantidade() {
		return entradaQuantidade;
	}


	public void setEntradaQuantidade(int entradaQuantidade) {
		this.entradaQuantidade = entradaQuantidade;
	}


	public double getPrecoCusto() {
		return precoCusto;
	}


	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

    
}