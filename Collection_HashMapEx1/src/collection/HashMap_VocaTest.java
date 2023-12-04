package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class HashMap_VocaTest {
	public static Scanner sc = new Scanner(System.in);
//	public static Map<String, ArrayList<String>> vocaBook = new HashMap<>();
	public static Map<String, ArrayList<String>> vocaBook = new TreeMap<>();

	public static void main(String[] args) {
	// 단어와 뜻을 입력	
		addWord("apple", "사과");
		addWord("apple", "전자제품 주식회사");
		addWord("galaxy", "은하수");
		addWord("galaxy", "핸드폰 브랜드");
		addWord("java", "커피의 품종 중 하나");
		addWord("java", "컴퓨터 프로그래밍 언어");
		addWord("galaxy", "사과");
		addWord("galaxy", "전자제품 주식회사");
		addWord("white", "은하수");
		addWord("orange", "핸드폰 브랜드");
		addWord("orange", "커피의 품종 중 하나");
		addWord("bat", "박쥐");
		addWord("bat", "야구방망이");
		addWord("bug", "벌레");
		addWord("bug", "컴퓨터 오류");
	
		printVocaBook();
//		// 검색 : 단어 => 뜻
//		searchByWord();
//		searchByMeaning();

		while (true) {
			System.out.println("--------------------------------------------");
			System.out.println("---- 1. 단어 입력");
			System.out.println("---- 2. 검색 : 단어 -> 뜻");
			System.out.println("---- 3. 검색 : 뜻 -> 단어");
			System.out.println("---- 4. 단어장 출력");
			System.out.println("---- 5. 단어 삭제");
			System.out.println("---- 9. 종 료");
			System.out.println("--------------------------------------------");

			System.out.print("번호를 입력하세요 >>>>");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch (menu) {
			case 1 : 
				addNewWord();
				break;
			case 2 : 
				searchByWord();
				break;
			case 3 : 
				searchByMeaning();
				break;
			case 4 : 
				printVocaBook();
				break;
			case 5 : 
				deletWord();
				break;
			case 9 : 
				System.exit(0);
				break;
			}
		}

		

	}

	private static void deletWord() {
		System.out.print("삭제할 영어 단어를 입력하세요 >>>");
		String deleteWord = sc.nextLine();
		
		vocaBook.remove(deleteWord);
		
	}

	private static void addNewWord() {
		System.out.print("영어 단어를 입력하세요 >>>");
		String newWord = sc.nextLine();
		
		while (true) {
			System.out.println("뜻을 입력하세요 (종료 시 q를 입력)");
			String newMeaning = sc.nextLine();
			if (newMeaning.equals("q")) {
				break;
			} else {
				addWord(newWord, newMeaning);
			}	
		}
	}

	private static void searchByMeaning() {
		System.out.print("조회할 뜻을 입력하세요 >>>");
		String meaning= sc.nextLine();
		System.out.println("==> " +  meaning + "뜻을 검색합니다 ");
		
		Boolean isFind = false;
		for (Map.Entry<String, ArrayList<String>> entry : vocaBook.entrySet()) {
			String word = entry.getKey();
			ArrayList <String> meanings = entry.getValue();
			if (meanings.contains(meaning)){
				isFind = true;
				System.out.println(word);
			}
		}
		if (isFind == false) {
			System.out.println("찾는 뜻을 가진 단어가 없습니다.");
		}


		
		
	}

	private static void searchByWord() {
		System.out.print("조회할 단어 입력 >>>");
		String wordForSearch = sc.nextLine();
		System.out.println("==> " +  wordForSearch + "뜻을 검색합니다 ");
		ArrayList<String> meanings = vocaBook.get(wordForSearch);
		if (meanings != null) {
			System.out.println(wordForSearch + " : " + meanings);
		} else {
			System.out.println("찾으시는 " + wordForSearch + "의 뜻이 없습니다.");
		}
		
	}

	private static void printVocaBook() {
//		Set<String> words = vocaBook.keySet();
//		
//		for (String word : words) {
//			System.out.println("단어 : " + word);
//			
//			List<String> means = vocaBook.get(word);
//			for (String mean : means) {
//				System.out.print(" " + mean);
//			}
//			System.out.println();
//		}
		
		// Map.Entry 사용
		for (Map.Entry <String, ArrayList<String>> entry : vocaBook.entrySet()) {
			String word = entry.getKey();
			ArrayList <String> meaning = entry.getValue();
			System.out.println("단어 : " + word + ", 뜻 : " + meaning);
		}

	}

	private static void addWord(String word, String meaning) {
		
		if (vocaBook.containsKey(word)) {
			vocaBook.get(word).add(meaning);			
		} else {
			ArrayList<String> meanings = new ArrayList<>();
			meanings.add(meaning);
			vocaBook.put(word, meanings);
		}
	}
}

