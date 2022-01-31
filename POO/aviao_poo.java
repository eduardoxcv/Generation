/*Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/

package POO;

public class aviao_poo {

	// ************declara��o dos atributos da classe ***************

	private String nomePassageiro;
	private String classeVoo;
	private String empresaAerea;

	// *********criar o meu m�todo especial passageiro**********
	public aviao_poo(String nomePassageiro, String classeVoo, String empresaAerea) {

		this.nomePassageiro = nomePassageiro;
		this.classeVoo = classeVoo;
		this.empresaAerea = empresaAerea;
	}

	// **********declara��o dos demais m�todos da classe*************

	public void imprimirInfo() {
		System.out.println("\t\t***** GRU Airport ***** ");
		System.out.println("Passageiro " + nomePassageiro + "vai viajar na empresa a�rea " + empresaAerea
				+ " na Classe " + classeVoo);
	}

	public String getNomePassageiro() {
		return nomePassageiro;
	}

	public void setNomePassageiro(String nomePassageiro) {
		this.nomePassageiro = nomePassageiro;
	}

	public String getClasseVoo() {
		return classeVoo;
	}

	public void setClasseVoo(String classeVoo) {
		this.classeVoo = classeVoo;
	}

	public String getEmpresaAerea() {
		return empresaAerea;
	}

	public void setEmpresaAerea(String empresaAerea) {
		this.empresaAerea = empresaAerea;
	}

}
