package lib;

public class TaxFunction {
	public static int calculateTax(EmployeeSalary salary, EmployeeFamily family) {
		int numberOfChildren = checkNumberOfChildren(family);
		int tax = 0;
		validateWorkingMonths(salary);
		tax = calculateBasedOnMarriage(salary,family,numberOfChildren);
		if (tax < 0) {
			return 0;
		}else {
			return tax;
		}
			 
	}
	public static void validateWorkingMonths(EmployeeSalary salary){
		if (salary.getNumberOfMonthWorking() > 12) {
			System.err.println("More than 12 month working per year");
		}
	}
	public static int checkNumberOfChildren(EmployeeFamily family){
		if (family.getNumberOfChildren() >3){
			return 3;
		}else{
			return family.getNumberOfChildren();
		}
	}
	public static int calculateBasedOnMarriage(EmployeeSalary salary,EmployeeFamily family,int numberOfChildren){
		if (family.getIsMarried()) {
			return (int) Math.round(0.05 * (((salary.getMonthlySalary() + salary.getOtherMonthlyIncome()) * salary.getNumberOfMonthWorking()) - salary.getDeductible() - (54000000 + 4500000 + (numberOfChildren * 1500000))));
		}else {
			return (int) Math.round(0.05 * (((salary.getMonthlySalary() + salary.getOtherMonthlyIncome()) * salary.getNumberOfMonthWorking()) - salary.getDeductible() - 54000000));
		}
		
	}
	
}
