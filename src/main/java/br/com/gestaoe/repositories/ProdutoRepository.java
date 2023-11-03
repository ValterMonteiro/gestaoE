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
					(tb_item_produto_compra.entrada_quantidade * tb_item_produto_compra.preco_custo) AS entradaValorTotal,
				NULL AS saidaQuantidade,
				NULL AS saidaValorUnit,
				NULL AS saidaValorTotal,
					(tb_item_produto_compra.entrada_quantidade - COALESCE(tb_item_produto_venda.saida_quantidade, 0)) AS saldoQuantidade,
					(tb_item_produto_compra.entrada_quantidade * tb_item_produto_compra.preco_custo) AS saldoValorMedio,
					((tb_item_produto_compra.entrada_quantidade * tb_item_produto_compra.preco_custo) - COALESCE((tb_item_produto_venda.saida_quantidade * tb_item_produto_compra.preco_custo), 0)) AS saldoValorTotal
				FROM
					tb_produto
				INNER JOIN
					tb_item_produto_compra ON tb_produto.id = tb_item_produto_compra.id_produto_fk
				INNER JOIN
					tb_compra ON tb_item_produto_compra.id_compra_fk = tb_compra.id
				LEFT JOIN
					tb_item_produto_venda ON tb_produto.id = tb_item_produto_venda.id_produto_fk
				WHERE
					tb_produto.id = ?1

				UNION ALL

				SELECT
					tb_venda.data AS data,
					tb_produto.id AS idProduto,
					tb_produto.descricao AS descricao,
				NULL AS entradaQuantidade,
				NULL AS entradaValorUnit,
				NULL AS entradaValorTotal,
					tb_item_produto_venda.saida_quantidade AS saidaQuantidade,
					tb_item_produto_compra.preco_custo AS saidaValorUnit,
					(tb_item_produto_venda.saida_quantidade * tb_item_produto_compra.preco_custo) AS saidaValorTotal,
				COALESCE(tb_item_produto_compra.entrada_quantidade, 0) - tb_item_produto_venda.saida_quantidade AS saldoQuantidade,
					tb_item_produto_compra.preco_custo AS saldoValorMedio,
				(COALESCE(tb_item_produto_compra.entrada_quantidade, 0) - tb_item_produto_venda.saida_quantidade) * tb_item_produto_compra.preco_custo AS saldoValorTotal
				FROM
					tb_produto
				INNER JOIN
					tb_item_produto_venda ON tb_produto.id = tb_item_produto_venda.id_produto_fk
				INNER JOIN
					tb_venda ON tb_item_produto_venda.id_venda_fk = tb_venda.id
				LEFT JOIN
					tb_item_produto_compra ON tb_produto.id = tb_item_produto_compra.id_produto_fk
				WHERE
					tb_produto.id = ?1

				ORDER BY
			 		data;
			""", nativeQuery = true)
	List<IControleDeEstoqueDTO> findByControleDeEstoqueSQL(Long id);
	
}