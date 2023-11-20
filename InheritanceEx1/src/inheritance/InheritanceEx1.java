package inheritance;

import java.awt.Frame;
import java.awt.Window;

public class InheritanceEx1 extends Frame {

	public InheritanceEx1() {
		
	}
	
	public InheritanceEx1(String title) {
		super(title);
	}
	
	public static void main(String[] args) {
		
		InheritanceEx1 myWindow = new InheritanceEx1("나의 윈도우");
		System.out.println(myWindow.toString());
		myWindow.setVisible(true);
		
		Window pWindow = new Window(myWindow);
		pWindow.setBounds(null);
		
//		pWindow.setTitle(null); => 자식 Frame 클래스의 메소드이므로 부모 Window 클래스에서는 참조 변수 호출 불가
//		오류 : The method setTitle() is undefined for the type Window
	

	}

}
