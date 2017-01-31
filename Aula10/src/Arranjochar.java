import javax.swing.*;

public class Arranjochar {

	public static void main(String[] args) { 
		String letras[] = new String [3];
		String saida = "indice\tstring\n";

		for (int i = 0; i < letras.length; i++) {
			String elemento = JOptionPane.showInputDialog("Digite strings da matriz");
			letras[i] = String.valueOf(elemento);
			saida +=i + "\t" + letras[i] + "\n";

		}

		JTextArea saidachar = new JTextArea();

		saidachar.setText(saida);

		JOptionPane.showMessageDialog(null, saidachar, "String da matriz", JOptionPane.INFORMATION_MESSAGE);

		System.exit(0);
	}
}
