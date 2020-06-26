package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import conexaoDB.Conexao;
import sessao.Sessao;
import sqls.SQLs;

public class modelLogin {
	
	public static boolean buscarUsuario() {
	
	boolean encontrouUsuario = false;	
	Connection conexao;
	conexao = Conexao.getConnection();
	String sql = SQLs.buscarUsuario();

	try {
		Statement stmt;
		stmt = conexao.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()){
			if(rs.getString("usuario").equals(Sessao.getInstance().getUsuario().getLogin()) &&
			   rs.getString("senha").equals(Sessao.getInstance().getUsuario().getSenha())) {
				encontrouUsuario = true;
			}
		}		
		rs.close();
		stmt.close();		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return encontrouUsuario;
	}
	
}
