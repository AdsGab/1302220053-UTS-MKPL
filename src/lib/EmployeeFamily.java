package lib;


import java.util.LinkedList;
import java.util.List;

public class EmployeeFamily extends Employee{

    private String spouseName;
    private String spouseIdNumber;

    private List<String> childNames;
    private List<String> childIdNumbers;

    

    public EmployeeFamily(String employeeId, String firstName, String lastName, String idNumber, String address, int yearJoined, int monthJoined, int dayJoined, boolean isForeigner, boolean gender) {
        super(employeeId, firstName, lastName, idNumber, address, isForeigner, gender);
        childNames  = new LinkedList<String>();
        childIdNumbers  = new LinkedList<String>();
    }

    public void setSpouse(String spouseName, String spouseIdNumber) {
        this.spouseName = spouseName;
        this.spouseIdNumber = super.getIdNumber();
    }

    public void addChild(String childName, String childIdNumber) {
        childNames.add(childName);
        childIdNumbers.add(childIdNumber);
    }
}
