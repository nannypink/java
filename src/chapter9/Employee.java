package chapter9;

public class Employee extends Person{
    private String employeeId;
    private String title;
    public Employee(){
        super("Tina");
        // must be first line
        // this calls the constructor with param from the super class this one inherits from
        // calling super without args calls the default constructor of the base class
        System.out.println("In Employee default constructor");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
