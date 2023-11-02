/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gestaoe.dto;

import java.io.Serializable;
import java.time.LocalDate;

import br.com.gestaoe.entities.Compra;
import br.com.gestaoe.entities.Fornecedor;
import br.com.gestaoe.entities.Funcionario;
import br.com.gestaoe.entities.ItemProdutoCompra;



public class CompraDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Funcionario funcionario;
	private Fornecedor fornecedor;
	private Long nfeCompra;
	private LocalDate data;
	
	
	
	public CompraDto(){}
	

//
	public CompraDto(Long id, Long nfeCompra, Funcionario funcionario, 
			Fornecedor fornecedor, LocalDate data) {
		
		this.id = id;
		this.funcionario = funcionario;
		this.fornecedor = fornecedor;
		this.nfeCompra = nfeCompra;
		this.data = data;
	}



	public CompraDto(Compra entity) {
		this.id = entity.getId();
		this.funcionario = entity.getFuncionario();
		this.fornecedor = entity.getFornecedor();
		this.nfeCompra = entity.getNfeCompra();
		this.data = entity.getData();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}



	public Funcionario getFuncionario() {
		return funcionario;
	}



	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}



	public Fornecedor getFornecedor() {
		return fornecedor;
	}



	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}



	public Long getNfeCompra() {
		return nfeCompra;
	}



	public void setNfeCompra(Long nfeCompra) {
		this.nfeCompra = nfeCompra;
	}



	public LocalDate getData() {
		return data;
	}



	public void setData(LocalDate data) {
		this.data = data;
	}


	
	

  
}