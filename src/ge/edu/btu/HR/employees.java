package ge.edu.btu.HR;
import java.util.Date;
import java.util.Map;

public abstract class employees {
    private String id;
    private int salary;
    private int benefits;
    private int deductions;
    private Date birthdate;
    private int workedhours;

    public employees(){}
    public employees(String id, int salary, int benefits, int deductions, Date birthdate, int workedhours){
        this.id = id;
        this.salary = salary;
        this.benefits = benefits;
        this.deductions = deductions;
        this.birthdate = birthdate;
        this.workedhours = workedhours;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public int getBenefits() {
        return benefits;
    }

    public int getDeductions() {
        return deductions;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public int getWorkedhours() {
        return workedhours;
    }

    public abstract Map<String, Double> calculateSalary();
}
