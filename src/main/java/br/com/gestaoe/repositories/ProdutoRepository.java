/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.gestaoe.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.gestaoe.dto.ControleDeEstoqueDTO;
import br.com.gestaoe.entities.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
		
	/*
	Passos para criar a consulta sql
	- Criar o método (query) na repository;
	- Criar um DTO ou uma interface (projection) para a consulta personalizada
	- Atualizar ou criar a classe service
	- Criar o mapeamento para retornar a consulta na classe resource
	*/
	// Método personalizado para executar a consulta SQL desejada
	
	/*
			
			*SELECT new br.com.gestaoe.produto.ControleDeEstoqueDTO("
			+ "obj.descricao, obj.itemProdutoQuantidade.entradaQuantidade) "
			+ "FROM Produto obj "
			+ "WHERE obj.descricao = :descricao
			
			*
			*
			*
			*/
	
	
	/*
	@Query("SELECT new br.com.gestaoe.produto.ControleDeEstoqueDTO("
			+ "obj.id) "
			+ "FROM Produto obj "
			+ "WHERE obj.id = :id")
	List<ControleDeEstoqueDTO> findByControleDeEstoqueSQL(Long id);
	*/
	
	/*
	@Query("SELECT new br.com.gestaoe.produto.ControleDeEstoqueDTO("
			+ "obj.entradaQuantidade, obj.produto.id, obj.produto.descricao) "
			+ "FROM ItemProdutoCompra obj "
			+ "WHERE obj.produto.descricao = :descricao")
	List<ControleDeEstoqueDTO> findByProdutoDescricaoSQL(String descricao);
	*/


	
	
}