/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoE.itemProdutoCompra;


import com.gestaoE.arch.dto.AdapterBaseObjectDto;
import com.gestaoE.produto.Produto;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 *
 * @author 07041626105
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class ItemProdutoCompraDto extends AdapterBaseObjectDto {
    
	private Produto produto;
        private int quantidade;
    
        public void validarItemProduto(){};
}