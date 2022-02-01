package heranca;

public class super_animal {
	private static String nome;
	private static String idade;
	private String som;

	public super_animal(String nome, String idade, String som) {
		super();

		this.nome = nome;
		this.idade = idade;
		this.som = som;

	}

	public static String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}
	
}
