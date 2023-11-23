package looseCoupling;

public class MobilePhone implements Remotable{

	@Override
	public void remoteControl(ElectronicDevice ed) {
		System.out.println(ed.toString() + "을/를 제어합니다.");
		
	}



}
