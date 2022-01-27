package getterSetter;

public class DemoLearn {
	protected String name = "Nikhil Dave";

	private int age = 24;	
	private float exp = 2.6f;

	// alt+shift+s is the shortcut for getters and setters 
	public int  getAge() {
		return age;
	}
	
	public void setAge(int personAge) {
		this.age = personAge;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
