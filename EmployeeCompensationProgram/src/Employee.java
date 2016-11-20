
public class Employee {
	protected int id;
	protected int yearHired;
	protected double baseSalary;
	protected double compensation;
	protected double totalCompensation;
	protected String employeeSummary;
	
	public Employee() {
		id = 0;
		yearHired = 0;
		baseSalary = 0;
		totalCompensation = 0;
	}
	
	public void setId(int userId) {
		id = userId;
	}

	public void setYearHired(int userYearHired) {
		yearHired = userYearHired;
	}
	
	public void setBaseSalary(double userBaseSalary) {
		baseSalary = userBaseSalary;
	}
	
	public void setCompensation(double userCompensation) {
		compensation = userCompensation;
	}

	public void setTotalCompensation(double userTotalCompensation) {
		totalCompensation = userTotalCompensation;
	}

	public int getId() {
		return id;
	}

	public int getYearHired() {
		return yearHired;
	}

	public double getBaseSalary() {
		return baseSalary;
	}
	
	public double getCompensation() {
		return compensation;
	}

	public double getTotalCompensation() {
		return totalCompensation;
	}
	
	public String EmployeeSummary() {
		return getId() +"\t"+getYearHired()+"\t"+getBaseSalary()+"\t"+getCompensation();
	}

	public String toString() {
		return id +" "+ yearHired+" "+ baseSalary+" "+ totalCompensation;
	}
	
	public String EndingSummary() {
		
		return "null";
	}
}