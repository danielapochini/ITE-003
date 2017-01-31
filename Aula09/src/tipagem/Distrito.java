package tipagem;

public class Distrito extends Cidade {

	// método construtor de Distrito
	public Distrito(String nome_local, int habitantes) {
		//ativação do método construtor da superclasse
		super(nome_local, habitantes); 
	}

	public void setNomeDistrito(String nome_local){
		this.nome_local = nome_local + "_district";
	}

	public void setHabitantesDistrito(int habitantes) {
		this.habitantes = habitantes*300;
	}

	public String getNomeDistrito() {
		return nome_local;
	}

	public int getHabitantesDistrito() {
		return habitantes;
	}
}
