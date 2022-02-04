package projetobloco1;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CidadeI extends Internacional {
	Scanner leia = new Scanner(System.in);
	private float cambio = (float) 0;
	int opCidade;
	int cidade1;

	public CidadeI(String estacao, String fuso, double moeda, boolean visto, int opCidade, int cidade1) {
		super(estacao, fuso, moeda, visto);
		this.cambio = cambio;
		this.opCidade = opCidade;
		this.cidade1 = cidade1;
	}

	public float getCambio() {
		return cambio;
	}

	public void setCambio(float cambio) {
		this.cambio = cambio;
	}

	public void imprimirClima() {

		System.out.println("\nSelecione o per�odo desejado");
		System.out.println("\n[1] � Janeiro a Mar�o");
		System.out.println("\n[2] � Abril a Junho");
		System.out.println("\n[3] � Julho a Setembro");
		System.out.println("\n[4] � Outubro a Novembro");
		int periodo1 = leia.nextInt();

		// Londres
		if (cidade1 == 1)
			if (periodo1 == 1) {
				System.out.println("A m�dia de temperatura em Londres nessa epoca do ano � de 8�C � 2�C");
			} else if (periodo1 == 2) {
				System.out.println("A m�dia de temperatura em Londres nessa epoca do ano � de 3�C � 17�C");
			} else if (periodo1 == 3) {
				System.out.println("A m�dia de temperatura em Londres nessa epoca do ano � de 11�C � 22�C");
			} else if (periodo1 == 4) {
				System.out.println("A m�dia de temperatura em Londres nessa epoca do ano � de 4�C � 19�C");
			} else {
				System.out.println("Op��o inv�lida!");
			}

		// alterar Paris
		else if (cidade1 == 2) {
			if (periodo1 == 1) {
				System.out.println("A m�dia de temperatura em Paris nessa epoca do ano � de 3�C � 9�C");
			} else if (periodo1 == 2) {
				System.out.println("A m�dia de temperatura em Paris nessa epoca do ano � de 6�C � 22�C");
			} else if (periodo1 == 3) {
				System.out.println("A m�dia de temperatura em Paris nessa epoca do ano � de 14�C � 26�C");
			} else if (periodo1 == 4) {
				System.out.println("A m�dia de temperatura em Paris nessa epoca do ano � de 5�C � 20�C");
			} else {
				System.out.println("Op��o inv�lida!");
			}

		}

		// alterar Los Angeles
		else if (cidade1 == 3) {
			if (periodo1 == 1) {
				System.out.println("A m�dia de temperatura em Los Angeles nessa epoca do ano � de 3�C � 9�C");
			} else if (periodo1 == 2) {
				System.out.println("A m�dia de temperatura em Los Angeles nessa epoca do ano � de 5�C � 20�C");
			} else if (periodo1 == 3) {
				System.out.println("A m�dia de temperatura em Los Angeles nessa epoca do ano � de 14�C � 26�C");
			} else if (periodo1 == 4) {
				System.out.println("A m�dia de temperatura em Los Angeles nessa epoca do ano � de 6�C � 22�C");
			} else {
				System.out.println("Op��o inv�lida!");
			}
		}

		// alterar temperatura Buenos Aires
		else if (cidade1 == 4) {
			if (periodo1 == 1) {
				System.out.println("A m�dia de temperatura em Buenos Aires nessa epoca do ano � de 19�C � 29�C");
			} else if (periodo1 == 2) {
				System.out.println("A m�dia de temperatura em Buenos Aires nessa epoca do ano � de 12�C � 26�C");
			} else if (periodo1 == 3) {
				System.out.println("A m�dia de temperatura em Buenos Aires nessa epoca do ano � de 8�C � 17�C");
			} else if (periodo1 == 4) {
				System.out.println("A m�dia de temperatura em Buenos Aires nessa epoca do ano � de 11�C � 25�C");
			} else {
				System.out.println("Op��o inv�lida!");
			}
		}

		// alterar temperatura Dubai
		else if (cidade1 == 5) {
			if (periodo1 == 1) {
				System.out.println("A m�dia de temperatura em Dubai nessa epoca do ano � de 18�C � 38�C");
			} else if (periodo1 == 2) {
				System.out.println("A m�dia de temperatura em Dubai nessa epoca do ano � de 18�C � 38�C");
			} else if (periodo1 == 3) {
				System.out.println("A m�dia de temperatura em Dubai nessa epoca do ano � de 28�C � 41�C");
			} else if (periodo1 == 4) {
				System.out.println("A m�dia de temperatura em Dubai nessa epoca do ano � de 4�C � 19�C");
			} else {
				System.out.println("Op��o inv�lida!");
			}
		} else {
			System.out.println("ERRO");
		}
	}

	public void imprimirPontosTur() {

		// Londres
		if (cidade1 == 1) {
			System.out.println("Londres tem tr�s principais pontos tur�sticos, sendo eles: "
					+ "Pal�cio de Westminster � Big Ben, London Eye, Torre de Londres e mais 39 destinos.");
			opcoesCidades();
		} else if (cidade1 == 2) {
			System.out.println("Paris tem tr�s principais pontos tur�sticos, sendo eles: Torre Eiffel, "
					+ "Arco do Triunfo, Notre Dame de Paris e mais 15 destinos");
			opcoesCidades();

		}

		// Los Angeles
		else if (cidade1 == 3) {
			System.out.println("Los Angeles tem tr�s principais pontos tur�sticos, sendo eles: Hollywood, "
					+ "Warner Bros Studios, Rodeo Drive e mais 12 destinos.");
			opcoesCidades();
		}

		// Buenos Aires
		else if (cidade1 == 4) {
			System.out.println("Buenos Aires tem tr�s principais pontos tur�sticos, sendo eles: Galerias Pac�fico, "
					+ "Casa Rosada, Obelisco  e mais 15 destinos.");
			opcoesCidades();
		}

		// Dubai
		else if (cidade1 == 5) {
			System.out.println("Dubai tem tr�s principais pontos tur�sticos, sendo eles: Abu Dhabi, Dubai Mall, "
					+ "Ilhas artificiais  e mais 10 destinos.");
			opcoesCidades();
		} else {
			System.out.println("ERRO");
		}
	}

	public void imprimirFuso() {

		if (cidade1 == 1) {
			int f = 3;
			GregorianCalendar gc = new GregorianCalendar();
			gc.setTime(new Date());

			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
			System.out.println("Hor�rio local: " + sdf.format(gc.getTime()));

			gc.add(Calendar.HOUR, f);
			System.out.println("Hor�rio no destino: " + sdf.format(gc.getTime()));
		} else if (cidade1 == 2) {
			int f = 4;
			GregorianCalendar gc = new GregorianCalendar();
			gc.setTime(new Date());

			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
			System.out.println("Hor�rio local: " + sdf.format(gc.getTime()));

			gc.add(Calendar.HOUR, f);
			System.out.println("Hor�rio no destino: " + sdf.format(gc.getTime()));
		} else if (cidade1 == 3) {
			int f = -5;
			GregorianCalendar gc = new GregorianCalendar();
			gc.setTime(new Date());

			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
			System.out.println("Hor�rio local: " + sdf.format(gc.getTime()));

			gc.add(Calendar.HOUR, f);
			System.out.println("Hor�rio no destino: " + sdf.format(gc.getTime()));
		} else if (cidade1 == 4) {
			int f = 0;
			GregorianCalendar gc = new GregorianCalendar();
			gc.setTime(new Date());

			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
			System.out.println("Hor�rio local: " + sdf.format(gc.getTime()));

			gc.add(Calendar.HOUR, f);
			System.out.println("Hor�rio no destino: " + sdf.format(gc.getTime()));
		} else if (cidade1 == 5) {
			int f = 7;
			GregorianCalendar gc = new GregorianCalendar();
			gc.setTime(new Date());

			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
			System.out.println("Hor�rio local: " + sdf.format(gc.getTime()));

			gc.add(Calendar.HOUR, f);
			System.out.println("Hor�rio no destino: " + sdf.format(gc.getTime()));
		} else {
			System.out.println("ERRO");
		}

	}

	public void imprimirCustos() {
		System.out.println("Quantos dias voc� pretende ficar nesse destino? ");
		int qntsDias = leia.nextInt();

		if (cidade1 == 1) {
			double libra = 7.14;
			double alimentacao = 25;
			double bilhete = 1.5f;
			double aluguel = 32;
			double hospedagem = 150;
			double passagem = 7830;
			double total = ((((alimentacao + bilhete + aluguel + hospedagem) * libra) * qntsDias) + passagem);

			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String formatoMoeda = nf.format(total);

			System.out.println("Londres - Libra = GBP");
			System.out.println(
					"Custo m�dio de alimenta��o di�rio: GBP " + alimentacao + " - BRL " + (alimentacao * libra));
			System.out.println("Custo do bilhete para transporte: GBP " + bilhete + " - BRL " + (bilhete * libra));
			System.out.println(
					"Custo de aluguel de carro di�rio a partir de: GBP " + aluguel + " - BRL " + (aluguel * libra));
			System.out.println(
					"A hospedagem di�ria tem o custo inicial de: GBP " + hospedagem + " - BRL " + (hospedagem * libra));
			System.out.println("Valor de passagens a partir de: BRL " + passagem);
			System.out.printf("\nCom base nas informa��es acima, o seu gasto m�dio na viagem durante " + qntsDias
					+ " dias, ser� de: " + nf.format(total));

		} else if (cidade1 == 2) {
			double euro = 5.94f;
			double alimentacao = 78;
			double bilhete = 1.7f;
			double aluguel = 45;
			double hospedagem = 60;
			double passagem = 5622;
			double total = ((((alimentacao + bilhete + aluguel + hospedagem) * euro) * qntsDias) + passagem);

			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String formatoMoeda = nf.format(total);
			
			System.out.println("Paris - Euro = EUR ");
			System.out.println(
					"Custo m�dio de alimenta��o di�rio: EUR " + alimentacao + " - BRL " + (alimentacao * euro));
			System.out.println("Custo do bilhete para transporte: EUR " + bilhete + " - BRL " + (bilhete * euro));
			System.out.println(
					"Custo de aluguel de carro di�rio a partir de: EUR " + aluguel + " - BRL " + (aluguel * euro));
			System.out.println(
					"A hospedagem di�ria tem o custo inicial de: EUR " + hospedagem + " - BRL " + (hospedagem * euro));
			System.out.println("Valor de passagens a partir de: BRL " + passagem);
			System.out.println("\nCom base nas informa��es acima, o seu gasto m�dio na viagem durante " + qntsDias
					+ " dias, ser� de: BRL " + ((alimentacao + bilhete + aluguel + hospedagem) * euro) + passagem);

		} else if (cidade1 == 3) {
			double dolar = 5.27f;
			double alimentacao = 56;
			double bilhete = 1.75f;
			double aluguel = 38;
			double hospedagem = 83;
			double passagem = 6332;
			double total = ((((alimentacao + bilhete + aluguel + hospedagem) * dolar) * qntsDias) + passagem);

			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String formatoMoeda = nf.format(total);
			
			System.out.println("Los Angeles - D�lar = USD");
			System.out.println(
					"Custo m�dio de alimenta��o di�rio: USD " + alimentacao + " - BRL " + (alimentacao * dolar));
			System.out.println("Custo do bilhete para transporte: USD " + bilhete + " - BRL " + (bilhete * dolar));
			System.out.println(
					"Custo de aluguel de carro di�rio a partir de: USD " + aluguel + " - BRL " + (aluguel * dolar));
			System.out.println(
					"A hospedagem di�ria tem o custo inicial de: USD " + hospedagem + " - BRL " + (hospedagem * dolar));
			System.out.println("Valor de passagens a partir de: BRL " + passagem);
			System.out.println("\nCom base nas informa��es acima, o seu gasto m�dio na viagem durante " + qntsDias
					+ " dias, ser� de: BRL " + ((alimentacao + bilhete + aluguel + hospedagem) * dolar) + passagem);

		} else if (cidade1 == 4) {
			double peso = 0.05f;
			double alimentacao = 250;
			double bilhete = 6.00f;
			double aluguel = 1834;
			double hospedagem = 3932;
			double passagem = 6332;
			double total = ((((alimentacao + bilhete + aluguel + hospedagem) * peso) * qntsDias) + passagem);

			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String formatoMoeda = nf.format(total);

			System.out.println("Buenos Aires - Pesos = ARS");
			System.out.println(
					"Custo m�dio de alimenta��o di�rio: ARS " + alimentacao + " - BRL " + (alimentacao * peso));
			System.out.println("Custo do bilhete para transporte: ARS " + bilhete + " - BRL " + (bilhete * peso));
			System.out.println(
					"Custo de aluguel de carro di�rio a partir de: ARS " + aluguel + " - BRL " + (aluguel * peso));
			System.out.println(
					"A hospedagem di�ria tem o custo inicial de: ARS " + hospedagem + " - BRL " + (hospedagem * peso));
			System.out.println("Valor de passagens a partir de: BRL " + passagem);
			System.out.println("\nCom base nas informa��es acima, o seu gasto m�dio na viagem durante " + qntsDias
					+ " dias, ser� de: BRL " + ((alimentacao + bilhete + aluguel + hospedagem) * peso) + passagem);

		} else if (cidade1 == 5) {
			double dirham = 1.43f;
			double alimentacao = 250;
			double bilhete = 6.00f;
			double aluguel = 1834;
			double hospedagem = 3932;
			double passagem = 6332;
			double total = ((((alimentacao + bilhete + aluguel + hospedagem) * dirham) * qntsDias) + passagem);

			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String formatoMoeda = nf.format(total);
			
			System.out.println("Dubai - Dirham = DH");
			System.out.println(
					"Custo m�dio de alimenta��o di�rio: DH " + alimentacao + " - BRL " + (alimentacao * dirham));
			System.out.println("Custo do bilhete para transporte: DH " + bilhete + " - BRL " + (bilhete * dirham));
			System.out.println(
					"Custo de aluguel de carro di�rio a partir de: DH " + aluguel + " - BRL " + (aluguel * dirham));
			System.out.println(
					"A hospedagem di�ria tem o custo inicial de: DH " + hospedagem + " - BRL " + (hospedagem * dirham));
			System.out.println("Valor de passagens a partir de: BRL " + passagem);
			System.out.println("\nCom base nas informa��es acima, o seu gasto m�dio na viagem durante " + qntsDias
					+ " dias, ser� de: BRL " + ((alimentacao + bilhete + aluguel + hospedagem) * dirham) + passagem);

		} else {
			System.out.println("ERRO");
		}

	}

	public double opcoesCidades() {

		int op = 0;
		Scanner leia = new Scanner(System.in);

		System.out.println("Op��o [1]: Temperatura");
		System.out.println("Op��o [2]: Fuso Hor�rio");
		System.out.println("Op��o [3]: Custos");
		System.out.println("Op��o [4]: Pontos tur�sticos");
		System.out.println("Op��o [5]: Todas as op��es");
		System.out.println("Op��o [6]: Finalizar aplica��o");
		op = leia.nextInt();

		switch (op) {
		case 1:
			imprimirClima();
			break;
		case 2:
			imprimirFuso();
			break;
		case 3:
			imprimirCustos();
			break;
		case 4:
			imprimirPontosTur();
			break;
		case 5:
			imprimirClima();
			imprimirFuso();
			imprimirCustos();
			imprimirPontosTur();
			break;
		case 6:
			System.out.println("\nObrigado por utilizar o nosso sistema!!");
			System.out.println("\nAplica��o finalizada");
			System.exit(0);
			break;

		}
		return op;
	}

	public int escolhaCidade() {

		System.out.println("\nSelecione o destino desejado");
		System.out.println("\n[1] � Internacional");
		System.out.println("\n[2] � Nacional");
		int opcao = leia.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Op��o [1]: Londres");
			System.out.println("Op��o [2]: Paris");
			System.out.println("Op��o [3]: Los Angeles");
			System.out.println("Op��o [4]: Buenos Aires");
			System.out.println("Op��o [5]: Dubai");
			cidade1 = leia.nextInt();

			switch (cidade1) {
			case 1:
				opcoesCidades();

				break;
			case 2:
				opcoesCidades();

				break;
			case 3:
				opcoesCidades();

				break;
			case 4:
				opcoesCidades();

				break;
			case 5:
				opcoesCidades();

				break;
			}

			break;
		case 2:
			System.out.println("Op��o [1]: S�o Paulo");
			System.out.println("Op��o [2]: Rio de Janeiro");
			System.out.println("Op��o [3]: Fortaleza");
			System.out.println("Op��o [4]: Manaus");
			System.out.println("Op��o [5]: Porto Alegre");
			break;

		}

		return cidade1;
	}

}

