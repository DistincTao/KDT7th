package parsers;

public class JSONParser implements Parsable {

	@Override
	public void parse(String extenstion) {
		if (extenstion.equals("json")) {
			System.out.println("파싱 가능한 json 파일입니다.");
		}
		
	}


	


}
