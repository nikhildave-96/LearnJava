package javaStringClass;

public class String_split {

	public static void main(String[] args) {
		
    String s = "testingExcel.xlsx";
    
    String split= s.substring(s.indexOf("."));
    
    System.out.println(split);
	}

}
