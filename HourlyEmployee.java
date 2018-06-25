package ques1;

class HourlyEmployee extends Employee {
	double hourlyRate;
	double noOfHours;
	double increaseRate;
	@Override
	void setSalary(double hourlyRate) {
		this.hourlyRate=hourlyRate;
	}
	void hours(double noOfHours)
	{
		this.noOfHours=noOfHours;
	}
	@Override
	double getSalary() {

		return (noOfHours*hourlyRate);
	}
	@Override
	void weeks(double noOfWeeks) {
		// TODO Auto-generated method stub
		
	}
	@Override
	void weeklySales(double sales) {
		// TODO Auto-generated method stub
		
	}

	double incrementSalaryRate(double increaseRate) {
		return increaseRate+hourlyRate;
	}
	

}
