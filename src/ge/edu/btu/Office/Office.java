package ge.edu.btu.Office;
import ge.edu.btu.HR.employees;

public class Office {
    private String name;
    private employees[] emps = new employees[100];
    private int employees_amount = 0;

    public Office(){}
    public Office(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addEmployee(employees employee){
        emps[employees_amount] = employee;
        employees_amount++;
    }

    public int getEmployees_amount() {
        return employees_amount;
    }

    public employees[] getEmps() {
        return emps;
    }
}
