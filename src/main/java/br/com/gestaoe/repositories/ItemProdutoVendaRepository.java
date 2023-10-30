/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.gestaoe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gestaoe.entities.ItemProdutoVenda;

/**
 *
 * @author 07041626105
 */
@Repository
public interface ItemProdutoVendaRepository extends JpaRepository<ItemProdutoVenda, Long>{
    
}