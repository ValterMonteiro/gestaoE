/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gestaoe.produto;

import java.time.LocalDate;

import br.edu.ifms.arch.v010.dto.AdapterBaseObjectForm;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ProdutoForm extends AdapterBaseObjectForm {
    
	private long codigoProduto;
	private String descricao;
	private LocalDate data;
	private int saidaQuantidade;
	private int entradaQuantidade;
    private double precoCusto;
    private double precoVenda;
        
        public void validarProduto(){};
        public void calcularSaldo(){};
}