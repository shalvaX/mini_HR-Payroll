package ge.edu.btu;

import ge.edu.btu.Events.events;
import ge.edu.btu.HR.employees;
import ge.edu.btu.HR.headofficeemployees;
import ge.edu.btu.HR.normalemployees;
import ge.edu.btu.Office.Office;

public class Runner {
    private static employees Employee1 = new normalemployees ('1',800,50, 100,"10.25.2000",40.5,"cleaner");
    private static employees Employee2 = new headofficeemployees ('2',5500,50, 100,"10.25.2000",46.5,"manager");
    private static employees Employee3 = new normalemployees ('3',3500,50, 100,"10.25.2000",40.5,"");

    private static Office myOffice = new Office("Smol office");

    private static events Event = new events(myOffice);

    public static void main(String[] args)  {
        add_employees();
        calc_salary();
        evs();
        calc_salary();

    }
    private static void evs()  {
        Event.add_position("tester", '1');
        Event.raise_salary('1');
        Event.less_salary('2');
        Event.remove_employee('3');
    }

    private static void add_employees() {
        myOffice.addEmployee(Employee1);
        myOffice.addEmployee(Employee2);
        myOffice.addEmployee(Employee3);
    }
    private static void calc_salary(){
        try {
            Employee1.calculateSalary();
        } catch (exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        try {
            Employee2.calculateSalary();
        } catch (exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        try {
            Employee3.calculateSalary();
        } catch (exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}