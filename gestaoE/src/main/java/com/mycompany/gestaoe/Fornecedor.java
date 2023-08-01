package com.mycompany.gestaoe;
public class Fornecedor {
	private long codigoFornecedor,cep,tel;
	private String razaoSocial,cpf,rua,bairro,cidade,uf,email;
        private int numero;
        public void validarFornecedor() {

	}
    public Fornecedor(){}
    public Fornecedor(long codigoFornecedor, long cep, long tel, 
            String razaoSocial, String cpf, String rua, String bairro, 
            String cidade, String uf, String email, int numero) {
        this.codigoFornecedor = codigoFornecedor;
        this.cep = cep;
        this.tel = tel;
        this.razaoSocial = razaoSocial;
        this.cpf = cpf;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.email = email;
        this.numero = numero;
    }
    public long getCodigoFornecedor() {
        return codigoFornecedor;
    }
    public void setCodigoFornecedor(long codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    }
    public long getCep() {
        return cep;
    }
    public void setCep(long cep) {
        this.cep = cep;
    }
    public long getTel() {
        return tel;
    }
    public void setTel(long tel) {
        this.tel = tel;
    }
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
}