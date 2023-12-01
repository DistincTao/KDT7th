package collection;

import java.util.HashMap;

public class WordCnt {

	public static void main(String[] args) {
		String sentence = "Use careful consideration for accessibility when applying the autofocus attribute. Automatically focusing on a control can cause the page to scroll on load. The focus can also cause dynamic keyboards to display on some touch devices. While a screen reader will announce the label of the form control receiving focus, the screen reader will not announce anything before the label, and the sighted user on a small device will equally miss the context created by the preceding content.";
		// 문장 내 모든 단어 소문자화
		sentence = sentence.toLowerCase();
		// 문장 나눠서 배열에 넣기
		String [] words = sentence.split(" ");
		// 각 단어에 있는 부호 삭제 하기
		for (int i = 0; i < words.length; i++) {
			if (words[i].contains(",")) {
				words[i].replace(",", "");
			} else if (words[i].contains(".")) {
				words[i].replace(".", "");
			} 
		}
		System.out.println("문장 내 단어 갯수 : " + words.length);
		// 단어 HashMap에 넣기
		HashMap <String, Integer> wordCnt = new HashMap<> ();

		// 중복 되는 것이 있으면 1씩 추가 카운트 하여 값에 집어 넣기 => Overwrite 되도록
		for (int i = 0; i < words.length; i++) {
			int cnt = 1;
			if (wordCnt.containsKey(words[i])) {
				cnt = wordCnt.get(words[i]);
				cnt++;
				wordCnt.put(words[i], cnt);
			} else {
				wordCnt.put(words[i], cnt);
			}
		
		} 
		
		// 최종 결과 출력
		System.out.println("단어 목록 " + wordCnt);
		System.out.println("전체 단어 수 : " + wordCnt.size());
		
	}

}
