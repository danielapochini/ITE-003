import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculadora extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	JLabel L1,L2,L3;
	JButton B1, B2, B3, B4, B5, B6, B7, B8, B9;
	JTextField T1, T2, T3;

	public static void main (String args[]) {

		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new Calculadora();
		frame.setTitle("Calculadora");
		frame.setPreferredSize(new Dimension(400, 200));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel("Bem Vindo");
		frame.add(label);
		frame.pack();
		frame.setVisible(true);
	}



	Calculadora() 

	{     
		getContentPane().setBackground (new Color (0,0,0));
		getContentPane().setLayout (new GridLayout(4,4));
		L1 = new JLabel("numero 1");
		L1.setForeground(Color.green);
		L1.setFont(new Font(" ",Font.BOLD,14));
		L2 = new JLabel("numero 2");
		L2.setForeground(Color.blue);
		L2.setFont(new Font(" ",Font.BOLD,14));
		L3 = new JLabel("resultado");
		L3.setForeground(Color.yellow);
		L3.setFont(new Font(" ",Font.BOLD,14));
		B1 = new JButton("+");
		B1.setBackground(Color.black);
		B1.setForeground(Color.white);
		B2 = new JButton("-");
		B2.setBackground(Color.black);
		B2.setForeground(Color.white);
		B3 = new JButton("*");
		B3.setBackground(Color.black);
		B3.setForeground(Color.white);
		B4 = new JButton("/");
		B4.setBackground(Color.black);
		B4.setForeground(Color.white);
		B5 = new JButton("limpar");
		B5.setBackground(Color.blue);
		B5.setForeground(Color.white);
		B6 = new JButton("potência");
		B6.setBackground(Color.blue);
		B6.setForeground(Color.orange);
		B7 = new JButton("raiz");
		B7.setBackground(Color.blue);
		B7.setForeground(Color.green);
		B8 = new JButton("inverso");
		B8.setBackground(Color.blue);
		B8.setForeground(Color.pink);
		B9 = new JButton("aleatório");
		B9.setBackground(Color.yellow);
		B9.setForeground(Color.blue);
		B1.addActionListener(this);
		B2.addActionListener(this);
		B3.addActionListener(this);
		B4.addActionListener(this);
		B5.addActionListener(this);
		B6.addActionListener(this);
		B7.addActionListener(this);
		B8.addActionListener(this);
		B9.addActionListener(this);
		T1 = new JTextField();
		T1.setBackground(Color.black);
		T1.setForeground(Color.white);
		T2 = new JTextField();
		T2.setBackground(Color.black);
		T2.setForeground(Color.white);
		T3 = new JTextField();
		T3.setBackground(Color.black);
		T3.setForeground(Color.white);
		T3.setEditable(false);
		getContentPane().add(L1);
		getContentPane().add(T1);
		getContentPane().add(B1);
		getContentPane().add(B2);
		getContentPane().add(L2);
		getContentPane().add(T2);
		getContentPane().add(B3);
		getContentPane().add(B4);
		getContentPane().add(L3);
		getContentPane().add(T3);
		getContentPane().add(B5);
		getContentPane().add(B6);
		getContentPane().add(B7);
		getContentPane().add(B8);
		getContentPane().add(B9);
	}

	public void actionPerformed(ActionEvent e)
	{

		if (e.getSource()==B5)
		{
			T1.setText(" ");
			T2.setText(" ");
			T3.setText(" ");
			return;
		}

		double n1=0, n2=0, resultado=0;

		try
		{ 
			n1 = Double.parseDouble(T1.getText());
			n2 = Double.parseDouble(T2.getText());
		}
		catch (NumberFormatException erro)
		{ T3.setText("erro"); return;}

		if (e.getSource()==B1)
		{ 
			resultado = n1 + n2;
		}

		if (e.getSource()==B2)
		{ 
			resultado = n1 - n2;
		}

		if (e.getSource()==B3)
		{ 
			resultado = n1 * n2;
		}

		if (e.getSource()==B4)
		{ 
			resultado = n1 / n2;
		}

		if (e.getSource()==B6)
		{ 
			int z = (int)n2;
			resultado = Math.pow(n1,z);
		}

		if (e.getSource()==B7)
		{ 
			resultado = Math.sqrt(n2);
		}

		if (e.getSource()==B8)
		{    
			resultado = 1 / n1;
		}

		if (e.getSource()==B9)
		{ 
			resultado = (int) (Math.random()*n2);
		}

		T3.setText(" "+(float)resultado);

	}
}
