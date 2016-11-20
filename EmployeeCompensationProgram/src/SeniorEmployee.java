
public class SeniorEmployee extends Employee implements EmployeeCompensation {
	double annualBonus;

	public SeniorEmployee(int userId, int userYearHired, double userBaseSalary, double userAnnualBonus) {
		setId(userId);
		setYearHired(userYearHired);
		setBaseSalary(userBaseSalary);
		setAnnualBonus(userAnnualBonus);
	}

	public void setAnnualBonus(double userAnnualBonus) {
		annualBonus = userAnnualBonus;
	}

	public double getAnnualBonus() {
		return annualBonus;
	}
	
	public String EmployeeSummary() {
		return String.format("%d\t%d\t\tSenior\t\t%.0f\t\t%.0f\r\n", getId(), getYearHired(), getBaseSalary(), CalculateTotalCompensation());
	}

	public String toString() {
		return String.format("This is a senior employee. ID is %d, hired since %d, and annual bonus is $%.0f.\r\n", 
				getId(), getYearHired(), getAnnualBonus());
	}

	public double CalculateTotalCompensation() {
		setTotalCompensation(getAnnualBonus() + getBaseSalary());
		return getTotalCompensation();
	}
}
