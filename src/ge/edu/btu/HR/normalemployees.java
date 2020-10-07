package ge.edu.btu.HR;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class normalemployees extends employees {
    private static final double pension = 0.8;
    private static final double ndfl = 0.98;

    public normalemployees(){}
    public normalemployees(
            String id, int salary, int benefits,
            int deductions, Date birthdate, int workedhours
    ){
        super(id,salary,benefits,deductions,birthdate,workedhours);
    }

    @Override
    public Map<String, Double> calculateSalary(){
        Map<String,Double> emp_sal = new HashMap<String, Double>();
        emp_sal.put(getId(),(getSalary()*(getWorkedhours()/10)+getBenefits() -
                getDeductions()*ndfl*pension)*ndfl*pension);
        return emp_sal;
    }
}
