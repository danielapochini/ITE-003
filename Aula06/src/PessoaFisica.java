public class PessoaFisica extends Contribuinte {

	private String rg;
	
	public void setRg (String rg){
		this.rg = rg;
	}
	public String getRg(){
		return (rg);
	}
	
	public void mostraClasse(){
		System.out.println("Classe Pessoa Física");
	}
}
