package project;

public class Hr extends Employee{
	static int hrcount=0;
	public Hr(String name, double salary, String designation) {
		super(name, salary, designation);
		hrcount++;
	}
	public void work() {
		System.out.println(getName()+" is Hiring");
	}

}
