import javax.swing.*;

public class Arranjo9 {

	public static void main(String[] args) {
		float calculo = 0;
		float matriz[] = new float [3];
		String saida = "indice\tmatriz\n";

		for (int i = 0; i < matriz.length; i++) {
			String elemento = JOptionPane.showInputDialog("digite elemento da matriz");
			matriz[i] = Float.parseFloat(elemento);
			saida += i + "\t" + matriz[i] + "\n";
		}

		calculo=(matriz[0]+matriz[1])/matriz[2];
		saida += "calculo" + "=" +calculo;

		JTextArea saidadados = new JTextArea();

		saidadados.setText(saida);

		JOptionPane.showMessageDialog(null, saidadados, "matriz", JOptionPane.INFORMATION_MESSAGE);

		System.exit(0);
	}

}
