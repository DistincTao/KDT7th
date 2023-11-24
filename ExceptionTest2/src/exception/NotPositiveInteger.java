package exception;

public class NotPositiveInteger extends Exception {
	
	private int errorCode = 508;
	private String msg;
	
	// 생성자
	public NotPositiveInteger() {
		
	}
	
	public NotPositiveInteger(String msg) {
//		this.msg = msg;
		super(msg);
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
//		return "error code : " + this.errorCode + ", " + this.msg;
		return "error code : " + this.errorCode + ", " + super.getMessage();
	}
	
}
