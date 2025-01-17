package exercise;

public final class Stock {
	private final Product product;
	private final int number;
	
	public Stock(Product product, int number) {
		this.product = new Product(product.getNumber(),product.getPrice(),product.getName());
		this.number = number;
	}

	public Product getProduct() {
		return new Product(product.getNumber(),product.getPrice(),product.getName());
	}

	public int getNumber() {
		return number;
	}

}
