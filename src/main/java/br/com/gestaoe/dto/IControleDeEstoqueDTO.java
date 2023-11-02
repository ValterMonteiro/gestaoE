package br.com.gestaoe.dto;

import java.time.LocalDate;

public interface IControleDeEstoqueDTO {
	
	LocalDate getData();
	Long getIdProduto();
	String getDescricao();
	Integer getEntradaQuantidade();
	Double getEntradaValorUnit();
	Double getEntradaValorTotal();
	Long getSaidaQuantidade();
	Double getSaidaValorUnit();
	Double getSaidaValorTotal();
	Long getSaldoQuantidade();
	Double getSaldoValorMedio();
	Double getSaldoValorTotal();

}
