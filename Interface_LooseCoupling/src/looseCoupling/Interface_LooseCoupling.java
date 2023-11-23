package looseCoupling;

public class Interface_LooseCoupling {

	public static void main(String[] args) {
		Tv tv = new Tv("LG");
		Computer com = new Computer();
		
		MultiRemoteController mrc = new MultiRemoteController();
		mrc.remoteControl(tv);
		mrc.remoteControl(com);
	}

}
