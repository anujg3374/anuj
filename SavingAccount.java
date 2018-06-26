package bank;
public class SavingAccount extends Account {
double rate=10.25;
double time=5;
double ci;
void compoundInterest()
{
	ci=getBankBalance()*(Math.pow((1+rate/100), time));
	System.out.println("Compound Interest:"+ci);
}
void withdrawal(double withdrawalAmount)
{
	if(withdrawalAmount<getBankBalance())
	{
		double amount;
		amount=getBankBalance()-withdrawalAmount;
		setBankBalance(amount);
		
	System.out.println("withdrawal Amount:"+withdrawalAmount+" Bank balance left:"+amount);
	}
	else
		System.out.println("Bank Balance less then minimum after withdrawal....so cant be withdrawal");
}
void Display()
{
//	System.out.println("Bank Balance:"+getBankBalance());
}
}
