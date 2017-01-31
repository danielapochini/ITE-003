
public class UsaProduto_2 extends Produto {
	Produto B = new Produto();
	// public static void main(String[] args)
	UsaProduto_2(){


		B.setCodigo(101);
		B.setNome("Bolacha");
		B.setQuantidade(11);
		B.setPreco(4.00);

		mostraProduto();
		B.mostraPreco();
		B.setPreco(atualizaPreco(B.getPreco()));
		B.mostraPreco(B.getPreco());

	}

	public double atualizaPreco (double preco){
		System.out.println("utilizando o metodo atualizaPreco() da classe UsaProduto_1");
		return (preco = preco *0.9); //diminui 10%
	}

	public void mostraProduto(){
		System.out.println("Produto: " +B.getNome()+ "\n" + "Quantidade: " +B.getQuantidade() + "\n"
				+ "Código: " +B.getCodigo());
	}



}
