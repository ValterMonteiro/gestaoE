/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gestaoe.dto;


import java.io.Serializable;

import br.com.gestaoe.entities.ItemProdutoVenda;
import br.com.gestaoe.entities.Produto;
import br.com.gestaoe.entities.Venda;
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
public class ItemProdutoVendaDto  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Produto produto;
	private int saidaQuantidade;
	private double precoVenda;	
	
	private Venda venda;
	
	public ItemProdutoVendaDto(){}


	public ItemProdutoVendaDto(Long id, Produto produto, int saidaQuantidade, double precoVenda, Venda venda) {
		this.id = id;
		this.produto = produto;
		this.saidaQuantidade = saidaQuantidade;
		this.precoVenda = precoVenda;
		this.venda = venda;
	}


	public ItemProdutoVendaDto(ItemProdutoVenda entity) {
		this.id = entity.getId();
		this.produto = entity.getProduto();
		this.saidaQuantidade = entity.getSaidaQuantidade();
		this.precoVenda = entity.getPrecoVenda();
		this.venda = entity.getVenda();
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


	public int getSaidaQuantidade() {
		return saidaQuantidade;
	}


	public void setSaidaQuantidade(int saidaQuantidade) {
		this.saidaQuantidade = saidaQuantidade;
	}


	public double getPrecoVenda() {
		return precoVenda;
	}


	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}


	public Venda getVenda() {
		return venda;
	}


	public void setVenda(Venda venda) {
		this.venda = venda;
	}

    
}