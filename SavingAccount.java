package ques3;

public class SavingAccount extends Account {
public SavingAccount(String memberName, double accountBalance) {
		super(memberName, accountBalance);
		// TODO Auto-generated constructor stub
	}

int interest=5;
double maxWithdraw=10000;
double minBalance= 3000;


 double getBalance()
 {
	 double afterInterest=this.getAccountBalance()+(this.getAccountBalance()*interest)/100;
	 return afterInterest;
 }
 
 void withdraw(double withdrawAmount)
 {
	 if(withdrawAmount<maxWithdraw)
	 {
		 if((withdrawAmount-this.getAccountBalance())>minBalance)
		 {
			 double j;
			 j=withdrawAmount-this.getAccountBalance();
		 }
		 else
			 System.out.println("Amount Should not be less then minimum balance");
		 
	 }
	 else
		 System.out.println("Amount greater Maximum Withdraw amount");
 }
 
}
