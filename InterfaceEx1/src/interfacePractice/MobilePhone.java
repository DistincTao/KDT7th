package interfacePractice;

//public abstract class MobilePhone implements Phone, Camera, Computer{
public class MobilePhone extends Camera implements Phone, Computer {
	
	// MobilePhone이 가져야 하는 기능을 규정하고, 이런 기능을 구현하는 것으로 하겠다는 일종의 계약
	// 아직 구현하지 못한 메소드가 있는 경우는 현 클래스를 abstract class로 바꿔주어야 한다.
	@Override
	public void calling() {
	}

	@Override
	public void receiving() {
	}

	@Override
	public void takingPic() {
	}

	@Override
	public void zoomIn() {
	}

	@Override
	public void zoomOut() {
	}
	
	@Override
	public void computeExpression() {
	}

	@Override
	public void playingApp() {
	}
}
