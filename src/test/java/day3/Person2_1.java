package day3;

public class Person2_1 {
	 public String name;
	  public int age;
	public Person2_1(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person2_1 [name=" + name + ", age=" + age + "]";
	}
}
