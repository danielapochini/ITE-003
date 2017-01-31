package tipagem;

public class Usa_Tipagem {

	public static void main(String[] args) {
		// construção do objeto que representará a interface tipagem
		Interface_Tipagem IT = new Interface_Tipagem();

		//objeto da superclasse Cidade
		Cidade CD;

		//uso do método locais_cidade da interface através do objeto da superclasse
		CD = IT.locais_cidade();

		//no método da interface locais_cidade é definido que classe é o objeto
		IT.tipo_local(CD);


		/*		O identificador de objeto pode receber endereços das instâncias de sua classe
		ou de qualquer objeto descendente.
		O objeto ou identificador CD recebe o endereço da instância das classes Cidade,
		Bairro e Distrito. Este identificador passa a conter o endereço/referência de 
		uma instância de subclasse de Cidade.
		A compatibilidade de endereços de identificadores de uma classe com instâncias 
		de subclasses é denominada SUBTIPAGEM (Boratti, 2007).	*/

	}

}
