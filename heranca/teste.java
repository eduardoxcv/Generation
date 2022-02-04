package heranca;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		cachorro cachorro = new cachorro();
		preguica preguica = new preguica();
		cavalo cavalo = new cavalo();

		super_animal super_animal = null;
		
		int opcao;
		
		System.out.println("Escolha um animal. [0] Cachorro [1] Preguiça [2] Cavalo"); 
		opcao = leia.nextInt();
		
		switch (opcao) { 

		case 0:
			super_animal = cachorro;
			break;

		case 1:
			super_animal = preguica;
			break;

		case 2:
			super_animal = cavalo;
			break;

		default:
			System.out.println("\nErro!!!");
		}
		
		if(super_animal != null) {
			
			super_animal.nome("");
			super_animal.som("");
			
		
		}

	}

}