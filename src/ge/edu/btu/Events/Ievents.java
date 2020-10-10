package ge.edu.btu.Events;
import ge.edu.btu.HR.employees;
import ge.edu.btu.Office.Office;
import ge.edu.btu.exception;

public interface Ievents  {

    void remove_employee(char id);

    void raise_salary(char id);

    void less_salary(char id);

    void add_position(String position, char id);

    void remove_position(char id);

}
