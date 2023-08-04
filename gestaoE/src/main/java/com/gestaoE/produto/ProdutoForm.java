/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoE.produto;

import com.gestaoE.arch.dto.AdapterBaseObjectForm;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 *
 * @author 07041626105
 */
@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ProdutoForm extends AdapterBaseObjectForm {
    
	private long codigoProduto, saidaQuantidade, entradaQuantidade;
        private String descricao, data;
        private double precoCusto, precoVenda;
        
        public void validarProduto(){};
        public void calcularSaldo(){};
}