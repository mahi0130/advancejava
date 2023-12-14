package in.co.rays.marksheet;



public class Testmarksheet {
	public static void main(String[] args) throws Exception {
		testadd();
		//testUpdate();
		//TestDelete();
	}

	private static void TestDelete() throws Exception {
		MarksheetModel model = new MarksheetModel();

		model.delete(20);

	}

	private static void testadd() throws Exception {

		MarksheetBean bean = new MarksheetBean();
		bean.setId(2);
		bean.setName("singh");
		bean.setRoll(120);
		bean.setPhysics(45);
		bean.setChemistry(50);
		bean.setMaths(54);
		
		
		MarksheetModel model = new MarksheetModel();

		model.testadd(bean);

	}
	private static void testUpdate() throws Exception {

		MarksheetBean bean = new MarksheetBean();
		
		
		bean.setName("aryan");
		bean.setRoll(101);
		bean.setPhysics(53);
		bean.setChemistry(45);
		bean.setMaths(60);
		bean.setId(20);
		
		



		MarksheetModel model = new MarksheetModel();

		model.update(bean);
	}


}
