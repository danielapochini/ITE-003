package polimorfismo;

import javax.swing.JOptionPane;

public class Resultado {

	public static void main(String[] args) {


		String a,l,a2,l2;
		String opc;
		int x;
		opc = JOptionPane.showInputDialog("Digite 1 se for bloco1, digite 2 se for bloco2");
		x = Integer.parseInt(opc);



		if (opc.length()==1) {
			switch (x) {
			case 1:


				a = JOptionPane.showInputDialog("Digite o valor da agua do Bloco1: ");
				l = JOptionPane.showInputDialog("Digite o valor da luz do Bloco1: ");

				AdministradorBloco1 ac1 = new AdministradorBloco1(Double.parseDouble(a),Double.parseDouble(l));

				a2 = JOptionPane.showInputDialog("Digite o valor da agua do Condominio: ");
				l2 = JOptionPane.showInputDialog("Digite o valor da luz do Condominio: ");

				ac1.setvalorCondominio(Double.parseDouble(a2), Double.parseDouble(l2));


				JOptionPane.showMessageDialog(null, "Valor da agua: " +  ac1.calculaAgua());
				JOptionPane.showMessageDialog(null, "Valor da Luz: " +   ac1.calculaLuz());
				JOptionPane.showMessageDialog(null, "Valor da Condominio: " +   ac1.getValorCondominio());
				break;

			case 2:


				a = JOptionPane.showInputDialog("Digite o valor da agua: ");
				l = JOptionPane.showInputDialog("Digite o valor da luz: ");

				AdministradorBloco2 ac2 = new AdministradorBloco2(Double.parseDouble(a),Double.parseDouble(l));

				a2 = JOptionPane.showInputDialog("Digite o valor da agua do Condominio: ");
				l2 = JOptionPane.showInputDialog("Digite o valor da luz do Condominio: ");

				ac2.setvalorCondominio(Double.parseDouble(a2), Double.parseDouble(l2));

				JOptionPane.showMessageDialog(null, "Valor da agua: " +  ac2.calculaAgua());
				JOptionPane.showMessageDialog(null, "Valor da agua: " +   ac2.calculaLuz());
				JOptionPane.showMessageDialog(null, "Valor da agua: " +   ac2.getValorCondominio());


			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida");
				break;
			}

		}


	}



}


