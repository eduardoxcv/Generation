package lacos_repeticao;

import java.util.Scanner;

public class lacos_repeticao_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		 */

		int numero, par = 0, impar = 0;

		Scanner leia = new Scanner(System.in);

		for (int cont = 0; cont <= 9; cont++) {

			System.out.println("Entre com um numero: ");
			numero = leia.nextInt();

			if (numero % 2 == 0) {
				par++;
			}

			else {
				impar++;
			}
			
			
		}
		
		System.out.println("\nA quantidade de numeros pares foi "+par);
		System.out.println("\nA quantidade de numeros impares foi " +impar);

	}
}
