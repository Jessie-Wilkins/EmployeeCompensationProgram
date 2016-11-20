
public class JuniorEmployee  extends Employee implements EmployeeCompensation{
	
	double commission;
	
	public JuniorEmployee (int userId, int userYearHired, double userBaseSalary, double userCommission) {
		setId(userId);
		setYearHired(userYearHired);
		setBaseSalary(userBaseSalary);
		setCommission(userCommission);
	}
	
	public void setCommission(double userCommission) {
		commission = userCommission;
	}

	public double getCommission() {
		return commission;
	}
	
	public String EmployeeSummary() {
		return String.format("%d\t%d\t\tJunior\t\t%.0f\t\t%.0f\r\n", getId(), getYearHired(), getBaseSalary(), CalculateTotalCompensation());
	}
	
	public String toString() {
		return String.format("This is a junior employee. ID is %d, hired since %d, and commission is $%.0f.\r\n", 
				getId(), getYearHired(), getCommission());
	}
	
	public double CalculateTotalCompensation() {
		setTotalCompensation(getCommission() + getBaseSalary());
		return getTotalCompensation();
	}
	
}
