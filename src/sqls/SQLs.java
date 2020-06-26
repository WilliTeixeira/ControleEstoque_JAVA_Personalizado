package sqls;

import sessao.Sessao;

public class SQLs {

	public static String buscarUsuario() {
		String usuario = Sessao.getInstance().getUsuario().getLogin();
		String senha = Sessao.getInstance().getUsuario().getSenha();	
		String sql = "select usuario, senha from usuarios where usuario = '"+ usuario + "'"
				   + " and senha = '" + senha + "';";
		return sql;
	}
	
	
}
