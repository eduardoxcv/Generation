package geral;

import java.util.Scanner;

public class calculadoraDatas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/
		
		int anos,meses,dias;
		Scanner leia = new Scanner (System.in); 
		
		System.out.println("\nEscreva quantos anos voc� tem: ");
		anos = leia.nextInt();
		System.out.println("\nEscreva quantos meses voc� tem: ");
		meses = leia.nextInt();
		System.out.println("\nEscreva quantos dias voc� tem: ");
		dias = leia.nextInt();		
		
		meses = anos/ 12;
		dias = anos* 365;
		
		System.out.println("\nSua idade expressa em dias � exatamente :"+dias+" dias");
		
		
	}

}
