package bdmysql;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

//import java.sql.*;

public class ManipulacaoDados {
	private Connection conexao;
	private Statement execucao;

	public void inserirDados(){
		try { 
			Class.forName("com.mysql.jdbc.Driver"); 
			conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/exercicio30", "DanMay", "SI2013");
			execucao = conexao.createStatement();

			execucao.executeUpdate("INSERT into TabelaTP(nm_nome, vl_preco) VALUES ('Nutella', '11.00')");
			execucao.executeUpdate("INSERT into TabelaTP(nm_nome, vl_preco) VALUES ('Bis Branco', '3.69')");
			execucao.executeUpdate("INSERT into TabelaTP(nm_nome, vl_preco) VALUES ('Ruffles', '5.00')");
			execucao.executeUpdate("INSERT into TabelaTP(nm_nome, vl_preco) VALUES ('Sucrilhos', '8.99')");
			System.out.println("Dados inseridos com sucesso!" + "\n");

			execucao.close();
			conexao.close();

		}catch(java.lang.ClassNotFoundException a){
			System.err.println("Erro ao escrever dados: " +a.getMessage());
		}
		catch(SQLException a){
			System.err.println("Exceção: " +a.getMessage());	
		}
		catch(Exception ex1){
			System.err.println("Exceção 1: " +ex1.getMessage());
		}

	}

	public void leituraDados(){
		try { 
			Class.forName("com.mysql.jdbc.Driver"); 
			conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/exercicio30", "DanMay", "SI2013");
			execucao = conexao.createStatement();

			String consultaDados = "SELECT * FROM TabelaTP";
			ResultSet resultado = execucao.executeQuery(consultaDados);

			System.out.println("==========================");
			System.out.println("Tabela TP Segundo Bimestre");
			System.out.println("==========================");
			while(resultado.next()){
				int c = resultado.getInt("cd_codigo");
				System.out.println("Código: " +c);
				String n = resultado.getString("nm_nome");
				System.out.println("Nome: " +n);
				float v = resultado.getFloat("vl_preco");
				System.out.println("Preço: " +v);
			}
			execucao.close();
			conexao.close();

		}catch(java.lang.ClassNotFoundException a){
			System.err.println("Erro escrevendo dados: " +a.getMessage());
		}
		catch(SQLException a){
			System.err.println("Exceção: " +a.getMessage());	
		}
		catch(Exception ex1){
			System.err.println("Exceção 1: " +ex1.getMessage());
		}
	}
}
