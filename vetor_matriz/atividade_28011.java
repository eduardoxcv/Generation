package vetor_matriz;

import java.util.Scanner;

public class atividade_28011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.
*/
		Scanner leia = new Scanner (System.in);
		float[] [] m1 = new float[2][2];
		float[] [] m2 = new float[2][2];
		float[] [] m3 = new float[2][2];
		int opc;
		for(int x=0; x<2; x++) {
			for (int y = 0; y<2; y++) {
				System.out.print("m1[" + x +"][" + y + "] = ");
				m1[x][y] = leia.nextFloat();
				System.out.print("m2[" + x +"][" + y + "] = ");
				m2[x][y] = leia.nextFloat();
			}
		}
		System.out.println("(1) somar as duas matrizes \r\n"
				+ "(2) subtrair a primeira matriz da segunda \r\n"
				+ "(3) adicionar uma constante as duas matrizes\r\n"
				+ "(4) imprimir as matrizes");
		
		System.out.println("Digite uma opção: ");
		opc = leia.nextInt();
		
		switch(opc) {
		case 1: 
			for(int x=0; x<2; x++) {
				for (int y = 0; y<2; y++) {
					m3[x][y] = m1[x][y] + m2[x][y] ;
					System.out.print("[" + m3 [x][y] + "] "); 
					
				}
				System.out.println("\n");
			}
			
			break;
		case 2: 
			for(int x=0; x<2; x++) {
				for (int y = 0; y<2; y++) {
					m3[x][y] = m1[x][y] - m2[x][y] ;
					System.out.print("[" + m3 [x][y] + "] ");
				}
				System.out.println("\n");
			}
			
			break;
		case 3: 
			m1[0][0] = leia.nextFloat();
			m2[1][0] = leia.nextFloat();
			
			System.out.println("Matriz1: ");
			for(int x=0; x<2; x++) {
				for (int y = 0; y<2; y++) {
					System.out.print("[" + m1 [x][y] + "] "); 
					
				}
				System.out.println("\n");
			}
			System.out.println("Matriz2: ");
			for(int x=0; x<2; x++) {
				for (int y = 0; y<2; y++) {
					System.out.print("[" + m2 [x][y] + "] "); 
					
				}
				System.out.println("\n");
			}
			
			
			break;
		case 4: 
			for(int x=0; x<2; x++) {
				for (int y = 0; y<2; y++) {
					System.out.print("[" + m1 [x][y] + "] "); 
					
				}
				System.out.println("\n");
			}
			
			for(int x=0; x<2; x++) {
				for (int y = 0; y<2; y++) {
					System.out.print("[" + m2 [x][y] + "] "); 
					
				}
				System.out.println("\n");
			}
		
			break;
		default :
			System.out.println("Opção Invalida");
			break;	
			
		} 
		
	}

}
