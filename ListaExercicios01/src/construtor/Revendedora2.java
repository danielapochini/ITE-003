package construtor;
public class Revendedora2 {

	public static void main(String[] args) {
		Revendedora1 C = new Revendedora1();

		C.setMarca("Renault");
		C.setModelo("Sandero");
		C.setAno(2011);
		Automovel.setCor("verde");
		C.setPreco(4500.00);

		/*C.marca= "Renault";
		C.modelo="Sandero";
		C.ano=2011;
		C.cor="azul cintilante";
		C.preco=4500.00;
		 */

		C.mostracarro();
		C.atualizacor();
		C.mostracarro();

		C = null;
		System.gc();

		// C.mostracarro();
	}

}
