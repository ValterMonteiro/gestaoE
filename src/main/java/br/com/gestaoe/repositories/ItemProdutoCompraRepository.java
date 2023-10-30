/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.gestaoe.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gestaoe.entities.ItemProdutoCompra;
import br.com.gestaoe.entities.Produto;

/**
 *
 * @author 07041626105
 */
@Repository
public interface ItemProdutoCompraRepository extends JpaRepository<ItemProdutoCompra, Long>{
	
	
	
    
}