package geral;

import java.util.Scanner;

public class olamundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float nota1, nota2,nota3,media; 
		
		Scanner leia = new Scanner (System.in); 
		
		System.out.println("\nEntre com a nota1: ");
		nota1 = leia.nextFloat();
		System.out.println("\nEntre com a nota2: ");
		nota2 = leia.nextFloat();
		System.out.println("\nEntre com a nota3: ");
		nota3 = leia.nextFloat();
		
		media = (nota1+nota2+nota3) / 3;
		
		System.out.printf("\nM�dia aritim�tica: %2.2f"+media+ "e a nota1 foi: "+nota1);
		
	}

}
