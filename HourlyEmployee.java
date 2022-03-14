
package HourlyEmployee;

import d.SalariedEmployee;

public class HourlyEmployee extends SalariedEmployee{
	private double  hourlyRate;
	private int numberOfHours;
	
	public HourlyEmployee(int id, String name,double  hourlyRate,
	 int numberOfHours ) {
		super();
		this.hourlyRate=hourlyRate;
		this.numberOfHours=numberOfHours;
	}

	public String toString() {
		return super.toString()+
				"HourlyEmployee [hourlyRate=" + hourlyRate + ", "
				+ "numberOfHours=" + numberOfHours + "]";
	}

	public double getPayment() {
		return hourlyRate*numberOfHours;
	}
	
	
	
}


