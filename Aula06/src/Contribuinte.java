public class Contribuinte {
	
	private String nome;
	
	public void setNome (String nome){ //funcao
		this.nome = nome;
	}
	
	public String getNome(){ //procedimento
		return (nome);
	}
	
	public void mostraClasse(){
		System.out.println("Classe Contribuinte");
	}
}
