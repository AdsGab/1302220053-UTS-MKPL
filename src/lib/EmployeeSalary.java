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

    public EmployeeSalary(Employee employee, EmployeeFamily family) {
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
	/**
	 * Fungsi untuk menentukan gaji bulanan pegawai berdasarkan grade kepegawaiannya (grade 1: 3.000.000 per bulan, grade 2: 5.000.000 per bulan, grade 3: 7.000.000 per bulan)
	 * Jika pegawai adalah warga negara asing gaji bulanan diperbesar sebanyak 50%
	 */

	public void setMonthlySalary(int grade) {	
		if (grade == 1) {
			monthlySalary = 3000000;
			if (isForeigner) {
				monthlySalary = (int) (3000000 * 1.5);
			}
		}else if (grade == 2) {
			monthlySalary = 5000000;
			if (isForeigner) {
				monthlySalary = (int) (3000000 * 1.5);
			}
		}else if (grade == 3) {
			monthlySalary = 7000000;
			if (isForeigner) {
				monthlySalary = (int) (3000000 * 1.5);
			}
		}
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