package ques3;

import java.util.Random;

public class Account {
private String memberName;
private String accountNumber;
private double accountBalance;

public Account(String memberName,double accountBalance)
{
	this.memberName=memberName;
	this.accountBalance=accountBalance;
	Random rand = new Random();
	String num = 10000 + rand.nextInt(89999) + "";
	accountNumber=num;		
}
public String getMemberName() {
	return memberName;
}
public void setMemberName(String memberName) {
	this.memberName = memberName;
}
public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
public double getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(double accountBalance) {
	this.accountBalance = accountBalance;
}
public void deposit()
{
	
}

}
