package br.com.senac.projetocrud.tela;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.senac.projetocrud.modelo.Aluno;
import br.com.senac.projetocrud.persistencia.AlunoDAO;

public class TelaGravar extends JFrame {

	private static final long serialVersionUID = 4481286187374431869L;
	
	private JPanel contentPane;
	private JTextField txtMatricula;
	private JTextField txtNome;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaGravar frame = new TelaGravar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaGravar() {
		setTitle("Cadastrar Aluno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(58, 94, 79, 14);
		panel.add(lblNome);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(58, 141, 79, 14);
		panel.add(lblEmail);
		
		JLabel lblMatricula = new JLabel("Matricula");
		lblMatricula.setBounds(58, 46, 79, 14);
		panel.add(lblMatricula);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Recupera os dados do formulário
				int matricula = Integer.parseInt(txtMatricula.getText());
				String nome = txtNome.getText();
				String email = txtEmail.getText();
				
				// Atribui os dados ao objeto aluno
				Aluno a = new Aluno();
				a.setMatricula(matricula);
				a.setNome(nome);
				a.setEmail(email);
				
				// gravar o aluno no banco
				try {
					new AlunoDAO().gravar(a); // Instancia anonima de aluno
					JOptionPane.showMessageDialog(null, "Aluno gravado com sucesso", "Gravar", JOptionPane.INFORMATION_MESSAGE);
				} catch (SQLException e1) {
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Falha ao gravar no banco", "Gravar", JOptionPane.ERROR_MESSAGE);
				} 
			}
		});
		btnCadastrar.setBounds(283, 217, 112, 23);
		panel.add(btnCadastrar);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(58, 63, 112, 20);
		panel.add(txtMatricula);
		txtMatricula.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBounds(58, 110, 193, 20);
		panel.add(txtNome);
		txtNome.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(58, 159, 193, 20);
		panel.add(txtEmail);
		txtEmail.setColumns(10);
	}
}
