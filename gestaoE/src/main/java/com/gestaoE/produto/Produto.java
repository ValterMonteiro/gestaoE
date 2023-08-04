/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoE.produto;


import com.gestaoE.arch.BaseObject;
import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 *
 * @author 07041626105
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@SequenceGenerator(sequenceName = "produto_sequence", name = "baseObjectSequence", allocationSize = 1)
public class Produto extends BaseObject {

        private long codigoProduto, saidaQuantidade, entradaQuantidade;
        private String descricao, data;
        private double precoCusto, precoVenda;
        
        public void validarProduto(){};
        public void calcularSaldo(){};
 
}