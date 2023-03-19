package ex02.salespolicy;

public class FixDiscountPolicy implements DiscountPolicy {

	private int dc =500;
	
	@Override
	public int discount(int price) {
		//고정 할인율 500
		return dc ;
	}
	
	
	

}
