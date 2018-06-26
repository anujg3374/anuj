package bank;

import java.util.Scanner;

public class MainBank {

	private static Scanner sc;

	public static void main(String[] args) {
		 String customerName;
		 String typeOfAccount;
		 double bankBalance;
	sc = new Scanner(System.in);
	System.out.println("Enter Customer Name");
	customerName=sc.next();
	System.out.println("Enter type of account s for savings and c for current");
	typeOfAccount=sc.next();
	System.out.println("Enter intial Bank Balance to be deposited");
	bankBalance=sc.nextDouble();
	double withdrawalAmount;
	switch(typeOfAccount)
	{
	case "s":
		SavingAccount s=new SavingAccount();
		System.out.println("Enter withdrawal amount");
		withdrawalAmount=sc.nextDouble();
		s.withdrawal(withdrawalAmount);
		s.compoundInterest();
		s.Display();
		break;
	case "c":
		CurrentAccount c=new CurrentAccount();
		System.out.println("Enter withdrawal amount");
	    withdrawalAmount=sc.nextDouble();
		c.withdrawal(withdrawalAmount);
		c.display();
		break;
	default :
			System.out.println("Wronng Choice entered");
	}
	
	}

}
