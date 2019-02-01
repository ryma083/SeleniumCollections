package iterable_Collection_List;

public class Employees implements Comparable<Employees> {

	String name;
	int age;
	String dpt;
	public Employees(String name, int age, String dpt) {
		super();
		this.name = name;
		this.age = age;
		this.dpt = dpt;
	}
	
	@Override
	public int compareTo(Employees emp) {
		int i = emp.age;
		return this.age-i;
	}

	@Override
	public String toString() {
		return "Employees [name=" + name + ", age=" + age + ", dpt=" + dpt + "]";
	}
	


	
	
}
