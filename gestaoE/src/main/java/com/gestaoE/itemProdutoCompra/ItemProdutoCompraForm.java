/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoE.itemProdutoCompra;

import com.gestaoE.produto.*;
import br.edu.ifms.arch.dto.AdapterBaseObjectForm;
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
public class ItemProdutoCompraForm extends AdapterBaseObjectForm {
    
	private Produto produto;
        private int quantidade;
    
        public void validarItemProduto(){};
}