
public class Aluno {

	// Atributos da Classe

	String nome;
	String curso;
	int idade;

	// Metodos da Classe

	public void setnome (String nome){
		this.nome = nome;
	}

	public void setcurso (String curso){
		this.curso = curso;
	}

	public void setidade (int idade){
		this.idade = idade;
	}

	public String getnome(){
		return nome;
	}

	public int getidade(){
		return idade;
	}

	public String getcurso(){
		return curso;
	}
}
