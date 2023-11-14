package constructor;

public class OOPEx2_Constructor {

	public static void main(String[] args) {
		MobilePhone phone = new MobilePhone();
		System.out.println(phone.hashCode());
		System.out.println(phone.toString());
		
		MobilePhone galaxy = new MobilePhone("삼성", "갤럭시 z플립", 256);
		System.out.println(galaxy.hashCode());
		System.out.println(galaxy.toString());
		
		MobilePhone iPhone = new MobilePhone("애플", 512);
		System.out.println(iPhone.toString());
		
//		iPhone.mainMemory = 256; // 누구나 수정할 수 있는 코드는 좋은 코드가 아님 => private 적용으로 변경 불가
//		System.out.println(iPhone.toString());
		
		System.out.println(galaxy.getBrandName());
		System.out.println(galaxy.getModelName());
		System.out.println(galaxy.getMainMemory());
		
		galaxy.setBrandName("삼성전자");
		System.out.println(galaxy.getBrandName());
		galaxy.setModelName("갤럭시 폴드");
		System.out.println(galaxy.getModelName());
		galaxy.setMainMemory(512);
		System.out.println(galaxy.setMainMemory(1024));
		
		if (iPhone.setMainMemory(1024)) {
			System.out.println("메모리 업그레이드 가능!");
		} else {
			System.out.println("메모리 업그래이드 불가!");
		}
		
		System.out.println(iPhone.toString());
		
		
		Mobile mobile1 = new Mobile("모토롤라", "레이져", 256);
		System.out.println(mobile1.toString());
		System.out.println(mobile1.getBrandName());
		mobile1.setModelName("스타텍");
		System.out.println(mobile1.toString());
		mobile1.setMainMemory(2048);
		
	}

}
