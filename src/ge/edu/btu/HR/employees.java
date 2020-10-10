package ge.edu.btu.HR;


import ge.edu.btu.exception;

public abstract class employees {
    private char id;
    private double salary;
    private double benefits;
    private double deductions;
    private String birthdate;
    private double workedhours;
    private String position;

    public employees(){}
    public employees(char id, double salary, double benefits, double deductions, String birthdate, double workedhours, String position){
        this.id = id;
        this.salary = salary;
        this.benefits = benefits;
        this.deductions = deductions;
        this.birthdate = birthdate;
        this.workedhours = workedhours;
        this.position = position;
    }

    public char getId() {
        return id;
    }

    public void setId(char id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBenefits() {
        return benefits;
    }

    public void setBenefits(double benefits) {
        this.benefits = benefits;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public double getWorkedhours() {
        return workedhours;
    }

    public void setWorkedhours(double workedhours) {
        this.workedhours = workedhours;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public abstract void calculateSalary() throws exception;
}
