package com.mycompany.gestaoe;

public class Gerente extends Funcionario{
        private long codigoGerente;
    public Gerente(){}
        public Gerente(long codigoGerente, Funcionario funcionario, 
            long codigoFuncionario, String nome, String cpf, String rua,
            int numero, String bairro, String cidade, long cep, String uf,
            long tel, String email) {
        super(codigoFuncionario, nome, cpf, rua, numero, bairro, 
                cidade, cep, uf, tel, email);
        this.codigoGerente = codigoGerente;
        this.funcionario = funcionario;
    }        
    public long getCodigoGerente() {
        return codigoGerente;
    }
    public void setCodigoGerente(long codigoGerente) {
        this.codigoGerente = codigoGerente;
    }
	private Funcionario funcionario;
    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
