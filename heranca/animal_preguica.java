package heranca;

public class animal_preguica extends super_animal {
	
	private String deveSubir;
	private String tipoAnimal;

	public animal_preguica(String nome, String idade, String som) {
		super(nome, idade, som);
		this.deveSubir = deveSubir;
		this.tipoAnimal = tipoAnimal;
		
	}

	public String getDeveSubir() {
		return deveSubir;
	}

	public void setDeveSubir(String deveSubir) {
		this.deveSubir = deveSubir;
	}

	public String getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}
	public void imprimirInfo () {
		System.out.println("O nome do animal é: "+getNome()+ " ele tem " +getIdade()+" anos de vida e emite"
				+ "o som" +getSom()+ " e ele "+deveSubir);
	 System.out.println("Então o animal é um:" +tipoAnimal);
	} 
}
