package thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchornizeCollection {

	static final int THREAD_CNT = 2;
	
	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<>();
		List<Integer> list = Collections.synchronizedList(new ArrayList<Integer>());
		
		ExecutorService es = Executors.newFixedThreadPool(THREAD_CNT);
		
		for (int i = 0; i <THREAD_CNT; i++) {
			es.execute(new Runnable() { // 간단한 경우 익명으로 인터페이스를 불러 Override하는 경우도 종종 있다.

//				@Override
//				public void run() {
//					while (true) {
//						synchronized (es) {
//							list.clear();
//							list.add(100);
//							list.remove(0);
//						}
//					}
//				}
				
				@Override
				public void run() {
					while (true) {
						synchronized (list) {
							list.clear();
							list.add(100);
							list.remove(0);
						}
					}
				}
				
			});
		}
		

	}

}
