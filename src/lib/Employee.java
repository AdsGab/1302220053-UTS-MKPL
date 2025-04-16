package lib;

public class Employee{

	private String employeeId;
	private String firstName;
	private String lastName;
	private String idNumber;
	private String address;
	
	private boolean gender; //true = Laki-laki, false = Perempuan
	private EmployeeFamily family;
	
	public Employee(String employeeId, String firstName, String lastName, String idNumber, String address, boolean isForeigner, boolean gender, EmployeeFamily family) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.address = address;
		this.gender = gender;
		this.family = family;
	}

	public String getIdNumber(){
		return this.idNumber;
	}
		
}
