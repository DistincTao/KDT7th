package constructor;

public class Mobile {
	private String brandName;
	private String modelName;
	private int mainMemory;
	/**
	 * 생성자
	 * @param brandName
	 * @param modelName
	 * @param mainMemory
	 */
	public Mobile(String brandName, String modelName, int mainMemory) {
		this.brandName = brandName;
		this.modelName = modelName;
		this.mainMemory = mainMemory;
	}
	// getter Setter
	public String getBrandName() {
		return brandName;
	}
	
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	public String getModelName() {
		return modelName;
	}
	
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public String getMainMemory() {
		return mainMemory + "GB";
	}
	
	public void setMainMemory(int mainMemory) {
		if (mainMemory <= 1024) {
			this.mainMemory = mainMemory;
		} else {
			System.out.println("메모리 변경 불가");
		}
	}
	
	@Override
	public String toString() {
		return "Mobile [brandName=" + brandName + ", modelName=" + modelName + ", mainMemory=" + 
				getMainMemory() + ", hashCode()=" + hashCode() + "]";
	}
	
}
