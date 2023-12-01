package collection2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class WordBook {

	public static void main(String[] args) {
		HashMap <String, HashSet<String>> wordBook = new HashMap<> ();
		HashSet<String> meanings = new HashSet<>();
		
		meanings.add("(영국의) A 도로, 국도");
		meanings.add("음악 ‘가’ 음(다장조의 제6음)");
		meanings.add("(영국의) A 도로, 국도");
		meanings.add("<부정의 의미를 덧붙이는 ‘부–·무–·비–’의 뜻을 나타냄>");

		wordBook.put("a", meanings);
		
		System.out.println(wordBook);

		// List / Collection 을 활용하는 방법 생각해보자
		
		HashMap <String, List<String>> wordBook2 = new HashMap<> ();
		List<String> meanings2 = new ArrayList<>();
		
		wordBook2.put("a", meanings2);
		wordBook2.get("a").add("(영국의) A 도로, 국도");
		wordBook2.get("a").add("음악 ‘가’ 음(다장조의 제6음)");
		wordBook2.get("a").add("(영국의) A 도로, 국도");
		wordBook2.get("a").add("<부정의 의미를 덧붙이는 ‘부–·무–·비–’의 뜻을 나타냄>");
		wordBook2.put("b", meanings2);
		wordBook2.get("b").add("(명사 비(영어 알파벳의 둘째 글자)");
		wordBook2.get("b").add("사 음악 ‘나’ 음(다장조의 제7음)");
		wordBook2.get("b").add("(영국의) B 도로, 국도");
		wordBook2.put("c", meanings2);
		wordBook2.get("c").add("명사 시(영어 알파벳의 셋째 글자)");
		wordBook2.get("c").add("사 음악 ‘다’ 음(다장조의 제1음) (→middle C)");
		wordBook2.get("c").add("약어 곶, 갑(Cape)");
		wordBook2.get("c").add("약어 음악 섭씨(Celsius, Centigrade)");
		wordBook2.put("d", meanings2);
		wordBook2.get("d").add("명사 디(영어 알파벳의 넷째 글자)");
		wordBook2.get("d").add("명사 음악 ‘라’음(다장조의 제2음)");
		wordBook2.get("d").add("약어 민주당원(의)");
		
		
		System.out.println(wordBook2);

	}

}
