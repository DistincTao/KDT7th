package collection;

import java.util.List;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// Stack : 자료 구조의 Stack 구조를 클래스화 한 것
		//  LIFO : Last in First Out
		
//		List <String> stack = new Stack<String>();
		Stack <String> stack = new Stack<String>();
		
		//push()
		stack.push("네이버");
		stack.push("네이버웹툰");
		stack.push("노션");
		stack.push("자바API");
		stack.push("네이버2");
		
		System.out.println(stack.peek()); // stack에서 제일 마지막 데이터를 꺼냈다가 다시 집어 넣음
		System.out.println(stack.indexOf("네이버2"));
		System.out.println(stack.get(stack.indexOf("네이버")));
		
		stack.pop(); // stack 에서 제일 마지막 데이터를 꺼내서 삭제
		System.out.println(stack.peek());
		
		System.out.println("----Stack 내용을 역순으로 꺼내보기");
		for (int i = stack.size() - 1; i > -1; i--) {
			System.out.println(stack.get(i));
		}
		
		//empty ()
		while (!stack.empty()) {
			stack.pop();
		}
		
		System.out.println(stack.empty());
		System.out.println(stack.size());

	}

}
