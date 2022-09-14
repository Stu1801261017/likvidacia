package pratki;

public class MainFactoryMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new ClientPratkaFactory();
		Plovidv.produceProduct ("Plodiv");
		
		new ClientPratkaFactory();
		Chujbina.produceProduct ("Chujbina");
			
		new ClientPratkaFactory();
		Stranata.produceProduct ("Stranata");
	}

}
