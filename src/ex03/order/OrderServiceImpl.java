package ex03.order;

import ex03.salespolicy.DiscountPolicy;
//import ex02.salespolicy.FixDiscountPolicy;
//import ex02.salespolicy.RateDiscountPolicy;

public class OrderServiceImpl implements OrderService {

	// private final DiscountPolicy discountPolicy = new FixDiscountPolicy(); //개발자가 직접 DI
	// private final DiscountPolicy discountPolicy = new RateDiscountPolicy();
	
	//객체 지향 원리인 OCP,DI 위반 -> 좋은 프로그래밍이 아니다.
	
	private final DiscountPolicy discountPolicy ; 
	//오류 발생
	// java.lang.NullPointerException : 실제 인스턴스(객체)가 생성되지 않았을때 참조하면 발생 
	
	//생성자 통한 주입 
	public OrderServiceImpl(DiscountPolicy discountPolicy) {
		this.discountPolicy = discountPolicy;
	}
	
	
	 
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
