package project;

abstract class Employee {
	private String name;
	private int eid;
	private double salary;
	private String designation;
	static int autoEid;
	public Employee(String name, double salary, String designation) {
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.eid=++autoEid;
	}
	public abstract void work();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEid() {
		return eid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
}
