package Marksheet1;

import java.util.Iterator;
import java.util.List;

import in.co.rays.marksheet.MarksheetBean;
import in.co.rays.marksheet.MarksheetModel;

public class testMarksheet1 {
	public static void main(String[] args) throws Exception {

		testnextpk();
		
		// testFindByPk();
		// testSearch();

	}
	private static void testnextpk() throws Exception {

		MarksheetBean bean = new MarksheetBean();
//		bean.setId(20);
		bean.setName("akul");
		bean.setRoll(119);
		bean.setPhysics(73);
		bean.setChemistry(55);
		bean.setMaths(34);
		
		
		MarksheetModel model = new MarksheetModel();

		model.testadd(bean);

	}
	
	
	
	
	private static void testFindByPk() throws Exception {

		Marksheet1model model = new Marksheet1model();

		Marksheet1Bean bean = model.findByPk(2);

		if (bean != null) {

			System.out.print(bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getRoll());
			System.out.print("\t" + bean.getPhysics());
			System.out.print("\t" + bean.getChemistry());
			System.out.println("\t" + bean.getMaths());

		} else {
			System.out.println("ID not found...!!!");
		}

	}
	
	private static void testSearch() throws Exception {

		Marksheet1model model = new Marksheet1model();

		List list = model.search();

		Iterator it = list.iterator();

		while (it.hasNext()) {

			Marksheet1Bean bean = (Marksheet1Bean) it.next();

			System.out.print(bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getRoll());
			System.out.print("\t" + bean.getPhysics());
			System.out.print("\t" + bean.getChemistry());
			System.out.println("\t" + bean.getMaths());

		}

	}



}






