package lib;


import java.util.LinkedList;
import java.util.List;

public class EmployeeFamily{

    private String spouseName;
    private String spouseIdNumber;
    private boolean isMarried;
    private List<String> childNames;
    private List<String> childIdNumbers;

    private Employee employee;
    

    public EmployeeFamily(Employee employee) {
        this.employee = employee;
        childNames  = new LinkedList<String>();
        childIdNumbers  = new LinkedList<String>();
    }
    
    public int getNumberOfChildren(){
        return childIdNumbers.size();
    }
    
    public boolean getIsMarried(){
        return this.isMarried;
    }

    public void setSpouse(String spouseName, String spouseIdNumber) {
        this.spouseName = spouseName;
        this.spouseIdNumber = employee.getIdNumber();
        this.isMarried = true;
    }

    public void addChild(String childName, String childIdNumber) {
        childNames.add(childName);
        childIdNumbers.add(childIdNumber);
    }
}
