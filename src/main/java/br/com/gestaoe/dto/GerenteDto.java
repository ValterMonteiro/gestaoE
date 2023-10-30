/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gestaoe.gerente;

import java.io.Serializable;



public class GerenteDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	
	public GerenteDto(){}
	
	
	public GerenteDto(Long id) {
		
		this.id = id;

	}


	public GerenteDto(Gerente entity) {
		this.id = entity.getId();
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

    
}