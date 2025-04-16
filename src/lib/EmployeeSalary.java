package lib;

import java.time.LocalDate;


public class EmployeeSalary {
	private int monthlySalary;
	private int otherMonthlyIncome;
	private int annualDeductible;
	private int yearJoined;
	private int monthJoined;
	private int dayJoined;
	private int monthWorkingInYear;
	private boolean isForeigner;
	private Employee employee;
	private EmployeeFamily family;

    public EmployeeSalary(Employee employee, EmployeeFamily family, int yearJoined, int monthJoined, int dayJoined) {
		this.dayJoined = dayJoined;
		this.monthJoined = monthJoined;
		this.yearJoined = yearJoined;
		this.employee = employee;
		this.family = family;
	}
	
	public int getMonthlySalary(){
		return  this.monthlySalary;
	}
	public int getNumberOfMonthWorking(){
		return  this.monthWorkingInYear;
	}
	public int getOtherMonthlyIncome(){
		return  this.otherMonthlyIncome;
	}
	public  int getDeductible(){
		return this.annualDeductible;
	}


	public void setMonthlySalary(Paygrade grade) {	
		this.monthlySalary = grade.calculateSalary(isForeigner);
	}
	
	public void setAnnualDeductible(int deductible) {	
		this.annualDeductible = deductible;
	}
	
	public void setAdditionalIncome(int income) {	
		this.otherMonthlyIncome = income;
	}
	
	
	public int getAnnualIncomeTax() {
		
		//Menghitung berapa lama pegawai bekerja dalam setahun ini, jika pegawai sudah bekerja dari tahun sebelumnya maka otomatis dianggap 12 bulan.
		LocalDate date = LocalDate.now();
		
		if (date.getYear() == yearJoined) {
			monthWorkingInYear = date.getMonthValue() - monthJoined;
		}else {
			monthWorkingInYear = 12;
		}
		return TaxFunction.calculateTax(this,family);
	}
}