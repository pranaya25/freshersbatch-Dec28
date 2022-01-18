import java.util.*;
public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Employee> set=new HashSet<Employee>();
		Employee emp= new Employee(101,"pranaya",300000,"analyst");
		set.add(emp);
		emp.display();
	}

}
