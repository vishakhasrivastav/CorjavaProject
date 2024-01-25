package interfacesPrograms;

interface Hotel{
	
	public void dining();
	public void buffet();
	
	interface Banquet{
		public void weddingArrangements();
		public void birthdayParty();
	}//Banquet interface ends here
	
}//Hotel interface ends here

class RamBharose implements Hotel{

	@Override
	public void dining() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buffet() {
		// TODO Auto-generated method stub
		
	}
	
}

class LeMeridian implements Hotel, Hotel.Banquet{

	@Override
	public void weddingArrangements() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void birthdayParty() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dining() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buffet() {
		// TODO Auto-generated method stub
		
	}
	
}

public class NestedInterface {

	public static void main(String[] args) {
		

	}

}
