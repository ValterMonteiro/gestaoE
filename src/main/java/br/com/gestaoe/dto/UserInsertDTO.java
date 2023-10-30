package br.com.gestaoe.dto;

public class UserInsertDTO extends UserDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String senha;
	
	public UserInsertDTO() {
	super();
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
