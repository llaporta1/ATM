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
	}
}