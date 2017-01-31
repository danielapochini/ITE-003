public class Modela_Automovel {

	public static void main(String[] args) {
		// objetos C e E
		Automovel1 C = new Automovel1();
		Automovel1 E = new Automovel1();

		C.setMarca("Renault");
		C.setModelo("Sandero");
		C.setAno(2011);
		C.setCor("verde");
		C.setPreco(4500.00);

		Modela(C);

		E.setMarca("Volkswagem");
		E.setModelo("Fusca");

		Modela(E);
	}

	//metodo (interno a classe) que recebe como parametro um objeto do tipo Automovel1
	public static void Modela (Automovel1 D){
		//sobrecarga do metodo mostracarro();
		D.mostracarro();
		D.mostracarro(D.getMarca(), D.getModelo());
	}

}
