package com.gestaoE.venda;

import com.gestaoE.gestaoE.List;
import com.gestaoE.funcionario.Funcionario;
import com.gestaoE.cliente.Cliente;

public class Venda {
	private Funcionario funcionario;
	private Cliente cliente;
	private long nfeVenda;
	private String data,hora;
	private List item_Produto;
    public Venda(){
        
    }
        public Venda(Funcionario funcionario, Cliente cliente, 
            long nfeVenda, String data, String hora, List item_Produto) {
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.nfeVenda = nfeVenda;
        this.data = data;
        this.hora = hora;
        this.item_Produto = item_Produto;
    }
	public void validaVenda() {

	}
    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public long getNfeVenda() {
        return nfeVenda;
    }
    public void setNfeVenda(long nfeVenda) {
        this.nfeVenda = nfeVenda;
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