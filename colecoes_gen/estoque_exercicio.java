/*Crie uma um programa para trabalhar com estoque de uma loja, o programa dever� trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o programa dever� atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
*/

package colecoes_gen;

import java.util.ArrayList;
import java.util.Scanner;

public class estoque_exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcaoUser; // aqui a op��o do user vai ser armazenada
		Scanner leia = new Scanner(System.in);

		ArrayList<String> estoque = new ArrayList(); // esse � o nosso estoque

		do {
			System.out.println("\n____________________________________________________");
			System.out.println("\n_______________________44LOG________________________");
			System.out.println("\n____________________________________________________");
			System.out.println("\n(1) - Entre com um novo item em nosso estoque: ");
			System.out.println("\n(2) - Remova um item do nosso estoque: ");
			System.out.println("\n(3) - Atualize os dados e um item do nosso estoque: ");
			System.out.println("\n(4) - Veja todos itens cadastrados: ");
			System.out.println("\n(0) - Deseja sair do programa? (digite = 0) ");
			System.out.println("\n____________________________________________________");
			System.out.println("\n_______________________44LOG________________________");
			System.out.println("\n____________________________________________________");

			System.out.println("\n Entre com a sua op��o: ");
			opcaoUser = leia.nextInt(); 

			switch (opcaoUser) { // ESCOLHA CASO: 
			case 1:

				leia.nextLine();
				System.out.println("Entre com o item que voc� deseja adicionar no sistema:");
				String produto = leia.nextLine(); // USA O NEXTLINE POIS ELE CONSEGUE PEGAR MAIS QUE 1 NOME "EX BANANA MA�A"
				// no caso acima se utlizar somente o NEXT o sistema vai pegar apenas 1 palavra.
				estoque.add(produto); // ADICIONA O PRODUTO NO ESTOQUE

				break;

			case 2:

				leia.nextLine();
				System.out.println("Entre com o item que voc� deseja remover do nosso sistema:");
				String produtoRemov = leia.nextLine(); // essa fun��o remove o item.
				if (estoque.contains(produtoRemov)) {
					estoque.remove(produtoRemov);
				}

				else {
					System.out.println("Esse produto n�o existe em nosso sistema");

				}

				System.out.println(estoque);

				break;

			case 3:
				leia.nextLine();
				System.out.println("Qual produto voc� deseja alterar/ atualizar? ");
				String verifica = leia.nextLine(); 
				System.out.println("Entre com o item que ficar� no lugar do " + verifica + ":");
				// o caso acima o sistema verifica se o item que o user deu entrada est� cadastrado
				String novo = leia.nextLine();

				if (estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
				} else {
					System.out.println("Produto inexistente");
				}
				System.out.println(estoque);

				break;
			case 4:
				System.out.println("O nosso estoque atual �:");
				System.out.println(estoque);

				break;

			default:
				if (opcaoUser == 0) {
					System.out.println("Sistema finalizado");
				} else {
					System.out.println("Essa op��o n�o existe, entre com uma op��o correta: ");
				}

			}

		} while (opcaoUser != 0);

	}

}
