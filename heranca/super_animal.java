package heranca;

public abstract class super_animal {

	protected String especie;
	
	abstract public void som(String tipoSom);
	abstract public void nome(String tipoSom);
	
	super_animal(String especie){
		
		this.especie = especie;
				
	}
	
	public String getEspecie() {
		
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	
}