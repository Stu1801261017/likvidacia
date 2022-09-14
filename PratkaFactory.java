package pratki;

public abstract class PratkaFactory {

	public abstract Pratka createProduct(String productName);
	
	
	public Pratka produceProduct(String productName) {
Pratka product = createProduct(productName);
product.prepare();
return product;


}
}