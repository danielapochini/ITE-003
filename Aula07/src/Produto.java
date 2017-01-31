
public class Produto {

	// variaveis de instancia - atributos

	private int codigo;
	private String nome;
	private int quantidade;
	private double preco;

	// metodo construtor

	Produto(){
		codigo = 0;
		nome = "";
		quantidade = 0;
		preco = 0.0;
	}

	// metodos sets

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	// metodos gets

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double getPreco() {
		return preco;
	}


	public void mostraPreco(){
		System.out.println("Preço sem atualizar: " +getPreco());
	}

	public void mostraPreco (double preco_atualizado){
		System.out.println("Preço atualizado: " +preco_atualizado);
	}

	public double atualizaPreco(double preco){
		return preco;
	}

	//fim da classe Produto
}
