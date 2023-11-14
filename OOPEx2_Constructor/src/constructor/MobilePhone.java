package constructor;

public class MobilePhone {
	// private 접근제어자 : 같은 class 내에서만 접근 허용
	private String brandName;
	private String modelName;
	private int mainMemory;

	// 기본 생성자
	public MobilePhone() {
		System.out.println("고객님~ 폰이 개통되었습니다");
	}
	
	// 생성자 Overloading
	public MobilePhone(String brandName, String modelName, int mainMemory) {
		this.brandName = brandName;
		this.modelName = modelName;
		this.mainMemory = mainMemory;
		
	}
	
	public MobilePhone (String brandName, int mainMemory) {
		// 생성자에서 다른 생성자를 호출할 때에는 반드시 생성자의 첫 문장에 써야한다.
//		this(brandName, null, mainMemory); // this()는 생성자
		this(); // 기본 생성자 호출
		this.brandName = brandName;
		this.mainMemory = mainMemory;
//		this(); // 생성자는 첫문장에서 호출 해야 한다 ==> 에러 : Constructor call must be the first statement in a constructor (초기화 순서)
	}
	
//	public MobilePhone (String modelName, int mainMemory) { // Overloading 규칙 위반
//		this(null, modelName, mainMemory);
//	}
	
	public MobilePhone (int mainMemory, String modelName) { // 순서를 바꾸면 가능
	this(null, modelName, mainMemory);
	}
	
	// 메소드
	// get<맴버변수>1(); => getter 생성 , 값을 불러옴
	// set<맴버변수>1(); => setter 생성 , 값을 설정(변경)함
	String getBrandName() {
		return this.brandName;
	}

	String getModelName() {
		return this.modelName;
	}
	
//	int getMainMemory() {
//		return this.mainMemory;
//	}
	
	String getMainMemory() {
		return this.mainMemory + "GB";
	}
	
	void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	void setModelName(String modelName) {
		this.modelName = modelName;
	}
	

	boolean setMainMemory (int mainMemory) {
		boolean result = false;
		if (mainMemory <= 1024) {
			this.mainMemory = mainMemory;
			result = true;
		}
		return result;
	}
	
	
	
	public String toString() {
		return "[" + this.getClass().getName() + " : " + this.hashCode() + "] = brandName : " + this.brandName + 
				", modelName : " + this.modelName + ", mainMemory : " + this.mainMemory ;
		
	}
	
}
