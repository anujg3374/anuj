package ques1;

class CommisionEmployee extends Employee {
	double percentagerate;
	double sales;
	double increaseRate;
	
	void weeklySales(double sales)
	{
		this.sales=sales;
	}
	@Override
	void setSalary(double percentagerate) {
		this.percentagerate=percentagerate;
	}

	@Override
	double getSalary() {
		
		return sales*percentagerate/100;
	}
	@Override
	void weeks(double noOfWeeks) {
		// TODO Auto-generated method stub
		
	}
	@Override
	void hours(double noOfHours) {
		// TODO Auto-generated method stub
		
	}

	double incrementSalaryRate(double increaseRate) {
		return increaseRate+sales;
	}

}
