package aplicacoes;


import javax.swing.*;

public class MultiplicMatrizes {
	public static void main(String[] args) {
		String matriz = "Matriz Resultante: \n";  

		int quantLinhasA, quantColunasA, quantLinhasB, quantColunasB, linhaA, colunaA, linhaB, colunaB, aux = 0;  

		quantLinhasA = Integer.parseInt(JOptionPane.showInputDialog("[Matriz A] Digite a quantidade de Linhas:"));  
		quantColunasA = Integer.parseInt(JOptionPane.showInputDialog("[Matriz A] Digite a quantidade de Colunas:"));  

		quantLinhasB = Integer.parseInt(JOptionPane.showInputDialog("[Matriz B] Digite a quantidade de Linhas:"));  
		quantColunasB = Integer.parseInt(JOptionPane.showInputDialog("[Matriz B] Digite a quantidade de Colunas:"));  

		int matrizA[][] = new int[quantLinhasA][quantColunasA];  
		int matrizB[][] = new int[quantLinhasB][quantColunasB];  
		int resultante[][] = new int[quantLinhasA][quantColunasB];  

		for (linhaA = 0; linhaA < quantLinhasA; linhaA++) {  
			for (colunaA = 0; colunaA < quantColunasA; colunaA++) {  
				matrizA[linhaA][colunaA] = Integer.parseInt(JOptionPane.showInputDialog("[Matriz A] Informe o valor da  "+ linhaA + " coluna " + colunaA + " :"));  
			}  
		}  

		for (linhaB = 0; linhaB < quantLinhasB; linhaB++) {  
			for (colunaB = 0; colunaB < quantColunasB; colunaB++) {  
				matrizB[linhaB][colunaB] = Integer.parseInt(JOptionPane.showInputDialog("[Matriz B] Informe o valor da  "+ linhaB + " coluna " + colunaB + " :"));  

				for (linhaA = 0; linhaA < quantLinhasA; linhaA++) {  
					for (colunaA = 0; colunaA < quantColunasB; colunaA++) {  
						for (int k = 0; k < quantLinhasB; k++) {  
							aux = aux + matrizA[linhaA][k]* matrizB[k][colunaA];  
						}  

						resultante[linhaA][colunaA] = aux;  
						aux = 0;  
					}  
				}  
			}  
		}  

		for (linhaA = 0; linhaA < quantLinhasA; linhaA++) {  
			for (colunaA = 0; colunaA < quantColunasB; colunaA++)  
				matriz = matriz + " \t" + resultante[linhaA][colunaA] +"\t";  
			matriz += "\n";
		}  

		JTextArea saidadados = new JTextArea();
		saidadados.setText(matriz);
		JOptionPane.showMessageDialog(null, saidadados, "Multiplicação de Matrizes", JOptionPane.INFORMATION_MESSAGE); 

	}
}  