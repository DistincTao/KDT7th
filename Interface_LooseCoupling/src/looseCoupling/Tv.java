package looseCoupling;

public class Tv implements ElectronicDevice{
	private String brandName;
	
	public Tv (String brandName) {
		this.brandName = brandName;
	} 
	
	@Override
	public void powerOn() {
		System.out.println("Tv가 켜집니다.");
	}
	
	public void powerOff() {
		System.out.println("Tv가 꺼집니다.");
	}
}
