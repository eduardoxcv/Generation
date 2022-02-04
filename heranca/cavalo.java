package heranca;

	
	public class cavalo extends super_animal {
		
		public cavalo() {
			
			super("cavalo");
			
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

