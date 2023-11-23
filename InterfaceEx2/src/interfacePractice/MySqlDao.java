package interfacePractice;

public class MySqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("MySql DB에서 검색합니다.");
		
	}

	@Override
	public void insert() {
		System.out.println("MySql DB에 내용을 추가합니다.");
		
	}

	@Override
	public void update() {
		System.out.println("MySql DB의 내용을 갱신합니다.");
		
	}

	@Override
	public void delete() {
		System.out.println("MySql DB에서 내용을 삭제합니다.");


	}

}
