/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.gestaoe.produto;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
		
	
	// Método personalizado para executar a consulta SQL desejada
    @Query(value ="SELECT\r\n"
    		+ "    	    tb_produto.data AS data,\r\n"
    		+ "    	    tb_produto.id AS id_produto,\r\n"
    		+ "    	    tb_produto.descricao AS descricao,\r\n"
    		+ "    	    tb_item_produto_compra.quantidade AS entrada_quantidade,\r\n"
    		+ "    	    tb_produto.preco_custo AS entrada_valor_unit,\r\n"
    		+ "    	    (cast(tb_item_produto_compra.quantidade as float) * tb_produto.preco_custo) AS entrada_valor_total,\r\n"
    		+ "    	    tb_item_produto_venda.quantidade AS saida_quantidade,\r\n"
    		+ "    	    tb_produto.preco_custo AS saida_valor_unit,\r\n"
    		+ "    	    (cast(tb_item_produto_venda.quantidade as float) * tb_produto.preco_custo) AS saida_valor_total,\r\n"
    		+ "    	    (tb_item_produto_compra.quantidade - tb_item_produto_venda.quantidade) AS saldo_quantidade,\r\n"
    		+ "    	    (tb_item_produto_compra.quantidade * tb_produto.preco_custo) AS saldo_valor_medio,\r\n"
    		+ "    	    (((cast(tb_item_produto_compra.quantidade as float) * tb_produto.preco_custo)) * ((cast(tb_item_produto_venda.quantidade as float) * tb_produto.preco_custo))) AS saldo_valor_total\r\n"
    		+ "    	FROM\r\n"
    		+ "    	    tb_produto\r\n"
    		+ "    	LEFT JOIN\r\n"
    		+ "    	    tb_item_produto_compra ON tb_produto.id = tb_item_produto_compra.id_produto_fk\r\n"
    		+ "    	LEFT JOIN\r\n"
    		+ "    	    tb_item_produto_venda ON tb_produto.id = tb_item_produto_venda.id_produto_fk;"
    		
    , nativeQuery = true)
    List<Object[]> customQueryForControleDeEstoque();
}