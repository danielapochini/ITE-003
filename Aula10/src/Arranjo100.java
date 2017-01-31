import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class Arranjo100 {

	public static void main(String[] args) {
		int linha, coluna;
		int matriz[][] = new int [3][2];
		String saida = "linha\tcoluna\telemento\n";

		for (linha = 0; linha < matriz.length; linha++) 
			for (coluna = 0; coluna < matriz[linha].length; coluna++) {
				String elemento = JOptionPane.showInputDialog("Digite elemento da matriz");
				matriz[linha][coluna] = Integer.parseInt(elemento);
				saida += linha + "\t" + coluna + "\t" + matriz[linha][coluna] + "\n";
			}

		JTextArea saidadados = new JTextArea();

		saidadados.setText(saida);

		JOptionPane.showInputDialog(null, saidadados, "matriz", JOptionPane.INFORMATION_MESSAGE);

		System.exit(0);
	}

}
