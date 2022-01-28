package vetor_matriz;

import java.util.Scanner;

public class atividade_vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numeros = new int [7];
		int parSoma = 0, imparQuantidade = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 1;i < 7; i++) {
			System.out.println("\n Digite o valor "+i+ "°" );
			numeros[i] = entrada.nextInt();
			
			if(numeros[i] % 2 == 0) { 
				parSoma += numeros[i];
			}
			else {
				imparQuantidade++;
			}
		}
		System.out.println("\n Os pares somados é igual a: "+parSoma);
		System.out.println("\n A quantidade de impares é: "+imparQuantidade);
	}

	}

