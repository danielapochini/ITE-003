import javax.swing.JOptionPane;

public class Automovel_Dados {

	public static void main (String args[]){
		//criação do obj na superclasse
		Automovel dados = new Automovel();

		String c, f, ma, mo, y;
		int a;

		c = JOptionPane.showInputDialog("Cor do carro: ");
		f = JOptionPane.showInputDialog("Fabricante do carro: ");
		ma = JOptionPane.showInputDialog("Marca do carro: ");
		mo = JOptionPane.showInputDialog("Modelo do carro: ");
		y = JOptionPane.showInputDialog("Ano do carro: ");

		a = Integer.parseInt(y);

		dados.setano(a);
		dados.setcor(c);
		dados.setfabricante(f);
		dados.setmarca(ma);
		dados.setmodelo(mo);

		System.out.println("Cor do carro: " +dados.getcor());
		System.out.println("Ano do carro: " +dados.getano());
		System.out.println("Marca do carro: " +dados.getmarca());
	}

}
