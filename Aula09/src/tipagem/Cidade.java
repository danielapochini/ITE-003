package tipagem;

public class Cidade extends Municipios {

	protected String nome_local;
	protected int habitantes; 

	Cidade(String nome_local, int habitantes) {
		//inicialmente é chamado o construtor da superclasse
		super(nome_local, habitantes);
	}

	public void setNome(String nome_local) {
		this.nome_local = nome_local;
	}

	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}

	public String getNome() {
		return nome_local;
	}

	public int getHabitantes() {
		return habitantes;
	}


}
