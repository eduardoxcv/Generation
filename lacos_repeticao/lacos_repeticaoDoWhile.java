package lacos_repeticao;

import java.util.Scanner;

public class lacos_repeticaoDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
		Scanner leia = new Scanner(System.in);
		
		float numero, soma =0, cont = 0;
		
		System.out.println("Entre com um numero: ");
		numero = leia.nextFloat();
		
		do {
			
			
			if(numero  % 3 ==0) {
				cont++;
				soma = soma + numero;
				
			}
			
			System.out.println("Entre com um numero: ");
			numero = leia.nextFloat();
			
		} while (numero != 0);
		
		System.out.println("\nA média dos numeros múltiplos de 3 é: "+(soma / cont));
	}

}
