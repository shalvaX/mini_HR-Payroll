package ge.edu.btu.Bonuses;
import ge.edu.btu.HR.employees;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Bonus extends employees {
    private static final double pension = 0.8;
    private static final double ndfl = 0.98;

    public Bonus(){}
    public Bonus(String id, int salary, int benefits,
                 int deductions, Date birthdate, int workedhours){
        super(id,salary,benefits,deductions,birthdate,workedhours);
    }
    @Override
    public Map<String,Double> calculateSalary(){
        Date today = new Date();
        Map<String,Double> emp_sal = new HashMap<String, Double>();
        if (getBirthdate() == today){
            emp_sal.put(getId(),(getSalary()*(getWorkedhours()/10)+getBenefits() -
                    getDeductions()/ndfl/pension)/ndfl/pension+50);
        }
        return emp_sal;
    }
}
