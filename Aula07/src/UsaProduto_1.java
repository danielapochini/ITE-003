
public class UsaProduto_1 extends Produto {
	Produto A = null;

	// public static void main(String[] args) 
	UsaProduto_1(){

		A = new Produto();

		A.setCodigo(101);
		A.setNome("Sabonete");
		A.setQuantidade(5);
		A.setPreco(1.00);

		mostraProduto();
		A.mostraPreco();
		A.setPreco(atualizaPreco(A.getPreco()));
		A.mostraPreco(A.getPreco());

	}

	public double atualizaPreco (double preco){
		System.out.println("utilizando o metodo atualizaPreco() da classe UsaProduto_1");
		return (preco = preco *1.1); //aumenta 10%
	}

	public void mostraProduto(){
		System.out.println("Produto: " +A.getNome()+ "\n" + "Quantidade: " +A.getQuantidade() + "\n"
				+ "Código: " +A.getCodigo());
	}

}
