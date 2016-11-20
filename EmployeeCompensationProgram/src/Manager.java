
public class Manager extends Employee implements EmployeeCompensation {
double stockDividend;
	
	public Manager(int userId, int userYearHired, double userBaseSalary, double userStockDividend) {
		setId(userId);
		setYearHired(userYearHired);
		setBaseSalary(userBaseSalary);
		setStockDividend(userStockDividend);
	}

	public void setStockDividend(double userStockDividend) {
		stockDividend = userStockDividend;
	}
	
	public double getStockDividend() {
		return stockDividend;
	}
	
	public String EmployeeSummary() {
		return String.format("%d\t%d\t\tManager\t\t%.0f\t\t%.0f\r\n", getId(), getYearHired(), getBaseSalary(), CalculateTotalCompensation());
	}
	
	public String toString() {
		return String.format("This is a manager. ID is %d, hired since %d, and stock dividend is $%.0f.\r\n", 
				getId(), getYearHired(), getStockDividend());
	}

	public double CalculateTotalCompensation() {
	
		setTotalCompensation(getStockDividend() + getBaseSalary()) ;
		return getTotalCompensation();
	}
	
	public String ShowDividend() {
		return String.format("Employee %d is a manager. Dividend is %f!\r\n", getId(), getStockDividend());
	}
	
	public String EndingSummary() {
		return ShowDividend();
	}
}
