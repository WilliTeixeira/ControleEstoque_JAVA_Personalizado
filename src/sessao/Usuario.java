package sessao;

public class Usuario {

	String Usuario;
	String Senha;
	
	public Usuario( String CredLogin, String CredSenha){
		Usuario = CredLogin;
		Senha = CredSenha;
	}

	public String getLogin() {
		return Usuario;
	}
	public void setLogin(String login) {
		Usuario = login;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		Senha = senha;
	}
	
}
