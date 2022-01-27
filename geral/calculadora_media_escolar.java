package geral;

import java.util.Scanner;

public class calculadora_media_escolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
		aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
		respectivamente.*/
		
		float nota1,nota2,nota3,mediaF;

		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com a nota1: ");
		nota1 = leia.nextFloat();
		System.out.println("\nEntre com a nota2: ");
		nota2 = leia.nextFloat();
		System.out.println("\nEntre com a nota3: ");
		nota3 = leia.nextFloat();
		
		mediaF = (nota1+nota2+nota3) / 3;
		
		System.out.println("\nA média final é: "+mediaF);
		
	}

}
