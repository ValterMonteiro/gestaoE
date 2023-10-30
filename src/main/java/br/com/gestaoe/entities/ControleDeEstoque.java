package br.com.gestaoe.produto;

import java.time.LocalDate;

public interface ControleDeEstoque {

	LocalDate getData();
	Long getId();
	String getDescricao();
	int getEntradaQuantidade();
	Double getEntradaValorUnit();
	Double getEntradaValorTotal();
	Long getSaidaQuantidade();
	Double getSaidaValorUnit();
	Double getSaidaValorTotal();
	Long getSaldoQuantidade();
	Double getSaldoValorUnit();
	Double getSaldoValorTotal();
	
}
