package collection2;

import java.util.ArrayList;
import java.util.HashMap;


public class WordBook {
	static HashMap <String, ArrayList<String>> wordBooks = new HashMap<> ();

	public static void main(String[] args) {
		// ArrayList 에 의미가 여러개 들어가는지 확인
		// 
		HashMap <String, ArrayList<String>> wordBook = new HashMap<> ();
		ArrayList<String> meanings = new ArrayList<>();
		

		meanings.add("에이(영어 알파벳의 첫째 글자)");
		meanings.add("음악 ‘가’ 음(다장조의 제6음)");
		meanings.add("(영국의) A 도로, 국도");
		meanings.add("<부정의 의미를 덧붙이는 ‘부–·무–·비–’의 뜻을 나타냄>");
		
		wordBook.put("a", meanings);
		
		System.out.println(wordBook);

		// List / Collection 을 활용하는 방법 생각해보자
		
		
		addWord("a", "(영국의) A 도로, 국도");
		addWord("a", "음악 ‘가’ 음(다장조의 제6음)");
		addWord("a", "(영국의) A 도로, 국도");
		addWord("a", "<부정의 의미를 덧붙이는 ‘부–·무–·비–’의 뜻을 나타냄>");
		addWord("b", "명사 비(영어 알파벳의 둘째 글자)");
		addWord("b", "사 음악 ‘나’ 음(다장조의 제7음)");
		addWord("b", "(영국의) B 도로, 국도");
		addWord("c", "명사 시(영어 알파벳의 셋째 글자)");
		addWord("c", "사 음악 ‘다’ 음(다장조의 제1음) (→middle C)");
		addWord("c", "약어 곶, 갑(Cape)");
		addWord("c", "약어 음악 섭씨(Celsius, Centigrade)");
		addWord("d", "명사 디(영어 알파벳의 넷째 글자)");
		addWord("d", "명사 음악 ‘라’음(다장조의 제2음)");
		addWord("d", "약어 민주당원(의)");
		

		System.out.println("--------------------------------");	
		System.out.println(wordBooks.get("a"));
		System.out.println("--------------------------------");	
		System.out.println(wordBooks.get("b"));
		System.out.println("--------------------------------");	
		System.out.println(wordBooks.get("c"));
		System.out.println("--------------------------------");	
		System.out.println(wordBooks.get("d"));
		
	}
	
	static void addWord(String word, String meaning){

		if (wordBooks.containsKey(word)) {
			wordBooks.get(word).add(meaning);
		} else {
			ArrayList<String> meanings = new ArrayList<>();
			wordBooks.put(word, meanings);
			meanings.add(meaning);
		}
	}

}
