package ex03;

import ex03.order.Order;
import ex03.order.OrderService;
import ex03.order.OrderServiceImpl;

public class SalesCoffee {

	public static void main(String[] args) {
		//커피 값 계산기
		//거래명세서(제품 가격)
		//주문(계산) <---가격정책(의존성 주입)
		
	//	OrderService orderService = new OrderServiceImpl();
		
		AppConfig appConfig = new AppConfig();
		OrderService orderService =appConfig.orderService();		
	    Order order = orderService.orderProduct("Ameriano", 7000);
		
		System.out.println("거래명세서  "+order);
		System.out.println("-------------------------------------------------------");
		System.out.println("제품가격  "+order.calculatePrice());
		
		

	}

}
