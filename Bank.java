package ques3;
import java.util.*;
public class Bank {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String memberName;
System.out.println("Enter Account Holder Name");
memberName=sc.next();
Double intialBalance;
System.out.println("Enter Intial balance");
intialBalance=sc.nextDouble();
Account as=new SavingAccount(memberName,intialBalance);
Account ac=new CurrentAccount(memberName,intialBalance);


System.out.println("type of account you wanna open");
System.out.println("1-Saving Account");
System.out.println("2-Current Account");
System.out.println("Enter choice");
int type=sc.nextInt();
switch(type)
{
case 1:
	
	break;
case 2:
	break;
default:
	System.out.println("Wrong Choice Entered!!!!");
}
	}

}
