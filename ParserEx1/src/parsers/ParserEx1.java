package parsers;

public class ParserEx1 {

	public static void main(String[] args) {

		ParseManager pm = new ParseManager ();
		pm.checkfile("123.xml");
		pm.checkfile("123.json");
		
		Parser parser = pm.selectParser("123.xml");
		parser.parsingData();
		parser.stopParsing();
		
		Parser parser2 = pm.selectParser("123.json");
		parser2.parsingData();
		parser2.stopParsing();
		
	}

}