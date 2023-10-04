/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.gestaoe.produto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

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
			*/
	
	@Query("SELECT new br.com.gestaoe.produto.ControleDeEstoqueDTO(obj.id, obj.descricao) "
			+ "FROM Produto obj "
			+ "WHERE obj.descricao = :descricao")
	List<ControleDeEstoqueDTO> findByProdutoDescricaoSQL( String descricao);
	


	
	
}