package browerHistory;

import java.util.Stack;
public class BrowerHistroyTest {

	public static Stack<String> historyStack = new Stack<String>();
	public static Stack<String> forward = new Stack<String>();

	// 방문 페이지를 histryStack에 추가
	static void visitPage(String page) {
		historyStack.push(page);
		System.out.println("방문한 페이지 : " + page);
	}
	
	// 뒤로가기
	static void goBack() {
		if (!historyStack.isEmpty()) {
			// historyStack 이 비어있지 않다면
			forward.push(historyStack.pop());
		}
		if (historyStack.isEmpty()) {
			// historyStack 이 비어있다면
			System.out.println("이전 페이지가 없습니다.");
		}
	}
	// 앞으로 가기
	static void goForward() {
		if (!forward.isEmpty()) {
			// historyStack 이 비어있지 않다면
			historyStack.push(forward.pop());
		}
		if (forward.isEmpty()) {
			// historyStack 이 비어있다면
			System.out.println("가장 최근에 방문한 페이지입니다..");
		}
	}
	
	static void printCurrent() {
		System.out.println("historyStack : " + historyStack);
		System.out.println("forward : " + forward);
		if (!historyStack.isEmpty()) {
			System.out.println("현재 페이지 : " + historyStack.peek());
		} else {
			System.out.println("현재 페이지 : " + forward.peek());
		}
	} 
	
	
	public static void main(String[] args) {

		visitPage("1-홈");
		visitPage("2-블프");
		visitPage("3-상품 상세 페이지");
		visitPage("4-연관 상품 페이지");
		visitPage("5-결제 페이지 ");
		
		printCurrent();
		goBack();
		printCurrent();
		goBack();
		printCurrent();
		goBack();
		printCurrent();
		goBack();
		printCurrent();
		goBack();
		printCurrent();
		goForward();
		printCurrent();
		goForward();
		printCurrent();
		goForward();
		printCurrent();
		goForward();
		printCurrent();
		goForward();
		printCurrent();

	}
}
