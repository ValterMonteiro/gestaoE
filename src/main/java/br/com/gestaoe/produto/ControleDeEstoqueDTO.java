package br.com.gestaoe.produto;

import java.io.Serializable;
import java.time.LocalDate;

public class ControleDeEstoqueDTO implements Serializable {

	private static final long serialVersionUID = 1L;	
	
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
    
    
	public ControleDeEstoqueDTO() {
		super();
	}


	public ControleDeEstoqueDTO(LocalDate data, Long id, String descricao, Long entradaQuantidade,
			Double entradaValorUnit, Double entradaValorTotal, Long saidaQuantidade, Double saidaValorUnit,
			Double saidaValorTotal, Long saldoQuantidade, Double saldoValorUnit, Double saldoValorTotal) {
		super();
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


	public LocalDate getData() {
		return data;
	}


	public void setData(LocalDate data) {
		this.data = data;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Long getEntradaQuantidade() {
		return entradaQuantidade;
	}


	public void setEntradaQuantidade(Long entradaQuantidade) {
		this.entradaQuantidade = entradaQuantidade;
	}


	public Double getEntradaValorUnit() {
		return entradaValorUnit;
	}


	public void setEntradaValorUnit(Double entradaValorUnit) {
		this.entradaValorUnit = entradaValorUnit;
	}


	public Double getEntradaValorTotal() {
		return entradaValorTotal;
	}


	public void setEntradaValorTotal(Double entradaValorTotal) {
		this.entradaValorTotal = entradaValorTotal;
	}


	public Long getSaidaQuantidade() {
		return saidaQuantidade;
	}


	public void setSaidaQuantidade(Long saidaQuantidade) {
		this.saidaQuantidade = saidaQuantidade;
	}


	public Double getSaidaValorUnit() {
		return saidaValorUnit;
	}


	public void setSaidaValorUnit(Double saidaValorUnit) {
		this.saidaValorUnit = saidaValorUnit;
	}


	public Double getSaidaValorTotal() {
		return saidaValorTotal;
	}


	public void setSaidaValorTotal(Double saidaValorTotal) {
		this.saidaValorTotal = saidaValorTotal;
	}


	public Long getSaldoQuantidade() {
		return saldoQuantidade;
	}


	public void setSaldoQuantidade(Long saldoQuantidade) {
		this.saldoQuantidade = saldoQuantidade;
	}


	public Double getSaldoValorUnit() {
		return saldoValorUnit;
	}


	public void setSaldoValorUnit(Double saldoValorUnit) {
		this.saldoValorUnit = saldoValorUnit;
	}


	public Double getSaldoValorTotal() {
		return saldoValorTotal;
	}


	public void setSaldoValorTotal(Double saldoValorTotal) {
		this.saldoValorTotal = saldoValorTotal;
	}
    
    
}
