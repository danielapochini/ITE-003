import javax.swing.*;

public class Arranjo8 {

	public static void main(String[] args) {

		String saida = "indice\tmatriz\n";
		int soma = 0;
		int matriz[] = new int[3];

		for (int i=0; i < matriz.length; i++){
			String elemento = JOptionPane.showInputDialog("Digite o elemento da matriz");
			matriz [i] = Integer.parseInt(elemento);
			soma += matriz[i];
			saida += i + "\t" + matriz[i] + "\n";
		}

		saida += "soma" + " = " +soma;

		JTextArea saidadados = new JTextArea();
		saidadados.setText(saida);

		JOptionPane.showMessageDialog(null, saidadados, "matriz", JOptionPane.INFORMATION_MESSAGE);

		System.exit(0); //termina o aplicativo
	} //fim main
}
