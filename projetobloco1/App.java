package projetobloco1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		CidadeI city = new CidadeI("", "", 0.0, true, 0, 0); // objeto
		Nacional nac = new Nacional("");

		System.out.println("Ol�, seja bem vinde a 44 Turismo "
				+ "\nQual seu nome?");
		String nome = leia.next();

		//nac.opcoesMenuN();
		city.escolhaCidade();	
	}
}


