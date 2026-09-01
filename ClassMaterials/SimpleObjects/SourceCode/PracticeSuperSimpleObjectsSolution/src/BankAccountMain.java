
public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount("Joint Checking");
		System.out.println(ba);
		
		BankAccount sa = new BankAccount("Savings", 100);
		System.out.println(sa);
		
		ba.deposit(20);
		ba.withdraw(40);
		System.out.println(ba);
		
		sa.withdraw(50);
		System.out.println("Balance: " + sa.getBalance());
		
		sa.setName("Joint Savings");
		System.out.println("Name: " + sa.getName());
		
		String[] tl = sa.getTransactionLog();
		for (int i=0;i<tl.length;i++) {
			System.out.println(tl[i]);
		}
	}

}
