
public class main {

	public static void main(String[] args) {

		Product product = new Product();
		product.setId(1);
		product.set_name("SmartWatch");
		product.set_description("Huawei");
		product.set_stockAmount(300);
		product.set_kod("MediaMarkt");

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.get_description());

	}

}
