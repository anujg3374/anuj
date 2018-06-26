package bank;

public class CurrentAccount extends Account {
double minBalance=5000;
double charge=6.0;
double amount;
void withdrawal(double withdrawalAmount)
{
	if(getBankBalance()-withdrawalAmount>minBalance)
	{
		
		amount=getBankBalance()-withdrawalAmount;
		setBankBalance(amount);
		
	System.out.println("withdrawal Amount:"+withdrawalAmount+" Bank balance left:"+amount);
	}
	else
		{
		
		amount=getBankBalance()-withdrawalAmount;
		setBankBalance(amount);
		System.out.println("withdrawal Amount:"+withdrawalAmount+" Bank balance left:"+amount);
		System.out.println("your Bank balance less then "+minBalance+" charges will be thir of "+charge+"% after 3 days");
		
		}
}
void Display()
{
//	System.out.println("Bank Balance:"+getBankBalance());
}
}
