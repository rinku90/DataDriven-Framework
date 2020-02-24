package utilities;

import CommonFunLibrary.OhrmExcl;

public class Orhm {
   public static void main(String[] args) throws Throwable {
	 OhrmExcl f=new OhrmExcl();
	 ExcelFileUtil exl=new ExcelFileUtil();
	 int row= exl.rowCount("orange");
	   for(int i=1;i<=row;i++) {
	   String userrole= exl.getData("orange", i, 0);
	   String empname= exl.getData("orange", i, 1);
	   String  username= exl.getData("orange", i, 2);
	   String status= exl.getData("orange", i, 3);
	   String password= exl.getData("orange", i, 4);
	   String cpassword= exl.getData("orange", i, 5);
	   f.launchapp("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
	   f.login("Admin", "Qedge123!@#");
	  
	   String result=f.admin(userrole, empname, username, status, password, cpassword);
	   System.out.println(result);
	   exl.setData("orange", i, 6, result);
	   f.logout();
	   f.clobrowser();
	  
       
	   } 
		
   }
	}

