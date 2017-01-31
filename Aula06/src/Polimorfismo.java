import javax.swing.*;

public class Polimorfismo {
	public static void main(String[] args) {
		// declara��o de objeto do tipo superclasse inicializado como "vazio"

		Contribuinte pessoa = null;
		// leitura de variave que definir� com o objeto sera instanciado

		int tipo = Integer.parseInt(JOptionPane.showInputDialog("Digitar op��o: Valor num�rico entre 1 a 4:"));

		// defini��o de como o objeto sera instanciado

		switch (tipo){
		case 1:
			pessoa = new Contribuinte(); //instancia pela superclasse
			break;

		case 2:
			pessoa = new PessoaFisica(); //istancia pela classe Pessoa Fisica
			break;

		case 3:
			pessoa = new PessoaJuridica(); //istancia pela classe Pessoa Jur�dica
			break;

		case 4:
			pessoa = new Funcionario(); //istancia pela classe Funcion�rio
			break;

		default:
		{System.out.println("Tipo n�o pertence a familia");
		System.exit(0); }
		} // fim do switch()

		pessoa.mostraClasse();
	} // fim do void main()

}
