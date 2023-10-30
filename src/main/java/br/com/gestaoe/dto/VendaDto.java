/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gestaoe.dto;

import java.io.Serializable;
import java.time.LocalDate;

import br.com.gestaoe.entities.Cliente;
import br.com.gestaoe.entities.Funcionario;
import br.com.gestaoe.entities.Venda;



public class VendaDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Funcionario funcionario;
	private Cliente cliente;
	private Long nfeVenda;
	private LocalDate data;
	//private  hora;
	//private List<item_produto> itemProduto;
	
	
	public VendaDto(){}
	

//
	public VendaDto(Long id, Long nfeVenda, Funcionario funcionario, Cliente cliente, LocalDate data) {
		
		this.id = id;
		this.funcionario = funcionario;
		this.cliente = cliente;
		this.nfeVenda = nfeVenda;
		this.data = data;
	}



	public VendaDto(Venda entity) {
		this.id = entity.getId();
		this.funcionario = entity.getFuncionario();
		this.cliente = entity.getCliente();
		this.nfeVenda = entity.getNfeVenda();
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



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public Long getNfeVenda() {
		return nfeVenda;
	}



	public void setNfeCompra(Long nfeVenda) {
		this.nfeVenda = nfeVenda;
	}



	public LocalDate getData() {
		return data;
	}



	public void setData(LocalDate data) {
		this.data = data;
	}

  
}