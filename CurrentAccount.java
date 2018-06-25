package ques3;

public class CurrentAccount extends Account {
public CurrentAccount(String memberName, double accountBalance) {
		super(memberName, accountBalance);
		// TODO Auto-generated constructor stub
	}

int tradeLicenseNumber;

double getBalance()
{
	return this.getAccountBalance();
}

void withdraw(double withdrawAmount)
{
	
		 if(withdrawAmount<this.getAccountBalance())
		 {
			 double j;
			 j=withdrawAmount-this.getAccountBalance();
		 }
		 else
			 System.out.println(" Amount greater then account balance");
	}
}
