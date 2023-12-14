package user;

import java.text.SimpleDateFormat;

public class TestUser {
	public static void main(String[] args)throws Exception {
		testadd();
		
		
	}

	private static void testadd()throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			
			 UserBean bean = new UserBean();
			 
			 
	 bean.setId(454);
			 bean.setFirst_name("anish");
			 bean.setLast_name("rathore");
			 mailto:bean.setLogin_id("lavish@gmail.com");
			 bean.setPassword("1234lavish");
			 bean.setDob(sdf.parse("2005-12-2"));
			 bean.setAddress("indore");
			 
			 
			 
	 Usermodel model = new Usermodel();
			 
			 
			 
			 model.add(bean); 
			 
			 
			 
			
		}

	
		
		
		
	}


