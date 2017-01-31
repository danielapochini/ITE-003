package tipagem;

public class Usa_Tipagem {

	public static void main(String[] args) {
		// constru��o do objeto que representar� a interface tipagem
		Interface_Tipagem IT = new Interface_Tipagem();

		//objeto da superclasse Cidade
		Cidade CD;

		//uso do m�todo locais_cidade da interface atrav�s do objeto da superclasse
		CD = IT.locais_cidade();

		//no m�todo da interface locais_cidade � definido que classe � o objeto
		IT.tipo_local(CD);


		/*		O identificador de objeto pode receber endere�os das inst�ncias de sua classe
		ou de qualquer objeto descendente.
		O objeto ou identificador CD recebe o endere�o da inst�ncia das classes Cidade,
		Bairro e Distrito. Este identificador passa a conter o endere�o/refer�ncia de 
		uma inst�ncia de subclasse de Cidade.
		A compatibilidade de endere�os de identificadores de uma classe com inst�ncias 
		de subclasses � denominada SUBTIPAGEM (Boratti, 2007).	*/

	}

}
