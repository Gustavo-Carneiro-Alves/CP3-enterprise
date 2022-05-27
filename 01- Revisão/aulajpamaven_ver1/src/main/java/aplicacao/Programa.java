package aplicacao;

import dominio.Pessoa;

public class Programa {
	public static void main(String[] args) {
		
		//Instanciando o objeto
		Pessoa p1 = new Pessoa(1, "Jubilelson Claudio", "jubjub@gmail.com");
		Pessoa p2 = new Pessoa(2, "Kleber Mario", "kleb@gmail.com");
		Pessoa p3 = new Pessoa(3, "Luziangela Aparecida", "luzinha@gmail.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
