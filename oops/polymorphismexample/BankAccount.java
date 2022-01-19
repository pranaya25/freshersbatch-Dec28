package polymorphismexample;

class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new SavingsAccount();
		a.totalBalance();
	
				Bank b ;	
			
				b=new Saving();
				b.display();
				b=new Current();
				b.display();
			}
		}

	}

}
