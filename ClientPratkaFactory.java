package pratki;

public class ClientPratkaFactory extends PratkaFactory {

	private Pratka product;

	@Override
	public Pratka createProduct(String productName) {
		// TODO Auto-generated method stub
		if(productName == "1") {
			return new Plovidv();
			
		}
		if(productName == "2") {
			return new Stranata();
		}
		
		if(productName == "3") {
			return new Chujbina();
		}
		
		
		
		
		return product;
	}

}
