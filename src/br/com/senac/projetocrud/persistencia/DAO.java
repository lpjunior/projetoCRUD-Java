package br.com.senac.projetocrud.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Luis Paulo Lessa
 * @since 01/11/2019
 * @version 1.0
 *  Classe respons�vel por abrir a conex�o com o banco
 * */

// D.A.O - Data Access Object
public class DAO {

	public DAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver"); // informando qual classe iremos utilizar como interface para as transa��es com o SBGD
		} catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
			System.err.println("Classe Driver n�o localizada. Erro Ocorrido: " + cnfe.getMessage());
		}
	}
	
	// todos os importes das classes para transa��o com o banco de dados, ser�o sempre do java.sql.*, aonde o * � o nome da CLASSE
	protected Connection getConexao() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost/db_senac", "root", "");
	}
}
