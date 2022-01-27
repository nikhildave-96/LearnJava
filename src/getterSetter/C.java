package getterSetter;

public class C {
	/*
	 * Getters and setters can be set for variables with different
	 * access modifiers as shown below
	 */
	
protected String str = "Java is Fun protectedly !";
private String str1 = "Java is Fun privately !";
public String str2 = "Java is Fun publicly !";


public String getStr2() {
	return str2;
}
public void setStr2(String str2) {
	this.str2 = str2;
}
public String getStr() {
	return str;
}
public void setStr(String str) {
	this.str = str;
}
public String getStr1() {
	return str1;
}
public void setStr1(String str1) {
	this.str1 = str1;
}
}
