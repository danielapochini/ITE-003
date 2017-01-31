import javax.swing.JOptionPane;

public class Dados_Aluno1 {
	public static void main (String args[]){
		// Criação de objeto na superclasse
		Aluno dados = new Aluno();

		String u,v,t;
		int x;

		// Inserção de dados nos atributos

		u = JOptionPane.showInputDialog(" escrever o nome do aluno: ");
		t = JOptionPane.showInputDialog(" escrever a idade do aluno: ");
		v = JOptionPane.showInputDialog("escrever o curso do aluno: ");

		//transformar String em Int
		x = Integer.parseInt(t);

		dados.setnome(u);
		dados.setidade(x);
		dados.setcurso(v);

		// consulta de dados dos atributos

		System.out.println("Nome do aluno: " +dados.getnome());
		System.out.println("Idade do aluno: " +dados.getidade());
		System.out.println("Curso do aluno: " +dados.getcurso());

	}
}
