package buyer;

import electric.Computer;
import electric.Monitor;
import electric.TV;

public class ElectricMartEx1 {

	public static void main(String[] args) {		
		Buyer buyer = new Buyer();
		
		buyer.buy(new TV(200000));
		buyer.buy(new Monitor(100000));
		buyer.buy(new Computer());
		buyer.buy(new TV(200000));
		buyer.buy(new Computer());
		buyer.outputRecipt();
	}

}
