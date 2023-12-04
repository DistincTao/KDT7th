package collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap <> ();
		
		map.put(1, "하영");
		map.put(2, "연지");
		map.put(3, "지우");
		map.put(4, "수혁");
		map.put(6, "현근");
		map.put(5, "동진");
		map.put(7, "상용");
		map.put(7, "현성"); // 키(Key)가 중복이면 해당 키(Key)의 값(value)이 OverWrite됨 
		
		// 데이터 탐색
		
		if (map.containsKey(7)) {
			System.out.println(map.get(7));
		} else {
			System.out.println("자료가 없습니다.");
		}
		
		// Map에 있는 모든 키를 검색
		Set<Integer> keys = map.keySet();
		
		for (Integer i : keys ) {
			System.out.print(i + "\t");
		}
		System.out.println();
		System.out.println(keys);
		
		// Map에 있는 모든 값를 검색

		Collection<String> values = map.values();
//		List <String> valList = map.values(); // Type mismatch: cannot convert from Collection<String> to List<String>

		for (String s : values ) {
			System.out.print(s + "\t");
		}
		System.out.println();
		System.out.println(values);
		
		System.out.println(map);
		
		// 저장된 ID와 PW를 입력 받아 회신하는 프로그램
		
		HashMap <String, String> userMap = new HashMap <> ();
		userMap.put("doolly" , "1234");
		userMap.put("ddochi" , "1134");
		userMap.put("huidong" , "2352");
		userMap.put("gildong" , "4576");
		userMap.put("chulsoo" , "2574");
		
		Scanner sc = new Scanner (System.in);
		
		
//		while (true) { 
//			System.out.println("=================");
//			System.out.println("ID와 PW를 입력하세요");
//			System.out.println("=================");
//			System.out.print("ID     >>");
//			String userId = sc.nextLine();
//			
//			System.out.print("PW     >>");
//			String userPw = sc.nextLine();
//			
//			if (!userMap.containsKey(userId)) {
//				System.out.println("존재하지 않는 ID 입니다.");
//				continue;
//			} else if (!userMap.get(userId).equals(userPw)){ 
//				System.out.println("정보를 다시 확인 해주세요");
//				continue;
//			} else {
//				System.out.println("환영합니다. 로그인에 성공하셨습니다.");
//				break;
//			}
//		}
		
		// 성적표 만들기
		// Map : 학번, 성적
		// 총 학생의 목록 출력
		// 총점, 평균, 최고 점수, 최저 점수
		
		HashMap <String, Integer> students = new HashMap <> ();
		
		students.put("23001", 90);
		students.put("23002", 45);
		students.put("23003", 67);
		students.put("23004", 48);
		students.put("23006", 29);
		students.put("23005", 58);
			
		System.out.println(students);
		
		Collection<Integer> scores = students.values();
		int total = 0;
		for (Integer i : scores) {
			total += i;
		}
		
		System.out.println(scores);
		
		double avg = total / (scores.size() * 1.0d);
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		
		//최대값 최소값 구하기
		
		System.out.println("최고점 : " + Collections.max(scores));
		System.out.println("최저점 : " + Collections.min(scores));


		///////////////////////////////////////////////////////////////////
		
		HashMap <String, Integer> scoreMap = new HashMap <> ();
		
		scoreMap.put("23001", 90);
		scoreMap.put("23002", 45);
		scoreMap.put("23003", 67);
		scoreMap.put("23004", 48);
		scoreMap.put("23006", 29);
		scoreMap.put("23005", 58);
		
		// 학생목록
		Set set = scoreMap.entrySet();
		
		Iterator iter = set.iterator();
		
		while (iter.hasNext()) {
			Map.Entry es = (Map.Entry) iter.next();
			System.out.println("학번 : " + es.getKey() + ", 성적 : " + es.getValue());
		}
		
		Set keySet = scoreMap.keySet();
		System.out.println("학번 목록 : " + keySet);
		
		System.out.println("총 학생 수 : " + scoreMap.size());
		
		Collection<Integer> valueCollection = scoreMap.values();
		System.out.println("성적 목록 : " + valueCollection);
		
		int totalScore = 0;
//		for (Integer i : valueCollection) {
//			totalScore += i;
//		}
		
		Iterator iterTot = valueCollection.iterator();
		while (iterTot.hasNext()) {
			Integer index = (Integer) iterTot.next();
			totalScore += index;
		}
		System.out.println("총점 : " +totalScore);
		
		System.out.println("최고점 : " + Collections.max(valueCollection));
		System.out.println("최저점 : " + Collections.min(valueCollection));
		
	}
}
