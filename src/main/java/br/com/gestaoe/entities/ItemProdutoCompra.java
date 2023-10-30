/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gestaoe.entities;


import java.util.Objects;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

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
@Table(name = "tb_item_produto_compra")
public class ItemProdutoCompra{

    
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//@JdbcTypeCode(SqlTypes.JSON)
	@ManyToOne
	@JoinColumn(name = "id_produto_fk")
	private Produto produto;
	
	private int entradaQuantidade;
	private double precoCusto;
    
    public ItemProdutoCompra() {
		// TODO Auto-generated constructor stub
	}

	public ItemProdutoCompra(Long id, Produto produto, int entradaQuantidade, double precoCusto) {
		this.id = id;
		this.produto = produto;
		this.entradaQuantidade = entradaQuantidade;
		this.precoCusto = precoCusto;
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
		ItemProdutoCompra other = (ItemProdutoCompra) obj;
		return Objects.equals(id, other.id);
	}

	
    
    
 
}