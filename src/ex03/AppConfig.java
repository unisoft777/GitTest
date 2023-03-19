package ex03;

import ex03.order.OrderService;
import ex03.order.OrderServiceImpl;
import ex03.salespolicy.DiscountPolicy;
import ex03.salespolicy.RateDiscountPolicy;

public class AppConfig {
	
	//메서드 생성
	/* 의존성 주입
	 * <beans> <bean id="memberService" class="com.spring.ex03.MemberServiceImpl">
	 * <property name="memberDAO" ref="memberDAO" /> </bean> <bean id="memberDAO"
	 * class="com.spring.ex03.MemberDAOImpl" /> </beans>
	 */

	 public  OrderService  orderService() {
		 System.out.println("AppConfig에서 orderService호출");
		 
      return new OrderServiceImpl(discountPolicy());   //OrderService  orderService = new OrderServiceImpl( discountPolicy);
	 }

    
	 public DiscountPolicy discountPolicy() {  //DiscountPolicy discountPolicy =  new RateDiscountPolicy();
		 
		 System.out.println("AppConfig에서 discountPolicy호출");
		 
		 return new RateDiscountPolicy();
		 
	 }

}
