/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gestaoe.produto;


import java.time.LocalDate;

import br.edu.ifms.arch.v010.BaseObject;
import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 *
 * 
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@SequenceGenerator(sequenceName = "produto_sequence", name = "baseObjectSequence", allocationSize = 1)
public class Produto extends BaseObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2527649187046342294L;
	private long codigoProduto;
	private String descricao;
	private LocalDate data;
	private int saidaQuantidade;
	private int entradaQuantidade;
    private double precoCusto;
    private double precoVenda;
    
    public void validarProduto(){};
    public void calcularSaldo(){}
}