package br.com.senac.projetocrud.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.senac.projetocrud.modelo.Aluno;

// Classe responsável por efetuar as transações de banco de dados da classe Aluno
public class AlunoDAO extends DAO {

	private Connection conn;
	
	public AlunoDAO() {
		
	}
	
	/** Método responsável por gravar os dados no banco **/
	public void gravar(Aluno a) throws SQLException {
		abreConexao();
		
		PreparedStatement pstmt = null;
		
		try {
			// defini a query SQL
			pstmt = conn.prepareStatement("insert into tb_aluno(nome, email, matricula) values (?, ?, ?)");
			
			// efetuar o data bind(passagem de valor)
			pstmt.setString(1, a.getNome());
			pstmt.setInt(3, a.getMatricula());
			pstmt.setString(2, a.getEmail());
			
			if(pstmt.executeUpdate() == 0) {
				throw new SQLException("Ocorreu um erro ao gravar no banco.");
			}
		} finally {
			if(conn != null)
				conn.close();
			if(pstmt != null)
				pstmt.close();
		}
		// Prepara o contexto de operação
		
	}
	public List<Aluno> listar() throws SQLException {
		abreConexao();
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
		
			pstmt = conn.prepareStatement("select * from tb_aluno");
			// pstmt.executeQuery() - executar a query e trazer o resultado de consulta
			rs = pstmt.executeQuery();
			
			List<Aluno> listaDeAlunos = new ArrayList<Aluno>();
			
			while(rs.next()) {
				listaDeAlunos.add(criaObjAluno(rs));
			}
			
			return listaDeAlunos;
		} finally {
			if(conn != null)
				conn.close();
			if(pstmt != null)
				pstmt.close();
			if(rs != null)
				rs.close();
		}
	}
	public void localizarPorId(int id) {
		abreConexao();
	}
	public void localizarPorNome(String nome) {
		abreConexao();
	}
	public void atualizar(Aluno a) {
		abreConexao();
	}
	public void excluir(int id) {
		abreConexao();
	}
	
	private void abreConexao() {
		try {
			conn = getConexao();
		} catch (SQLException se) {
			se.printStackTrace();
			System.err.println("Não foi possível guardar no banco. Erro: " + se.getMessage());
		}
	}
	
	private Aluno criaObjAluno(ResultSet rs) throws SQLException {
		Aluno aluno = new Aluno();
		
		aluno.setId(rs.getLong(1));
		aluno.setNome(rs.getString(2));
		aluno.setEmail(rs.getString(3));
		aluno.setMatricula(rs.getInt(4));
		
		return aluno;
	}
}
