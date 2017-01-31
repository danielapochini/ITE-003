package polimorfismo;

public class AdministradorBloco1 extends Condominio {

	private double valordaLuz_bloco1;
	private double valordaAgua_bloco1;

	public AdministradorBloco1(double valordaLuz_bloco1,
			double valordaAgua_bloco1) {		
		this.valordaLuz_bloco1 = valordaLuz_bloco1;
		this.valordaAgua_bloco1 = valordaAgua_bloco1;
	}

	public double calculaAgua() {
		return this.valordaAgua + this.valordaAgua_bloco1;
	}

	public double calculaLuz() {

		return this.valordaLuz + this.valordaLuz_bloco1;
	}

	public void setvalorCondominio(double valordaAgua, double valordaLuz){
		this.valordaAgua = valordaAgua;
		this.valordaLuz = valordaLuz;
		this.valorCondominio = calculaAgua() + calculaLuz();
	}
}
