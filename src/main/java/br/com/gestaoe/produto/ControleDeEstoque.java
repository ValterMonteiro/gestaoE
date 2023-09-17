package br.com.gestaoe.produto;

import java.time.LocalDate;

public interface ControleDeEstoque {

	LocalDate getData();
	Long getId();
	String getDescricao();
	Long getEntradaQuantidade();
	double getEntradaValorUnit();
	double getEntradaValorTotal();
	Long getSaidaQuantidade();
	double getSaidaValorUnit();
	double getSaidaValorTotal();
	Long getSaldoQuantidade();
	double getSaldoValorUnit();
	double getSaldoValorTotal();
	
}
