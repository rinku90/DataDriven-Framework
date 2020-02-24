package utilities;

public class Dummy {
	public static void main(String[] args) throws Throwable {
		ExcelFileUtil exl= new ExcelFileUtil();
		int trows = exl.rowCount("Supplier");
		System.out.println("total no of rows:"+trows);
		int tcols = exl.colCount("Supplier");//Supplier
		System.out.println("total no of columns:"+trows);
	String st=	exl.getData("Supplier", 2, 3);
		System.out.println("The particular cell Data is:"+st);
		exl.setData("Supplier", 1, 9, "pass");
		exl.setData("Supplier", 2, 9, "pass");
		exl.setData("Supplier", 3, 9, "fail");
		exl.setData("Supplier", 4, 9, "fail");
		exl.setData("Supplier", 5, 9, "Not Executed");
		//exl.setData("Supplier", 6, 9, "pass");
		
	}
	
	

}
