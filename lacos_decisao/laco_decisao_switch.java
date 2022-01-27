package lacos_decisao;

import java.util.Scanner;

public class laco_decisao_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Faça um programa que mostre um Menu com opções de um cardápio de restaurante para uma pessoa. A pessoa vai escolher o prato desejado: 

Após escolher o prato, o programa deverá fazer uma pergunta ao usuário, se ele aceita pagar a gorjeta do garçom 10% sobre o valor do prato. Se o usuário aceitar, mostrar o valor final (valor do prato + 10%), caso contrário, mostrar o valor final (somente o valor do prato).
Codigo		 Prato		 	Valor 
1 		Picanha 		25,00 
2 		Lasanha 		20,00 
3 		Strogonoff 		18,00 
4 		Bife Acebolado 	15,00 
5 		Pão com ovo 		5,00 */
		
		int cod = 0, gorjeta; 
		float prato=0;
		 
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nCodigo-----Prato-----------Valor (RS)");
		System.out.println("\n01---------Picanha---------Valor 25,00");
		System.out.println("\n02---------Lasanha---------Valor 20,00");
		System.out.println("\n03---------Strogonoff------Valor 18,00");
		System.out.println("\n04---------Bife acebolado--Valor 15,00");
		System.out.println("\n05---------Pão com ovo-----Valor 5,00");
		
		System.out.println("\nEscolha uma opção de prato: ");
		cod = leia.nextInt();
				
		switch (cod) {
		case 1:
			prato = 25;
			System.out.println("Prato escolhido: PICANHA, valor: R$ 25,00");
			break;
		case 2:
			prato = 20;
			System.out.println("Prato escolhido: LASANHA, valor: R$ 20,00");
			break;
		case 3:
			prato = 18;
			System.out.println("Prato escolhido: STROGONOFF, valor: R$ 18,00");
			break;
		case 4:
			prato = 15;
			System.out.println("Prato escolhido: BIFE ACEBOLADO, valor: R$ 15,00");
			break;
		case 5:
			prato = 5;
			System.out.println("Prato escolhido: PÃO COM OVO, valor: R$ 5,00");
			break;
					
		}
		
		System.out.println("Deseja dar gorgeta? Sim = 1/Não = 2 ");
		gorjeta = leia.nextInt();
		
		switch (gorjeta) {
		case 1: 
			System.out.println("O valor total do prato é " + (prato +(prato *= 0.10)));
			break;
		case 2:
			System.out.println("\nO valor final a ser pago é R$" +prato);
						
		}
		
		
		
		
	}

}
