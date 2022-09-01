public class ATMTester
{
	public static void main(String[] args) 
	{
	
		ATM atm1 = new ATM();
	
		atm1.openAccount(13);
		System.out.println(atm1.checkBalance(13));
		atm1.depositMoney(13,3.4);
		System.out.println(atm1.checkBalance(13));
		atm1.withdrawMoney(13,2.1);
		System.out.println(atm1.checkBalance(13));
		System.out.println(atm1.withdrawMoney(13, 30.0));
		System.out.println(atm1.depositMoney(13, 1.0));
		System.out.println(atm1.checkBalance(13));
		System.out.println(atm1.withdrawMoney(13, 2.3));
		System.out.println(atm1.checkBalance(13));
		atm1.closeAccount(13);
		System.out.println(atm1.depositMoney(13, 15.0));
		System.out.println(atm1.withdrawMoney(13, 15.0));
	}
}