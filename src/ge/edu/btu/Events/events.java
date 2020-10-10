package ge.edu.btu.Events;
import ge.edu.btu.Office.Office;
import ge.edu.btu.exception;


public class events implements Ievents {
    private String position;
    private Office office;
    private char id;

    public events(){}
    public events(Office office){
        this.office = office;
    }

    public String getPosition() {
        return position;
    }


    public void setPosition(String position) {
        this.position = position;
    }


    @Override
    public void add_position(String position,char id)  {
        for (int i=0; i != office.getEmployees_amount(); i++){
            if (office.getEmps()[i].getId() == id){
                office.getEmps()[i].setPosition(position);
            }
        }
    }

    @Override
    public void less_salary(char id) {
        for (int i=0; i != office.getEmployees_amount(); i++){
            if (office.getEmps()[i].getId() == id){
                office.getEmps()[i].setSalary(office.getEmps()[i].getSalary() - office.getEmps()[i].getSalary() * 0.25);
            }
        }
    }

    @Override
    public void raise_salary(char id) {
        for (int i=0; i != office.getEmployees_amount(); i++){
            if (office.getEmps()[i].getId() == id){
                office.getEmps()[i].setSalary(office.getEmps()[i].getSalary() + office.getEmps()[i].getSalary() * 0.25);
            }
        }
    }

    @Override
    public void remove_employee(char id) {
        for (int i=0; i != office.getEmployees_amount(); i++){
            if (office.getEmps()[i].getId() == id){
                office.getEmps()[i] = null;
            }

        }
    }

    @Override
    public void remove_position(char id) {
        for (int i=0; i != office.getEmployees_amount(); i++){
            if (office.getEmps()[i].getId() == id){
                office.getEmps()[i].setPosition("");
            }
        }
    }
}
