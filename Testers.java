package project;

public class Testers extends Employee {
	static int tecount=0;
	public Testers(String name,double salary, String designation) {
		super(name, salary, designation);
		tecount++;
	}
	public void work() {
		System.out.println(getName()+" is Testing");
	}
}
