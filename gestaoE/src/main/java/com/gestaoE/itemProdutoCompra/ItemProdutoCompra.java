/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoE.itemProdutoCompra;


import com.gestaoE.arch.BaseObject;
import com.gestaoE.produto.Produto;
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
public class ItemProdutoCompra extends BaseObject {

    private Produto produto;
    private int quantidade;
    
    public void validarItemProduto(){};
 
}