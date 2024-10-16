package project;

public class Developer extends Employee{
	static int devcount=0;
	public Developer(String name, double salary, String designation) {
		super(name, salary, designation);
		devcount++;
	}
	public void work() {
		System.out.println(getName()+" is Coding");
	}
}
