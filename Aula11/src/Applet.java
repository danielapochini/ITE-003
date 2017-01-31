import java.awt.Container;

import javax.swing.*;

public class Applet extends JApplet {

	private static final long serialVersionUID = 1L;

	public void init(){
		JTextArea saidadados = new JTextArea();
		Container janela = getContentPane();
		janela.add(saidadados);
		
		int resultado;
		String saida="";
		
		for (int x=1; x<=10; x++){
			resultado = quadrado(x);
			saida += "o quadrado de " +x+ " é " +resultado+ "\n";
		}
		saidadados.setText(saida);
	}
	
	public int quadrado (int y) {
		return y*y;
	}
	
}
