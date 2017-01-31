package tipagem;

import javax.swing.*;

public class Interface_Tipagem {
	String p;
	int q;
	Cidade r = null;

	// metodo do tipo da superclasse

	public Cidade locais_cidade(){
		p = JOptionPane.showInputDialog("Digitar nome do local");
		q = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade  de habitantes"));
		String local = JOptionPane.showInputDialog(" Cidade = c \n Bairro = b \n Distrito = d \n");
		char tipo = local.charAt(0);

		if (tipo == 'c'){
			return new Cidade(p,q);
		}

		if (tipo == 'b'){
			return new Bairro(p,q);
		}

		else if (tipo == 'd'){
			return new Distrito(p,q);
		}

		else{
			return null;
		}
	}

	public void tipo_local(Cidade f){
		//o operador instanceOf permite definir se uma instância é ou não de determinada classe
		if (f instanceof Bairro){
			((Bairro)f).setNomeBairro(p);
			((Bairro)f).setHabitantesBairro(q);
			System.out.println("O local é um bairro." + 
					"\n Nome do bairro: " + ((Bairro)f).getNomeBairro() +
					"\n Numero de habitantes: " + ((Bairro)f).getHabitantesBairro());
		}

		else if (f instanceof Distrito){
			((Distrito)f).setNomeDistrito(p);
			((Distrito)f).setHabitantesDistrito(q);
			System.out.println("O local é um distrito." + 
					"\n Nome do bairro: " + ((Distrito)f).getNomeDistrito() +
					"\n Numero de habitantes: " + ((Distrito)f).getHabitantesDistrito());
		}

		else{
			f.setNome(p);
			f.setHabitantes(q);
			System.out.println("O local é uma cidade." + 
					"\n Nome da Cidade: " + ((Cidade)f).getNome() +
					"\n Numero de habitantes: " + ((Cidade)f).getHabitantes());
		}
	}
}
