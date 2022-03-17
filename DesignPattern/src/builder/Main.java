package builder;

public class Main {

	public static void main(String[] args) {
		Product p1 = new Product.ProductBuilder("테스트상품", 1500)
				.setIsSellEnabled(true)
				.build();
	}

}
