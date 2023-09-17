package br.com.gestaoe.produto;

import java.time.LocalDate;

public class ControleDeEstoqueImpl implements ControleDeEstoque {
	
	private LocalDate data;
    private Long id;
    private String descricao;
    private Long entradaQuantidade;
    private Double entradaValorUnit;
    private Double entradaValorTotal;
    private Long saidaQuantidade;
    private Double saidaValorUnit;
    private Double saidaValorTotal;
    private Long saldoQuantidade;
    private Double saldoValorUnit;
    private Double saldoValorTotal;
    
    
    
	public ControleDeEstoqueImpl() {
	}
	
	
	public ControleDeEstoqueImpl(LocalDate data, Long id, String descricao, Long entradaQuantidade,
			Double entradaValorUnit, Double entradaValorTotal, Long saidaQuantidade, Double saidaValorUnit,
			Double saidaValorTotal, Long saldoQuantidade, Double saldoValorUnit, Double saldoValorTotal) {
		this.data = data;
		this.id = id;
		this.descricao = descricao;
		this.entradaQuantidade = entradaQuantidade;
		this.entradaValorUnit = entradaValorUnit;
		this.entradaValorTotal = entradaValorTotal;
		this.saidaQuantidade = saidaQuantidade;
		this.saidaValorUnit = saidaValorUnit;
		this.saidaValorTotal = saidaValorTotal;
		this.saldoQuantidade = saldoQuantidade;
		this.saldoValorUnit = saldoValorUnit;
		this.saldoValorTotal = saldoValorTotal;
	}



	@Override
	public LocalDate getData() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Long getEntradaQuantidade() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public double getEntradaValorUnit() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getEntradaValorTotal() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Long getSaidaQuantidade() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public double getSaidaValorUnit() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getSaidaValorTotal() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Long getSaldoQuantidade() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public double getSaldoValorUnit() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getSaldoValorTotal() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setEntradaQuantidade(Long entradaQuantidade) {
		this.entradaQuantidade = entradaQuantidade;
	}
	public void setEntradaValorUnit(Double entradaValorUnit) {
		this.entradaValorUnit = entradaValorUnit;
	}
	public void setEntradaValorTotal(Double entradaValorTotal) {
		this.entradaValorTotal = entradaValorTotal;
	}
	public void setSaidaQuantidade(Long saidaQuantidade) {
		this.saidaQuantidade = saidaQuantidade;
	}
	public void setSaidaValorUnit(Double saidaValorUnit) {
		this.saidaValorUnit = saidaValorUnit;
	}
	public void setSaidaValorTotal(Double saidaValorTotal) {
		this.saidaValorTotal = saidaValorTotal;
	}
	public void setSaldoQuantidade(Long saldoQuantidade) {
		this.saldoQuantidade = saldoQuantidade;
	}
	public void setSaldoValorUnit(Double saldoValorUnit) {
		this.saldoValorUnit = saldoValorUnit;
	}
	public void setSaldoValorTotal(Double saldoValorTotal) {
		this.saldoValorTotal = saldoValorTotal;
	}
	
	

}
