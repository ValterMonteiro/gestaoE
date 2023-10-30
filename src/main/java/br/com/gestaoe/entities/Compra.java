/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gestaoe.compra;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.xml.crypto.Data;

import br.com.gestaoe.fornecedor.Fornecedor;
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
@Table(name = "tb_compra")
public class Compra implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	
	@ManyToOne
	@JoinColumn(name = "id_funcionario_fk")
	private Funcionario funcionario;
	
	
	@ManyToOne
	@JoinColumn(name = "id_fornecedor_fk")
	private Fornecedor fornecedor;
	
	
	private Long nfeCompra;
	private LocalDate data;
	//private  hora;
	//private List<item_produto> itemProduto;
	
	
	
	public Compra() {
		// TODO Auto-generated constructor stub
	}

	

	public Compra(Long id, Funcionario funcionario, Fornecedor fornecedor, Long nfeCompra, LocalDate data) {
		
		this.id = id;
		this.funcionario = funcionario;
		this.fornecedor = fornecedor;
		this.nfeCompra = nfeCompra;
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
		Compra other = (Compra) obj;
		return Objects.equals(id, other.id);
	}


}