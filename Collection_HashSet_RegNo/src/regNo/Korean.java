package regNo;

public class Korean {
	private String regNo;
	private String name;
	
	Korean(String regNo, String name) {
		this.name = name;	
		this.regNo = regNo;

	}
	// 주민 번호는 수정 불가
	public String getRegNo() {
		return this.regNo;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "주민 번호 : " + regNo + ", 이름 : " + name;
	}
	
	@Override
	public boolean equals(Object obj) {
		Boolean result = false;
			if (this.getRegNo().equals(((Korean) obj).getRegNo())) {
				result = true;
			}
			if (this.getName().equals(((Korean) obj).getName())) {
				System.out.println("이름을 확인 해주세요");
			}
		return result;
	}
	
	@Override
	public int hashCode() {
        int hash = 1234;
        if (this.regNo.contains("-")) {
            hash = Integer.parseInt(this.getRegNo().replace("-", ""));
        } else {
            hash = hash * Integer.parseInt(regNo);
        }
		return hash;
	}
}
