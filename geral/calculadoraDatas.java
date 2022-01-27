package geral;

import java.util.Scanner;

public class calculadoraDatas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/
		
		int anos,meses,dias;
		Scanner leia = new Scanner (System.in); 
		
		System.out.println("\nEscreva quantos anos você tem: ");
		anos = leia.nextInt();
		System.out.println("\nEscreva quantos meses você tem: ");
		meses = leia.nextInt();
		System.out.println("\nEscreva quantos dias você tem: ");
		dias = leia.nextInt();		
		
		meses = anos/ 12;
		dias = anos* 365;
		
		System.out.println("\nSua idade expressa em dias é exatamente :"+dias+" dias");
		
		
	}

}
