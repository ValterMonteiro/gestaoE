/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.gestaoe.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.gestaoe.dto.IControleDeEstoqueDTO;
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
	List<ControleDeEstoqueDTO> findByControleDeEstoqueSQL(String descricao);
	
	INNER JOIN
				    tb_venda ON 
	*/


	@Query(value="""
				SELECT
					tb_compra.data AS data,
					tb_produto.id AS idProduto,
					tb_produto.descricao AS descricao,
					tb_item_produto_compra.entrada_quantidade AS entradaQuantidade,
					tb_item_produto_compra.preco_custo AS entradaValorUnit,
					(CAST(tb_item_produto_compra.entrada_quantidade AS FLOAT) * tb_item_produto_compra.preco_custo) AS entradaValorTotal,
					tb_item_produto_venda.saida_quantidade AS saidaQuantidade,
					tb_item_produto_compra.preco_custo AS saidaValorUnit,
					(CAST(tb_item_produto_venda.saida_quantidade AS FLOAT) * tb_item_produto_compra.preco_custo) AS saidaValorTotal,
					(tb_item_produto_compra.entrada_quantidade - tb_item_produto_venda.saida_quantidade) AS saldoQuantidade,
					(tb_item_produto_compra.entrada_quantidade * tb_item_produto_compra.preco_custo) AS saldoValorMedio,
					(((CAST(tb_item_produto_compra.entrada_quantidade AS FLOAT) * tb_item_produto_compra.preco_custo)) * ((CAST(tb_item_produto_venda.saida_quantidade AS FLOAT) * tb_item_produto_compra.preco_custo))) AS saldoValorTotal
				FROM
					tb_produto
				LEFT JOIN
					tb_item_produto_compra ON tb_produto.id = tb_item_produto_compra.id_produto_fk
				LEFT JOIN
					tb_item_produto_venda ON tb_produto.id = tb_item_produto_venda.id_produto_fk
				LEFT JOIN
					tb_compra ON tb_item_produto_compra.id_compra_fk = tb_compra.id
				WHERE
			 		tb_produto.id = 1;

			""", nativeQuery = true)
	List<IControleDeEstoqueDTO> findByControleDeEstoqueSQL(Long id);
	
}