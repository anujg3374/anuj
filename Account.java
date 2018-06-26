package bank;

import java.util.Random;

public class Account {
private String customerName;
private String accountNumber;
private String typeOfAccount;
private double bankBalance;
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber() {
	Random rand = new Random();
	String num = 10000 + rand.nextInt(89999) + "";
	accountNumber=num;	
	
}
public String getTypeOfAccount() {
	return typeOfAccount;
}
public void setTypeOfAccount(String typeOfAccount) {
	this.typeOfAccount = typeOfAccount;
}
public double getBankBalance() {
	return bankBalance;
}
public void setBankBalance(double bankBalance) {
	this.bankBalance = bankBalance;
}
void display()
{
	System.out.println(customerName+" "+accountNumber+" "+typeOfAccount+" "+bankBalance);
}
}
