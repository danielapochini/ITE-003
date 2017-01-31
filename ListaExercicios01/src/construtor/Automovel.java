package construtor;
public class Automovel {
	//atributos
	private int ano;
	private String marca;
	private String modelo;
	private static String cor;
	private double preco;

	//Construtor

	Automovel(){
		this.ano=0;
		this.marca="";
		this.modelo="";
		Automovel.setCor("");
		this.preco= 0.0;
	}

	//metodos set e get

	public void setAno (int ano){
		this.ano = ano;
	}

	public int getAno(){
		return ano;
	}

	public void setMarca(String marca){
		this.marca = marca;
	}

	public String getMarca(){
		return marca;
	}

	public void setModelo(String modelo){
		this.modelo = modelo;
	}

	public String getModelo(){
		return modelo;
	}

	public static String getCor() {
		return cor;
	}

	public static void setCor(String cor) {
		Automovel.cor = cor;
	}

	public void setPreco (double preco){
		this.preco = preco;
	}

	public double getPreco(){
		return preco;
	}	

	public void mostracarro(){
		System.out.println("carro marca" + "\t" + getMarca() + "\n" + "modelo" + "\t" 
				+getModelo()+ "\n" + "ano" + "\t" + getAno() + "\n" + "cor" + "\t" +getCor()+ "\n" + "preço" +"\t" +getPreco());
	}


	public void atualizacor() {
		setCor("azul marinho");
	}

}