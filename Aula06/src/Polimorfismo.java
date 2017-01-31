import javax.swing.*;

public class Polimorfismo {
	public static void main(String[] args) {
		// declaração de objeto do tipo superclasse inicializado como "vazio"

		Contribuinte pessoa = null;
		// leitura de variave que definirá com o objeto sera instanciado

		int tipo = Integer.parseInt(JOptionPane.showInputDialog("Digitar opção: Valor numérico entre 1 a 4:"));

		// definição de como o objeto sera instanciado

		switch (tipo){
		case 1:
			pessoa = new Contribuinte(); //instancia pela superclasse
			break;

		case 2:
			pessoa = new PessoaFisica(); //istancia pela classe Pessoa Fisica
			break;

		case 3:
			pessoa = new PessoaJuridica(); //istancia pela classe Pessoa Jurídica
			break;

		case 4:
			pessoa = new Funcionario(); //istancia pela classe Funcionário
			break;

		default:
		{System.out.println("Tipo não pertence a familia");
		System.exit(0); }
		} // fim do switch()

		pessoa.mostraClasse();
	} // fim do void main()

}
