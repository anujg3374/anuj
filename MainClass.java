package ques1;

public class MainClass {

	public static void main(String[] args) {
		Employee se=new SalariedEmployee();
		Employee he=new HourlyEmployee();
		Employee ce=new CommisionEmployee();
		se.setSalary(7.5);
		se.weeks(3.5);
		System.out.println("Weekly Salary:"+se.getSalary());
		System.out.println("New Weekly Rate:"+se.incrementSalaryRate(2.5));
		he.setSalary(7.5);
		he.hours(48);
		System.out.println("Hourly Salary:"+he.getSalary());
		System.out.println("New Hourly Rate:"+he.incrementSalaryRate(3.5));
		ce.setSalary(15);
		ce.weeklySales(33.5);
		System.out.println("commision Salary:"+ce.getSalary());
		System.out.println("New Weekly sales:"+ce.incrementSalaryRate(1.5));
		
	}

}
