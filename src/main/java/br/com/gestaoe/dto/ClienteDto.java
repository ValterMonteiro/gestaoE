/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gestaoe.dto;

import java.io.Serializable;
import java.time.LocalDate;

import br.com.gestaoe.entities.Cliente;



public class ClienteDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String razaoSocial;
	private String cnpj;
	private String rua;
	private Integer numero;
	private String bairro;
	private String cidade;
	private Long cep;
	private String uf;
	private Long telefone;
	private String email;
	
	
	public ClienteDto(){}
	
	
	public ClienteDto(Long id, String razaoSocial, String cnpj, String rua, Integer numero, String bairro,
			String cidade, Long cep, String uf, Long telefone, String email) {
		
		this.id = id;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.uf = uf;
		this.telefone = telefone;
		this.email = email;
	}


	public ClienteDto(Cliente entity) {
		this.id = entity.getId();
		this.razaoSocial = entity.getRazaoSocial();
		this.cnpj = entity.getCnpj();
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


	public String getRazaoSocial() {
		return razaoSocial;
	}


	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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