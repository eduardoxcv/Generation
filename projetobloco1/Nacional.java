package projetobloco1;

import java.util.Scanner;

public class Nacional {
	Scanner leia = new Scanner(System.in);
	private String fuso;

	public Nacional(String fuso) {
		this.fuso = fuso;
	}

	public String getFuso() {
		return fuso;
	}

	public void setFuso(String fuso) {
		this.fuso = fuso;
	}

	public void opcoesMenuN() {
		int op1 = 0;
		Scanner leia = new Scanner(System.in);
		System.out.println("Op��o [1]: Custos");
		System.out.println("Op��o [2]: Pontos tur�sticos");
		System.out.println("Op��o [3]: Fuso hor�rio");
		System.out.println("Op��o [4]: Todas as op��es");
		op1 = leia.nextInt();
		switch (op1) {
		case 1:
			System.out.println("xx");
			break;
		case 2:
			System.out.println("xx");
			break;
		case 3:
			System.out.println("xx");
			break;
		case 4:
			System.out.println("xx");
			break;

		}
	}
}
