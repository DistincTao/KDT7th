package parsers;

public class XMLParser implements Parsable {

	@Override
	public void parse(String extenstion) {
		if (extenstion.equals("xml")) {
			System.out.println("파싱 가능한 XML 파일입니다.");
		}
		
	}


}
