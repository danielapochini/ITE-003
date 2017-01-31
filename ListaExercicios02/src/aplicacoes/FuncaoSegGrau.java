package aplicacoes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class FuncaoSegGrau extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel L1,L2,L3, L4;
	JButton B1, B2;
	JTextField T1, T2, T3, T4, T5;


	public static float delta(float a, float b, float c){
		return (b*b - 4*a*c);
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args){

		JFrame janela2 = new FuncaoSegGrau();
		janela2.show();
		WindowListener x = new WindowAdapter()
		{ public void windowClosing (WindowEvent fecha)
		{System.exit(0);}
		};
		janela2.addWindowListener(x);
	}

	FuncaoSegGrau(){
		setTitle("Calcular Funções - Segundo Grau");
		setSize(400,240);	
		getContentPane().setBackground(new Color(107, 106, 104));
		getContentPane().setLayout (new GridLayout(3,3));
		L1 = new JLabel(" Coeficientes");
		L1.setForeground(Color.orange);
		L1.setFont(new Font(" ",Font.BOLD,14));
		L2 = new JLabel(" Raiz x1");
		L2.setForeground(Color.white);
		L2.setFont(new Font(" ",Font.BOLD,14));
		L3 = new JLabel(" Raiz x2");
		L3.setForeground(Color.yellow);
		L3.setFont(new Font(" ",Font.BOLD,14));
		L4 = new JLabel("");
		L4.setForeground(Color.yellow);
		L4.setFont(new Font(" ",Font.BOLD,14));
		B1 = new JButton("Calcular");
		B1.setBackground(Color.green);
		B1.setForeground(Color.white);
		B2 = new JButton("Limpar");
		B2.setBackground(Color.cyan);
		B1.setForeground(Color.white);
		B1.addActionListener(this);
		B2.addActionListener(this);
		T1 = new JTextField();
		T1.setForeground(Color.black);
		T2 = new JTextField();
		T2.setForeground(Color.black);
		T3 = new JTextField();
		T3.setForeground(Color.black);
		T4 = new JTextField();
		T4.setForeground(Color.black);
		T4.setEditable(false);
		T5 = new JTextField();
		T5.setForeground(Color.black);
		T5.setEditable(false);
		getContentPane().add(L1);
		getContentPane().add(T1);
		getContentPane().add(T2);
		getContentPane().add(T3);
		getContentPane().add(L2);
		getContentPane().add(T4);
		getContentPane().add(L3);
		getContentPane().add(T5);
		getContentPane().add(L4);
		getContentPane().add(B1);
		getContentPane().add(B2);
	}

	public void actionPerformed(ActionEvent e)
	{

		if (e.getSource()==B2) //BOTÃO LIMPAR
		{
			T1.setText(" ");
			T2.setText(" ");
			T3.setText(" ");
			T4.setText(" ");
			T5.setText(" ");
			return;
		}

		float a=0, b, c;

		try
		{ 
			a = Float.parseFloat(T1.getText());
			b = Float.parseFloat(T2.getText());
			c = Float.parseFloat(T3.getText());
		}
		catch (NumberFormatException erro){ 
			T4.setText("erro");
			T5.setText("erro"); 
			return;
		}

		if (e.getSource()==B1){ 
			if(a==0){
				JOptionPane.showMessageDialog(null, "A NÃO PODE SER 0, DIGITE OUTRO VALOR", "Erro", JOptionPane.ERROR_MESSAGE);
			}

			if(delta(a,b,c)>=0){
				float raiz1 = (-b + (float)Math.sqrt(delta(a,b,c)))/(2*a);
				float raiz2 = (-b - (float)Math.sqrt(delta(a,b,c)))/(2*a);
				T4.setText(" "+raiz1);
				T5.setText(" "+raiz2);

			}
		}
	}

}
