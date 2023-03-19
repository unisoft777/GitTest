package ex01.order;

import ex01.salespolicy.DiscountPolicy;
import ex01.salespolicy.FixDiscountPolicy;

public class OrderServiceImpl implements OrderService {

	  private final DiscountPolicy discountPolicy = new FixDiscountPolicy(); //개발자가 직접 DI
	
	@Override
	public Order orderProduct(String productName, int productPrice) {
		// 주문 도메인 리턴
		//주문객체를 리턴하려면 가격 정책이 결정되어야 한다.
		//가격 정책이 결정되었으면  주문객체 리턴(제품명,가격,할인 금액)
		

		//제품명,가격은 입력되어지므로 할인금액만 가져오면 된다.
		int discountPrice =discountPolicy.discount(productPrice);
		
		return new Order(productName,productPrice,discountPrice);
	}

}
