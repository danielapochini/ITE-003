

import javax.swing.JOptionPane;

public class UsaFuncionario {

	public static void main(String[] args) {
		//objetos
		Funcionario funcionario = new Funcionario();
		PessoaJuridica func = new PessoaJuridica();
		String n,r,id,opc;
		int x;
		opc = JOptionPane.showInputDialog("Digite 1 se o contribuinte é Pessoa Física \n"
				+ "Digite 2 se é Pessoa Jurídica");
		x = Integer.parseInt(opc);

		if (opc.length()==1) {
			switch (x) {
			case 1:

				n = JOptionPane.showInputDialog("Digite o nome do Contribuinte: ");
				r = JOptionPane.showInputDialog("Digite o RG do Contribuinte: ");
				id = JOptionPane.showInputDialog("Digite a identificação do cartão do Contribuinte: ");

				funcionario.setNome(n);
				funcionario.setRg(r);
				funcionario.setCartao(id);

				System.out.println("NOME: " +funcionario.getNome());
				System.out.println("RG: " +funcionario.getRg());
				System.out.println("CARTÃO: " +funcionario.getCartao());
				break;

			case 2:

				n = JOptionPane.showInputDialog("Digite o nome do Contribuinte: ");
				r = JOptionPane.showInputDialog("Digite o CNPJ do Contribuinte: ");
				id = JOptionPane.showInputDialog("Digite a identificação do cartão do Contribuinte: ");

				funcionario.setNome(n);
				func.setCnpj(r);
				funcionario.setCartao(id);

				System.out.println("NOME: " +funcionario.getNome());
				System.out.println("CNPJ: " +func.getCnpj());
				System.out.println("CARTÃO: " +funcionario.getCartao());
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida");
				break;
			}

		}


	}

}
