package ex03.salespolicy;

public class RateDiscountPolicy implements DiscountPolicy {

	//요구사항 변경으로 고정할인(500)에서 제품 가격에 관해 일정한 비율로 할인해주는 정책으로 업데이트 해야 한다.
	//가격대비 10프로 할인
	@Override
	public int discount(int price) {
		
		int dc =(int)(price*(0.1));
		return dc;
	}

}
