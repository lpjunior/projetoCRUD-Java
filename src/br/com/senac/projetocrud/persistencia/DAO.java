package br.com.senac.projetocrud.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Luis Paulo Lessa
 * @since 01/11/2019
 * @version 1.0
 *  Classe responsável por abrir a conexão com o banco
 * */

// D.A.O - Data Access Object
public class DAO {

	public DAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver"); // informando qual classe iremos utilizar como interface para as transações com o SBGD
		} catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
			System.err.println("Classe Driver não localizada. Erro Ocorrido: " + cnfe.getMessage());
		}
	}
	
	// todos os importes das classes para transação com o banco de dados, serão sempre do java.sql.*, aonde o * é o nome da CLASSE
	protected Connection getConexao() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost/db_senac", "root", "");
	}
}
