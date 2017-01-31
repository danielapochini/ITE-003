
public class Automovel {
	int ano;
	protected String marca;
	String modelo;
	protected static String cor;
	double preco;


	//metodo Construtor

	Automovel(){
		ano=0;
		marca="";
		modelo="";
		cor="";
		preco= 0.0;
	}

	public void atualizacor(){
		cor="preto";
	}

	public void mostracarro(){
		System.out.println("carro marca" + "\t" + marca + "\n" + "modelo" + "\t" 
				+modelo+ "\n" + "ano" + "\t" + ano + "\n" + "cor" + "\t" +cor+ "\n" + "preço" +"\t" +preco);
	}

}
