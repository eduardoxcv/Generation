package geral;

import java.util.Scanner;

public class calculadoraHoras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float horas,minutos,segundos;
		Scanner leia = new Scanner (System.in); 
		
		System.out.println("\nEscreva quantos segundos teve o evento na Generation: ");
		segundos = leia.nextFloat();
		
		minutos = segundos / 60;
		horas = segundos / 3600;
		
		System.out.printf("\nO tempo de dura��o do evento na Generation foi: "+horas+" horas, " +minutos+ " minutos e " +segundos+ " seundos");
		
		
	}
	/* 3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
	
	
	
}
