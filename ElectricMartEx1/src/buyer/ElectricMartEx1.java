package buyer;

import electric.Computer;
import electric.Monitor;
import electric.TV;

public class ElectricMartEx1 {

	public static void main(String[] args) {
		TV tv = new TV("삼성", "검정", 200000, "TV");
		System.out.println(tv.toString());
		Monitor monitor = new Monitor("엘지", "흰색", 100000, "모니터");
		System.out.println(monitor.toString());;
		Computer computer = new Computer("애플", "스페이스그레이", 300000, "컴퓨터");
		System.out.println(computer.toString());
		Computer computer1 = new Computer("애플", "스페이스그레이", 400000, "컴퓨터");
		System.out.println(computer.toString());;

		
		Buyer buyer = new Buyer(1000000);
		buyer.buyProduct(tv);
		buyer.buyProduct(monitor);
		buyer.buyProduct(computer);
		buyer.buyProduct(computer1);
//		buyer.returnProduct(tv);
//		buyer.returnProduct(monitor);
//		buyer.returnProduct(computer);
		buyer.usePoint(monitor);
		buyer.usePoint(monitor);
		System.out.println(buyer.toString());
	}

}
