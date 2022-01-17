package organization;

public class Labour extends Employee {
	public int overtime;
	
	public Labour(int id, String name, int salary, int overtime) {
		super(id, name, salary);
		this.overtime = overtime;
		
	}
	
	public int calculateTotalSalary() {
		return this.overtime+salary;
	}
}
