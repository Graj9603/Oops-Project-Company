package project;

public class Company {
	public static void Display(Employee emp) {
		System.out.println("Name is :"+emp.getName());
		System.out.println("Eid is :"+emp.getEid());
		System.out.println("Salary is :"+emp.getSalary());
		System.out.println("Designation is :"+emp.getDesignation());
		System.out.println("---------------------");
	}
	public static void main(String[] args) {
		Developer d1 = new Developer("John", 4000, "Jr Developer");
		Developer d2 = new Developer("Smith", 7000, "Sr Developer");
		Developer d3 = new Developer("King", 8000, "App Developer");
		Testers t1 = new Testers("Scott", 6000, "Jr Tester");
		Testers t2 = new Testers("Allen", 8000, "Sr Tester");
		Hr h1 = new Hr("Ganesh", 5000, "Jr Hr");
		Hr h2 = new Hr("Ganesh", 7000, "Sr Hr");
		Employee emp[]= {d1,d2,d3,t1,t2,h1,h2};
		for(int i=0;i<emp.length;i++) {
			Display(emp[i]);
		}
		System.out.println(Developer.devcount);
		System.out.println(Testers.tecount);
		System.out.println(Hr.hrcount);
	}

}
