package looseCoupling;

public class MultiRemoteController implements Remotable {

	@Override
	public void remoteControl(ElectronicDevice ed) {
		ed.powerOn();
		System.out.println(ed.toString() + "을/를 제어합니다.");
		
	}

}