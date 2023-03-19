package ex01.order;

public class Order {
	private String productName;    
	private int productPrice;  
	private int discountPrice;
	
	
	public Order(String productName, int productPrice, int discountPrice) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.discountPrice = discountPrice;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}


	public int getDiscountPrice() {
		return discountPrice;
	}


	public void setDiscountPrice(int discountPrice) {
		this.discountPrice = discountPrice;
	}

	

	//계산 로직
	public int calculatePrice() {
		return productPrice-discountPrice; //5000-500=4500
	}
	

	@Override
	public String toString() {
		return "[제품명:" + productName + ", 제품 가격:" + productPrice + ", 할인가격:"
				+ discountPrice + "]";
	}
	
	

}
