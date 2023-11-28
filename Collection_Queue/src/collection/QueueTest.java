package collection;

//import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
//		Queue<String> queue1 = new ArrayDeque<>();
		
		
		// 추가
		queue.add("현근");
		queue.offer("건우");
		queue.offer("태호");
		queue.offer("현성");
		
		// 꺼내기
		queue.poll();
		System.out.println(queue.peek());
		queue.poll();
		System.out.println(queue.peek());
		queue.poll();
		System.out.println(queue.peek());
		// 꺼낸 후 배열의 크기 확인
		System.out.println(queue.size());
		// 모두 꺼내명 null을 반환
		queue.poll(); 
		System.out.println(queue.peek());
		System.out.println(queue.size());

	}

}
