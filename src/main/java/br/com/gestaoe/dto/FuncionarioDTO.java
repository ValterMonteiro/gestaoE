/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gestaoe.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import br.com.gestaoe.entities.Funcionario;



public class FuncionarioDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private String cpf;
	private String rua;
	private Integer numero;
	private String bairro;
	private String cidade;
	private Long cep;
	private String uf;
	private Long telefone;
	private String email;
	
	
	
	
	public FuncionarioDTO(){}
	
	
	public FuncionarioDTO(Long id, String nome, String cpf, String rua, Integer numero, String bairro,
			String cidade, Long cep, String uf, Long telefone, String email) {
		
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.uf = uf;
		this.telefone = telefone;
		this.email = email;
	}


	public FuncionarioDTO(Funcionario entity) {
		this.id = entity.getId();
		this.nome = entity.getNome();
		this.cpf = entity.getCpf();
		this.rua = entity.getRua();
		this.numero = entity.getNumero();
		this.bairro = entity.getBairro();
		this.cidade = entity.getBairro();
		this.cep = entity.getCep();
		this.uf = entity.getUf();
		this.telefone = entity.getTelefone();
		this.email = entity.getEmail();
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getRua() {
		return rua;
	}


	public void setRua(String rua) {
		this.rua = rua;
	}


	public Integer getNumero() {
		return numero;
	}


	public void setNumero(Integer numero) {
		this.numero = numero;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public Long getCep() {
		return cep;
	}


	public void setCep(Long cep) {
		this.cep = cep;
	}


	public String getUf() {
		return uf;
	}


	public void setUf(String uf) {
		this.uf = uf;
	}


	public Long getTelefone() {
		return telefone;
	}


	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	
    
}