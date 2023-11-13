class Data {
	int x;
	
}


public class PrimitiveParamEx {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("x : " + d.x);
		
		change (d.x);
		System.out.println("change 메소드 호출 후 : " + d.x);
	}
	
	static void change(int x) {
		x = 1000;
		System.out.println("change 메소드 x : " + x);
	}

}
