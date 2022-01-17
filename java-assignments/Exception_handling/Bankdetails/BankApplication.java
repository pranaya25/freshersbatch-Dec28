
public class BankApplication {

	public static void main(String[] args) throws Exception {
		SavingsAccount sa = new SavingsAccount(10, 2000);
		System.out.println("Savings account id: "+ sa.id + " balance is "+ sa.balance);
		
		sa.deposit(1500);
		
		System.out.println("Savings account id: "+ sa.id + " balance is "+ sa.balance);
		
		sa.withdraw(-5000);
		
		System.out.println("Savings account id: "+ sa.id + " balance is "+ sa.balance);
		
	}

}
