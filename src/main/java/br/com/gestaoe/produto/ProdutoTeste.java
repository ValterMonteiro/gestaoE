package br.com.gestaoe.produto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class ProdutoTeste implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long codigoProduto;
	private String descricao;
	private LocalDate data;
	private int saidaQuantidade;
	private int entradaQuantidade;
    private double precoCusto;
    private double precoVenda;
    
    public void validarProduto(){};
    public void calcularSaldo(){}
	
    
    public ProdutoTeste() {	}
    
	public ProdutoTeste(long codigoProduto, String descricao, LocalDate data, int saidaQuantidade, int entradaQuantidade,
			double precoCusto, double precoVenda) {
		this.codigoProduto = codigoProduto;
		this.descricao = descricao;
		this.data = data;
		this.saidaQuantidade = saidaQuantidade;
		this.entradaQuantidade = entradaQuantidade;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
	}
	
	
	public long getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(long codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	public long getSaidaQuantidade() {
		return saidaQuantidade;
	}
	public void setSaidaQuantidade(int saidaQuantidade) {
		this.saidaQuantidade = saidaQuantidade;
	}
	public long getEntradaQuantidade() {
		return entradaQuantidade;
	}
	public void setEntradaQuantidade(int entradaQuantidade) {
		this.entradaQuantidade = entradaQuantidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public double getPrecoCusto() {
		return precoCusto;
	}
	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}
	public double getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codigoProduto);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoTeste other = (ProdutoTeste) obj;
		return codigoProduto == other.codigoProduto;
	};    

	
}
