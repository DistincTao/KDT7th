package parsers;

public class ParserEx2 {

	public static void main(String[] args) {
	      
	    Parsable parserX = ParseManager.getParser("abc.xml");
	    parserX.parse("xml");
	      
	    Parsable parserJ = ParseManager.getParser("data.json");
	    parserJ.parse("json");

		
		
		Parsable parser1 = ParseManager.getParser("123.xml");
		parser1.parse("xml");
		parser1.parse("json");
		Parsable parser2 = ParseManager.getParser("q1234.json");
		parser2.parse("json");
		parser2.parse("xml");

	}

}
