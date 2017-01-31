package construtor;
public class Revendedora1 extends Automovel {

	public static void main(String[] args) {
		//objetos A e B
		Automovel B = new Automovel();
		Automovel A = new Automovel();

		B.setMarca("Ford");
		B.setModelo("Fiesta");
		B.setAno(2013);
		Automovel.setCor("branco");
		B.setPreco(4500.00);

		B.mostracarro();
		B.atualizacor();
		B.mostracarro();

		/*B.marca= "Ford";
		B.modelo="Fiesta";
		B.ano=2013;
		B.cor="branco";
		B.preco=4500.00;
		 */

		A.setMarca("Chevrolet");
		A.setModelo("Onix");
		A.setAno(2014);
		A.setPreco(7000.00);

		A.mostracarro();

		/*	A.marca= "Chevrolet";
		A.modelo="Onix";
		A.ano=2014;
		A.preco=7000.00;
		A.mostracarro();*/

	}

}
