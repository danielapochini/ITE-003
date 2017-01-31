public class Automovel1 {

	//variaveis de instancia (atributos)

	private int ano;
	protected String marca;
	private String modelo;
	private String cor;
	private double preco;


	Automovel1(){
		ano=0;
		marca="";
		modelo="";
		cor="";
		preco= 0.0;
	}

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

	public void setPreco (double preco){
		this.preco = preco;
	}

	public double getPreco(){
		return preco;
	}	

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void mostracarro(){
		System.out.println("carro marca" + "\t" + marca + "\n" + "modelo" + "\t" 
				+modelo+ "\n" + "ano" + "\t" + ano + "\n" + "cor" + "\t" +cor+ "\n" + "preço" +"\t" +preco);
	}

	public void mostracarro(String mc, String md){
		System.out.println("carro marca: " + "\t" +mc+ "\n" + "Modelo: " +md);
	}

}
