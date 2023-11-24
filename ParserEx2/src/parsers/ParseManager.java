package parsers;

public class ParseManager{	
	
	// 매소드
	public static Parsable getParser(String fileName) {
		Parsable parser = null;
//		String ext = fileName.substring(fileName.indexOf("."));		
		String ext = fileName.substring(fileName.lastIndexOf(".") + 1);
		if (ext.equals("xml")) {
			parser = new XMLParser();
		} else if (ext.equals("json")) {
			parser = new JSONParser();
		}
		return parser;
	}
	
}
