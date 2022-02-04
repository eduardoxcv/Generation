package projetobloco1;

public class Internacional {
	private String estacao;
	private String fuso;
	private double moeda;
	private boolean visto;

	public Internacional(String estacao, String fuso, double moeda, boolean visto) {
		this.estacao = estacao;
		this.fuso = fuso;
		this.moeda = moeda;
		this.visto = visto;
	}

	public String getEstacao() {
		return estacao;
	}

	public void setEstacao(String estacao) {
		this.estacao = estacao;
	}

	public double getMoeda() {
		return moeda;
	}

	public void setMoeda(double moeda) {
		this.moeda = moeda;
	}

	public boolean isVisto() {
		return visto;
	}

	public void setVisto(boolean visto) {
		this.visto = visto;
	}

}
