package heranca;

public class cachorro extends super_animal {
	
	private String deveCorrer;
	private String tipoAnimal;

	public cachorro(String nome, String idade, String som, String tipoAnimal, String deveCorrer) {
		super(nome, idade, som);
		this.deveCorrer = deveCorrer;
		this.tipoAnimal = tipoAnimal;		}

	
		
	public String getDeveCorrer() {
		return deveCorrer;
	}



	public void setDeveCorrer(String deveCorrer) {
		this.deveCorrer = deveCorrer;
	}



	public String getTipoAnimal() {
		return tipoAnimal;
	}



	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}



	public void imprimirInfo () {
		System.out.println("O nome do animal �: "+getNome()+ " ele tem " +getIdade()+" anos de vida e emite"
				+ "o som" +getSom()+ " e ele "+deveCorrer);
	 System.out.println("Ent�o o animal � um:" +tipoAnimal);
	} 
}


