/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gestaoe.arch;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 *
 * @author santos
 */
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class BaseObject implements IBase, Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -4237354670539246455L;

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "baseObjectSequence" )
    private Long id;
    
    private String nome;
    
    @Column(columnDefinition = "timestamp(6) default now()")
    private LocalDateTime createdAt;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

	@Override
	public void setCreatedAt(LocalDateTime value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LocalDateTime getCreatedAt() {
		// TODO Auto-generated method stub
		return null;
	}
}
