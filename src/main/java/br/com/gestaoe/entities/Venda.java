/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gestaoe.venda;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.xml.crypto.Data;

import br.com.gestaoe.cliente.Cliente;
import br.com.gestaoe.funcionario.Funcionario;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *
 * 
 */
@Entity
@Table(name = "tb_venda")
public class Venda implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@ManyToOne
	@JoinColumn(name = "id_funcionario_fk")
	private Funcionario funcionario;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente_fk")
	private Cliente cliente;
	
	
	private Long nfeVenda;
	private LocalDate data;
	//private  hora;
	//private List<item_produto> itemProduto;
	
	
	
	public Venda() {
		// TODO Auto-generated constructor stub
	}

	
//
	public Venda(Long id, Long nfeVenda, Funcionario funcionario, Cliente cliente, LocalDate data) {
		
		this.id = id;
		this.funcionario = funcionario;
		this.cliente = cliente;
		this.nfeVenda = nfeVenda;
		this.data = data;
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



	public void setCliente(Cliente Cliente) {
		this.cliente = Cliente;
	}



	public Long getNfeVenda() {
		return nfeVenda;
	}



	public void setNfeVenda(Long nfeVenda) {
		this.nfeVenda = nfeVenda;
	}



	public LocalDate getData() {
		return data;
	}



	public void setData(LocalDate data) {
		this.data = data;
	}



	@Override
	public int hashCode() {
		return Objects.hash(data, id, nfeVenda);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venda other = (Venda) obj;
		return Objects.equals(id, other.id);
	}


}