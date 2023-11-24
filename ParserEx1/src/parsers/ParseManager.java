package parsers;

public class ParseManager implements Parsable{	
	

	public String checkfile(String fileName) {
//		String ext = fileName.substring(fileName.indexOf("."));		
		String ext = fileName.substring(fileName.lastIndexOf(".") + 1);
		if (ext.equals("xml")){
			System.out.println(ext + " 파일 입니다.");
		}
		if (ext.equals("json")){
			System.out.println(ext + " 파일 입니다.");
		}
		return ext;
		
	}

	public Parser selectParser(String fileName) {
		Parser parser = null;
//		String ext = fileName.substring(fileName.indexOf("."));		
		String ext = fileName.substring(fileName.lastIndexOf(".") + 1);
		if (ext.equals("xml")){
			parser = new XMLParser();
		}
		if (ext.equals("json")){
			parser = new JSONParser();
		}
		return parser;
		
	}
	


	


}
