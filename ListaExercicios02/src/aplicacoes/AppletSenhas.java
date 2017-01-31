package aplicacoes;

import java.awt.*;  
import java.awt.event.*;  

import javax.swing.*;  

import java.sql.*;

public class AppletSenhas extends JApplet implements ActionListener  
{  
	private static final long serialVersionUID = 1L;
	private Connection conexao;
	private Statement execucao;
	AppletSenhas applet;
	JLabel titulo, rotulo1, rotulo2;  
	JTextField caixa1, caixa2;  
	JTextArea saidadados;
	JButton botao;  


	public void init()  
	{  
		//Criando o frame
		Container janela = getContentPane();
		janela.setLayout(new FlowLayout()); 
		titulo = new JLabel("Autenticação Usuário Administrador");  
		janela.add(titulo);  

		rotulo1 = new JLabel("Login:");  
		caixa1 = new JTextField("", 8); 
		janela.add(rotulo1); janela.add(caixa1);  

		rotulo2 = new JLabel("Senha:");  
		caixa2 = new JPasswordField("",8);  
		janela.add(rotulo2); janela.add(caixa2);  

		botao = new JButton("Enviar");  
		janela.add(botao);  
		botao.addActionListener(this);  

		saidadados = new JTextArea(10,50);
		saidadados.setLineWrap(true);
		saidadados.setText("");
		saidadados.setEditable(false);
		janela.add(saidadados);

		applet=this;
	}  

	public void consultaDados() {
		try {
			//Declarando uso do sql driver e informações do servidor
			Class.forName("com.mysql.jdbc.Driver");
			conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/exercicio29", "DanMay", "SI2013");
			execucao = conexao.createStatement();

			// usando o executeQuery():
			String consultaDados = "SELECT * FROM usuarios";
			ResultSet resultado = execucao.executeQuery(consultaDados);


			// Gerando resultados
			while (resultado.next()) {
				int id = resultado.getInt("cd_usuarios");
				String user = resultado.getString("nm_login");
				String senha = resultado.getString("nm_senha");
				String privilegio = resultado.getString("ds_funcao");
				saidadados.append("ID: " +id+ " LOGIN : " +user+ " SENHA: " + senha + " FUNÇÃO: " +privilegio + "\n");
			}
			// Fechando conexão após terminar
			conexao.close();
			execucao.close();
		} //exceções caso erro
		catch(java.lang.ClassNotFoundException a){
			System.err.println("Erro escrevendo dados: " +a.getMessage());
		}

		catch (SQLException e) {
			System.err.println(
					"Exceção: " + e.getMessage());
			return;
		}
	}

	public void autenticaDados(){

		try{
			Class.forName("com.mysql.jdbc.Driver");
			conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/exercicio29", "DanMay", "SI2013");	
			PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM `usuarios` WHERE `nm_login` = ? AND `nm_senha` = ? AND `ds_funcao` = ? ");
			stmt.setString(1, caixa1.getText());
			stmt.setString(2, caixa2.getText());
			stmt.setString(3, "admin");
			ResultSet rs = stmt.executeQuery();

			if(!rs.next())
			{
				saidadados.append("Autenticação inválida, acesso autorizado apenas à usuários administradores");
			}
			else
			{
				do{
					applet.consultaDados();
				}while(rs.next());
			}
		}


		catch (SQLException b) {
			System.err.println(
					"Exceção:" + b.getMessage());
			return;
		} catch (ClassNotFoundException e) {
			System.err.println("Erro escrevendo dados: " +e.getMessage());
		}
	}

	public void actionPerformed(ActionEvent e){  
		//ação ao pressionar o botao enviar
		applet.autenticaDados();
	}

}	
