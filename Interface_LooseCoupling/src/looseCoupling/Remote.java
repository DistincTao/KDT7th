package looseCoupling;

public class Remote implements Remotable{
	private Tv tv;
	
	public Remote () {
//		tv = new Tv();
		tv = new Tv("LG");
	}
	
	public void powerOnTv() {
		this.tv.powerOn();
	}
	
	public void powerOffTv() {
		this.tv.powerOff();
	}

	@Override
	public void remoteControl(ElectronicDevice ed) {
		System.out.println(ed.toString() + "을/를 제어합니다.");
		
	}
}
