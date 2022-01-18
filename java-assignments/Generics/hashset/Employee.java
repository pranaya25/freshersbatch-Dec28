
public class Employee {
int id,salary;
String name, department;
public Employee(int id,String name,int salary,String department) {
	this.id=id;
	this.salary=salary;
	this.name=name;
	this.department=department;
}
public int getid()
{
	return id;
}
			public void set(int id) {
			this.id = id;
			}
			public int getsalary() {
	return this.salary;
			}
			public void setsalary(int salary) {
			this.salary = salary;
			
			}
			public String getname(String name) {
			return name;
			}
			public void setname(String name) {
			this.name = name;
	
		}
			public void display() {
			System.out.println("Employee id:"+id); 
			System.out.println("Name:"+name);
			System.out.println("Department:"+department);
			System.out.println("Salary:"+salary);
			}
}
