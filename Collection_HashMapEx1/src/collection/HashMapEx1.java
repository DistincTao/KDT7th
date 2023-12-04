package collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HashMapEx1 {

	public static void main(String[] args) {
		String str = "Use careful consideration for accessibility when applying the autofocus attribute. Automatically focusing on a control can cause the page to scroll on load. The focus can also cause dynamic keyboards to display on some touch devices. While a screen reader will announce the label of the form control receiving focus, the screen reader will not announce anything before the label, and the sighted user on a small device will equally miss the context created by the preceding content.";
		
		String strLower = str.toLowerCase();
		String str2 = strLower.replaceAll("[^a-z|A-Z|ㄱ-ㅎ|가-힣|0-9]", " ");
		System.out.println(str2);
		String [] arr = str2.split(" ");
		System.out.println(Arrays.toString(arr));
		
		HashMap <String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			} else {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
		}
		
		// iterlator  사용을 위해 map의 key 값을 Set으로 변경
		Iterator iter = map.entrySet().iterator();
		
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			int value = ((int) entry.getValue());
			System.out.println(entry.getKey() + " : " + value);
		}
		
		System.out.println("========================");
		
		// 알파벳 순으로 정렬 하기 위해 TreeMap에 넣어 출력
		TreeMap<String, Integer> tMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
		tMap.putAll(map);
		
		Iterator iter1 = tMap.entrySet().iterator();
		
		while (iter1.hasNext()) {
			Map.Entry entry = (Map.Entry) iter1.next();
			int value = ((int) entry.getValue());
			System.out.println(entry.getKey() + " : " + value);
		}
		
	}

}
