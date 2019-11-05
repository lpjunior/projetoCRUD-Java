package br.com.senac.projetocrud.aplicativo;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.senac.projetocrud.modelo.Aluno;
import br.com.senac.projetocrud.modelo.Disciplina;
import br.com.senac.projetocrud.persistencia.AlunoDAO;

public class App {
	public static void main(String[] args) {

		Aluno aluno01 = new Aluno();
		Disciplina disciplina01 = new Disciplina();
		AlunoDAO dao = new AlunoDAO();
		
		// Atribuição dos dados do aluno01
		aluno01.setId(1);
		aluno01.setNome("Joãozinho");
		aluno01.setEmail("joaozinho@senac.com.br");
		aluno01.setMatricula(1234);
		
//		try {
//			dao.gravar(aluno01);
//			System.out.println("Dados gravados com sucesso!!!");
//		} catch (SQLException e) {
//			e.printStackTrace();
//			System.err.println("==> Ocorreu um erro ao executar o insert <==");
//		}
		
		// Atribuição dos dados da disciplina01
		disciplina01.setDisciplina("Linguagem de Programação");
		disciplina01.setNota01(3.);
		disciplina01.setNota02(1.2);
		
		// Associação entre aluno01 e disciplina01
		aluno01.setDisciplina(disciplina01);
		
		//System.out.println(aluno01);
		JOptionPane.showMessageDialog(null, aluno01);
		
		/******************************************************/
		
		Aluno aluno02 = new Aluno(32, "Sandro", "sandro@gmail.com", 789);
		// atribuindo uma referencia da Classe Disciplina
		//Disciplina d2 = new Disciplina();
		aluno02.setDisciplina(new Disciplina());
		
		//d2.setDisciplina("Linguagem de Script para web");
		// aluno02.getDisciplina() é equivalente ao d2 
		aluno02.getDisciplina().setDisciplina("Linguagem de Script para web");
		aluno02.getDisciplina().setNota01(8.5);
		aluno02.getDisciplina().setNota02(6.4);
		JOptionPane.showMessageDialog(null, aluno02);
		
//		try {
//			dao.gravar(aluno02);
//			System.out.println("Dados gravados com sucesso!!!");
//		} catch (SQLException e) {
//			e.printStackTrace();
//			System.err.println("==> Ocorreu um erro ao executar o insert <==");
//		}
		
		/******************************************************/
		Aluno aluno03 = new Aluno(78, "Paulo", "paulo@gmail.com", 852);
		aluno03.setDisciplina(new Disciplina("PHP com banco de dados", 10., 8.7));
		
		JOptionPane.showMessageDialog(null, aluno03);
		
		/******************************************************/
		
		try {
			for(Aluno a : dao.listar()) {
				System.out.println(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
