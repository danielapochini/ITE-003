package herancas;

public class UsaFuncionarioSimples {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Daniela Pochini");
		funcionario.setRg("38.126.255-8");
		funcionario.setCartao("404");

		System.out.println("Nome: "+funcionario.getNome());
		System.out.println("RG: " +funcionario.getRg());
		System.out.println("Cartão: " +funcionario.getCartao());
	}

}
