package interfacePractice;

public class InterfaceEx2 {

	public static void work(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	public static void main(String[] args) {
		work(new OracleDao());
		work(new MySqlDao());

	}

}
