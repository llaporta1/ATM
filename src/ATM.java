import java.util.HashMap;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ATM
{
	private HashMap<Integer,Double> idMap;
	NumberFormat n = new
	DecimalFormat("0.00");
	
	public ATM()
	{
		idMap = new HashMap<Integer,Double>();
	}
	
	public void openAccount(int accNum)
	{	
		if(!idMap.containsKey(accNum))
		{
			idMap.put(accNum,0.0);
		}
	}
	
	public void openAccount(int accNum, double initialAmt)
	{	
		if(!idMap.containsKey(accNum))
		{
			idMap.put(accNum,initialAmt);
		}
	}
	
	public void closeAccount(int accNum)
	{
		if (idMap.containsKey(accNum))
		{
			if (idMap.get(accNum) == 0.0)
			{
				idMap.remove(accNum);
			}
		}
	}
	
	public double checkBalance(int accNum)
	{
		if (idMap.containsKey(accNum))
		{
			double currentBalance = idMap.get(accNum);
			double balance = Double.parseDouble(n.format(currentBalance));
			idMap.replace(accNum, balance);
			return (double)idMap.get(accNum);
			
		}
		return 0.0;
	}
	
	public boolean depositMoney(int accNum, double amount)
	{
		if (idMap.containsKey(accNum) && amount > 0)
		{
			idMap.replace(accNum,idMap.get(accNum) + amount);
			return true;
		}
		return false;
	}
	
	public boolean withdrawMoney(int accNum, double amount)
	{
		if (idMap.containsKey(accNum) && amount > 0)
		{
			if(idMap.get(accNum)- amount >= 0.0)
			{
			idMap.replace(accNum,idMap.get(accNum) - amount);
			return true;
			}
		}
		return false;
	}
	
}