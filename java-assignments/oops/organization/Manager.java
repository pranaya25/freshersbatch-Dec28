package organization;

public class Manager extends Employee {
	public int incentives;
	
	public Manager(int id, String name, int salary, int incentives) {
		super(id, name, salary);
		this.incentives = incentives;
		
	}
	/*
	public int calculateTotalSalary() {
		return this.incentives+salary;
	}
	*/


}
