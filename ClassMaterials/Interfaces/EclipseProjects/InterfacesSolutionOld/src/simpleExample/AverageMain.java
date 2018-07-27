package simpleExample;

public class AverageMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BankAccount[] accounts = new BankAccount[3];
		accounts[0] = new BankAccount();
		accounts[0].setBalance(100);
		accounts[1] = new BankAccount();
		accounts[1].setBalance(150);
		accounts[2] = new BankAccount();
		accounts[2].setBalance(200);

		Country[] countries = new Country[3];
		countries[0] = new Country("Uruguay",176220);
		countries[1] = new Country("Thailand",513120);
		countries[2] = new Country("Belgium",30510);
		
		//********Step one, using methods below before creating interface
		double averageBalance = bankAverage(accounts);
		System.out.println("The average balance: " + averageBalance);
		
		double averageArea = averageArea(countries);
		System.out.println("The average area for countries is: " + averageArea);
		
		//STEP TWO
		averageBalance = getAverage(accounts);
		System.out.println("The average balance is still: " + averageBalance);
		
		averageArea = getAverage(countries);
		System.out.println("The average area for countries is still: " + averageArea);
		
		//STEP THREE
		averageBalance = Data.average(accounts);
		System.out.println("The average balance is still: " + averageBalance);
		
		averageArea = Data.average(countries);
		System.out.println("The average area for countries is still: " + averageArea);
	}
	
	//******************STEP ONE BEFORE GOING TO INTERFACE************
	public static double bankAverage(BankAccount[] accounts) {
		double sum = 0.0;
		for(BankAccount acct : accounts) {
			sum += acct.getBalance();
		}
		return sum/accounts.length;
	}
	
	public static double averageArea(Country[] countries) {
		double sum = 0.0;
		for(Country cty : countries) {
			sum += cty.getArea();
		}
		return sum/countries.length;
	}
	
	//****************STEP TWO AFTER WRITING INTERFACE***************
	public static double getAverage(Measurable[] objs) {
		double sum = 0.0;
		for(Measurable obj : objs) {
			sum += obj.getMeasure();
		}
		return sum/objs.length;
	}

}
