package tipagem;

public class Bairro extends Cidade {

	// m�todo construtor de Bairro
	Bairro(String nome_local, int habitantes) {
		//ativa��o do m�todo construtor da superclasse
		super(nome_local, habitantes); 
	}

	public void setNomeBairro(String nome_local){
		this.nome_local = nome_local + "_area";
	}

	public void setHabitantesBairro(int habitantes) {
		this.habitantes = habitantes*200;
	}

	public String getNomeBairro() {
		return nome_local;
	}

	public int getHabitantesBairro() {
		return habitantes;
	}

}
