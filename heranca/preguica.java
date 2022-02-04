package heranca;


	public class preguica extends super_animal {

		public preguica() {

			super("preguica");
	}
		
		
		
		@Override
		public void som(String tipoSom) {
			
			System.out.println("Irrrrirriirrirri");
			
		}
		
		@Override
		public void nome(String especie) {
			
			System.out.println(getEspecie());
			
		}
	}