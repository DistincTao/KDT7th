package looseCoupling;

public class Computer implements ElectronicDevice {

	@Override
	public void powerOn() {
		System.out.println(getClass().getName() + "이/가 켜집니다.");
	}

	@Override
	public void powerOff() {
		System.out.println(getClass().getName() + "이/가 꺼집니다.");		
	}

}
