package buyer;

import electric.Product;

public class Buyer {
	private int money = 1000000;
	private int point = 0;
	
	private Product[] productList = new Product[10];
	
	int i = 0;
	
	// 기본 생성자
	Buyer () {

	}

	// getter
	public int getMoney() {
		return this.money;
	}
	public int getPoint() {
		return this.point;
	}
	
	// 제품 구매
	public void buy(Product p) {
		if (this.money < p.getPrice()) {
			System.out.println("자금이 부족합니다.");
			return;
		}
		this.money -= p.getPrice();
		this.point += p.getPoint();
		this.productList[i++] = p;
		System.out.println(p.toString() + "제품을 구입했습니다.");		
	}
	
	// 구매 목록 출력
	public void outputRecipt() {
		int sum = 0;
		System.out.println("=========== 구매 목록 ==========");
		for (int i = 0; i < productList.length; i++) {
			if (productList[i] == null) break;
			System.out.println(productList[i] + "(" + productList[i].getPrice() + "원)");
			
			sum += productList[i].getPrice();
		}
		
		System.out.println("구입하신 물품의 총 금액은 " + sum + "원 입니다.");
		System.out.println("적립된 포인드는 총 " + this.point + "점 입니다.");
	}
	
}
