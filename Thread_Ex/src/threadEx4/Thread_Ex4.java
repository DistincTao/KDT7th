package threadEx4;

public class Thread_Ex4 {

	public static void main(String[] args) {
//		Family dad = new Family("Dad");
//		Family mom = new Family("Mom");
//		Family me = new Family("Me");
		
		Runnable fam = new Family("");
		Thread fth = new Thread(fam);
		Thread mth = new Thread(fam);
		Thread meth = new Thread(fam);

		
		fth.start();
		mth.start();
		meth.start();

	}

}
