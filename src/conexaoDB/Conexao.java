package conexaoDB;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	
	private static String url;
	private static String usuario;
	private static String senha;
	private static Connection con;
	
	public static Connection getConnection() {

		url = "jdbc:postgresql://localhost:5432/teste1";
		usuario = "postgres";
		senha = "root";		
		
		try {	
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url, usuario, senha);
			System.out.println("Conexão realizada!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
}
