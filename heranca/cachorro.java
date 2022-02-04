package heranca;

public class cachorro extends super_animal {
	
	
		public cachorro() {
			
			super("cachorro");
			
		}
		

		@Override
		public void som(String tipoSom) {
			
			System.out.println("rouf, rouf");
			
		}
		
		@Override
		public void nome(String especie) {
			
			System.out.println("\n" + getEspecie());
			
			
		}
	}
