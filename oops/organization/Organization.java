package organization;

public class Organization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager m1 = new Manager(1,"Pranaya", 25000,4000);
		
		System.out.println("Manager "+m1.name+" has total salary is "+m1.calculateTotalSalary());
		
		Labour l1 = new Labour(1,"Ramya", 15000,6000);
		
		System.out.println("Labour "+l1.name+" has total salary is "+l1.calculateTotalSalary());

	}

}
