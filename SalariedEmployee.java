package ques1;

class SalariedEmployee extends Employee {
double weeklyRate;
double noOfWeeks;
double increaseRate;

void weeks(double noOfWeeks)
{
	this.noOfWeeks=noOfWeeks;
}
	@Override
	void setSalary(double weeklyRate) {
		this.weeklyRate=weeklyRate;
	}

	@Override
	double getSalary() {
		
		return (noOfWeeks*weeklyRate);
	}
	@Override
	void hours(double noOfHours) {
		// TODO Auto-generated method stub
		
	}
	@Override
	void weeklySales(double sales) {
		// TODO Auto-generated method stub
		
	}
	@Override
	double incrementSalaryRate(double increaseRate) {
		return increaseRate+weeklyRate;
	}

}
