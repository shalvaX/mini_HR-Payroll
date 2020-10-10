package ge.edu.btu.HR;


import ge.edu.btu.exception;

public class headofficeemployees extends employees{
    private static final double pension = 0.8;
    private static final double ndfl = 0.98;

    public headofficeemployees(){}
    public headofficeemployees(
            char id, double salary, double benefits,
            double deductions, String birthdate, double workedhours,String position
    ){
        super(id,salary,benefits,deductions,birthdate,workedhours,position);
    }

    @Override
    public void calculateSalary() throws exception{
        System.out.print("emp id = ");
        System.out.println(getId());
        System.out.println((getSalary()*getWorkedhours()+getBenefits()-getDeductions()/ndfl/pension)/ndfl/pension);
        throw new exception("Error in calculation");

    }
}
