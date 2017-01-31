
public class Dados_Aluno {

	public static void main (String args[]){
		// Criação de objetos na superclasse
		Aluno dados = new Aluno();

		// Inserção de dados nos atributos
		dados.setnome("Daniela");
		dados.setcurso("Sistemas para Internet");
		dados.setidade(21);

		// Consulta de dados nos atributos
		System.out.println("Nome do aluno: " +dados.getnome());
		System.out.println("Curso do aluno: " +dados.getcurso());
		System.out.println("Idade do aluno: " +dados.getidade());
	}
}
