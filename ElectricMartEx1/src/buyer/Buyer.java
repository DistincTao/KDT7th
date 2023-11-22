package buyer;

import electric.Electronic;

public class Buyer {
	private int budget;
	private int point;
	private int cost;
	private String productList = "";
	
	Buyer (int budget) {
		this.budget = budget;
	}

	public int getBudget() {
		return this.budget;
	}
	public int getPoint() {
		return this.point;
	}
	
	public String getProductList() {
		return this.productList;
	}
	
	public void setBudget(int budget) {
		this.budget = budget;
	}
	
	public void setPoint(int point) {
		this.point += point ;
	}
	
	@Override
	public String toString() {
		return "구매한 제품은 " + this.getProductList() + "이고, 총 가격은 " 
				+ this.cost + "원 이며, 적립된 포인트는 " + this.point + "점 입니다.";
	}
	
	public void buyProduct(Electronic e) {
		if (this.budget < e.getPrice()) {
			System.out.println("자금이 부족합니다.");
		} else {
			this.budget -= e.getPrice();
			this.cost += e.getPrice();
			this.point += e.getPrice() * 0.1;
			this.productList += e.getType() + " ";
			System.out.println("제품 가격은 " + e.getPrice() + "원, 현재 잔액은 " + this.budget + "원, 포인트는 " + this.point + "점 입니다.");		
		}
	}
	
	public void returnProduct(Electronic e) {
		this.budget += e.getPrice();
		this.cost -= e.getPrice();
		this.point -= e.getPrice() * 0.1;
		this.productList += e.getType() + "(반품됨) ";
		System.out.println("제품 가격은 " + e.getPrice() + "원, 현재 잔액은 " + this.budget + "원, 포인트는 " + this.point + "점 입니다.");	
	}
	
	public void usePoint(Electronic e) {
		if (this.point < e.getPrice()) {
			System.out.println("포인트가 부족합니다.");
		} else {
		this.budget = this.budget;
		this.cost += e.getPrice();
		this.point -= e.getPrice();
		this.productList += e.getType() + "(포인트 구매) ";
		System.out.println("제품 가격은 " + e.getPrice() + "원, 현재 잔액은 " + this.budget + "원, 포인트는 " + this.point + "점 입니다.");	
		}
	}
}
