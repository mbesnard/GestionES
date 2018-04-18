
public class XML {

	private String name;
	private int age;
	public XML() {
	System.out.println("Empty args ctor called");
	setName("");
	setAge(0);
	}
	public void setName(String n) {
	this.name = n;
	}
	public String getName() {
	return name;
	}
	public void setAge(int a) {
	this.age = a;
	}
	public int getAge() {
	return age;
	}
	public XML(String s,int age) {
	setName(s);
	setAge(age);
	}
	public String toString() {
	return getName()+"("+getAge()+")";
	}
	
}