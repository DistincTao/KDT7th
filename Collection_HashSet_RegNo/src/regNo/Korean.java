package regNo;

import java.util.Objects;

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
	
//	@Override
//	public boolean equals(Object obj) {
//		Boolean result = false;
//		if (this.getRegNo().equals(((Korean) obj).getRegNo())) {
//			result = true;
//		}
//		if (this.getName().equals(((Korean) obj).getName())) {
//			System.out.println("이름을 확인 해주세요");
//		}
//		return result;
//	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if (!(obj instanceof Korean)) {
//			return false;
//		} 
//			Korean kor = (Korean)obj;
//		return this.regNo.equals(kor.regNo) &&  this.name.equals(kor.name);
//	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Korean)) {
			return false;
		} 	
		Korean kor = (Korean)obj;
		if (this.name.equals(kor.name)) {
			System.out.println("이름을 확인해 주세요");
		}	
		return this.regNo.equals(kor.regNo);
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Korean other = (Korean) obj;
//		return Objects.equals(name, other.name) && Objects.equals(regNo, other.regNo);
//	}
	
//	@Override
//	public int hashCode() {
//		int hash = 1234;
//        if (this.regNo.contains("-")) {
//            hash = Integer.parseInt(this.getRegNo().replace("-", ""));
//        } else {
//            hash = hash * Integer.parseInt(regNo);
//        }
//        
//        if (hash < 0) {
//        	hash *= -1;		 
//        }
//        
//		return hash;
//	}
	
//	@Override
//	public int hashCode() {
//		int hash = (this.regNo).hashCode();
//		 if (hash < 0) {
//		 hash *= -1;		 
//	 }
//		 return hash;
//	} 

	@Override
	public int hashCode() {
		 int hash = Objects.hash(regNo);
		 if (hash < 0) {
			 hash *= -1;		 
		 }
		 return hash;
	} 
}
