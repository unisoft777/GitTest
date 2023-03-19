package ex02.salespolicy;

public interface DiscountPolicy {
     //할인율에 의한 할인가격
	
	int discount(int price);
}
