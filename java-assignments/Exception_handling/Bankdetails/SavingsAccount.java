
public class SavingsAccount {

public long id;
public double balance;

public SavingsAccount(long id,double balance)
{
	this.id=id;
	this.balance=balance;
}

public double withdraw(double amount) throws Exception
{
	if(amount < 0) {
		throw new IllegalBankTransactionException("amount cannot be negative");
	}
	
	if (balance<amount) {
		throw new InsufficientBalanceException("Insufficient funds");
	}
	
	this.balance = this.balance - amount;
	return this.balance;
}

public double deposit(double amount) throws Exception {
	if(amount < 0) {
		throw new IllegalBankTransactionException("amount cannot be negative");
	}
	
	this.balance = this.balance + amount;
	
	return this.balance;
}
}
