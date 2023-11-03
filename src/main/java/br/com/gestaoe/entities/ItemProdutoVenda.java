/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gestaoe.entities;


import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *
 * @author 07041626105
 */
@Entity
@Table(name = "tb_item_produto_venda")
public class ItemProdutoVenda{

    
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//@JdbcTypeCode(SqlTypes.JSON)
	@ManyToOne
	@JoinColumn(name = "id_produto_fk")
	private Produto produto;
	
	private int saidaQuantidade;
	private double precoVenda;
	
	@ManyToOne
	@JoinColumn(name = "id_venda_fk")
	private Venda venda;
    
    public ItemProdutoVenda() {
		// TODO Auto-generated constructor stub
	}

	public ItemProdutoVenda(Long id, Produto produto, int saidaQuantidade, double precoVenda,  Venda venda) {
		this.id = id;
		this.produto = produto;
		this.saidaQuantidade = saidaQuantidade;
		this.precoVenda = precoVenda;
		this.venda = venda;
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

	@Override
	public int hashCode() {
		return Objects.hash(id, produto, saidaQuantidade);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemProdutoVenda other = (ItemProdutoVenda) obj;
		return Objects.equals(id, other.id);
	}

	
    
    
 
}