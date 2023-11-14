package StaticVs;

class Document {

	static int cnt = 0;
	String docName;
	
	Document(){ // 기본생성자
		// 사용자가 문서 이름을 지정하지 않으면 "제목없음1.txt
		cnt ++;
		String result = "제목없음" + cnt + ".txt";
		System.out.println(result);
//		System.out.println("제목없음" + ++cnt + ".txt");
	}
	
	Document (String docName) {
		this.docName = docName;
		System.out.println(docName +".txt");
	}

}
