package polimorfismo;

public class AdministradorBloco2 extends Condominio {

	private double valordaLuz_bloco2;
	private double valordaAgua_bloco2;

	public AdministradorBloco2(double valordaLuz_bloco2,
			double valordaAgua_bloco2) {
		super();
		this.valordaLuz_bloco2 = valordaLuz_bloco2;
		this.valordaAgua_bloco2 = valordaAgua_bloco2;
	}

	public double calculaAgua() {
		return this.valordaAgua + valordaAgua_bloco2;
	}

	public double calculaLuz() {

		return this.valordaLuz + valordaLuz_bloco2;
	}

	public void setvalorCondominio(double valordaAgua, double valordaLuz){
		this.valordaAgua = valordaAgua;
		this.valordaLuz = valordaLuz;
		super.valorCondominio = calculaAgua() + calculaLuz();
	}
}
