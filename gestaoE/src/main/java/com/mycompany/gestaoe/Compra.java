package com.mycompany.gestaoe;
public class Compra {
	private Funcionario funcionario;
	private Fornecedor fornecedor;
	private long nfeCompra;
	private String data,hora;
	private List item_Produto;
	public void validaCompra() {
        }
    public Compra(){
    }
    public Compra(Funcionario funcionario, Fornecedor fornecedor, 
            long nfeCompra, String data, String hora, List item_Produto) {
        this.funcionario = funcionario;
        this.fornecedor = fornecedor;
        this.nfeCompra = nfeCompra;
        this.data = data;
        this.hora = hora;
        this.item_Produto = item_Produto;
    }
    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public Fornecedor getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    public long getNfeCompra() {
        return nfeCompra;
    }
    public void setNfeCompra(long nfeCompra) {
        this.nfeCompra = nfeCompra;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public List getItem_Produto() {
        return item_Produto;
    }
    public void setItem_Produto(List item_Produto) {
        this.item_Produto = item_Produto;
    }
}