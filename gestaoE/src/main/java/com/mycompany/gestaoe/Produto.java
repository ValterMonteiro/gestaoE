package com.mycompany.gestaoe;
public class Produto {
	private long codigoProduto,saidaQuantidade,entradaQuantidade;
	private String descricao,data;
        private double precoCusto,precoVenda;
        public Produto() {}
        public Produto(long codigoProduto, String descricao, String data, 
            long saidaQuantidade, long entradaQuantidade, 
            double precoCusto, double precoVenda) {
        this.codigoProduto = codigoProduto;
        this.descricao = descricao;
        this.data = data;
        this.saidaQuantidade = saidaQuantidade;
        this.entradaQuantidade = entradaQuantidade;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }
    public void validaProduto() {}
        public void calcularSaldo(){}
    public long getCodigoProduto() {
        return codigoProduto;
    }
    public void setCodigoProduto(long codigoProduto) {
        this.codigoProduto = codigoProduto;
    }
    public long getSaidaQuantidade() {
        return saidaQuantidade;
    }
    public void setSaidaQuantidade(long saidaQuantidade) {
        this.saidaQuantidade = saidaQuantidade;
    }
    public long getEntradaQuantidade() {
        return entradaQuantidade;
    }
    public void setEntradaQuantidade(long entradaQuantidade) {
        this.entradaQuantidade = entradaQuantidade;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
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
}