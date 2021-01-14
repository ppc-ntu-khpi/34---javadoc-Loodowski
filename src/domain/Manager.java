package domain;

/**
 * subclass of employee that represents an manager
 * @see Employee
 * @author Kirukato
 */
public class Manager extends Employee {

    /**
     * constructor
     * @param employees employees  
     * @param name of manager
     * @param jobTitle job title
     * @param level level of manager
     * @param dept dept of manager
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }
    
    /**
     * Basic information about employees
     * Method that override method toString()
     * @return string
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    /**
     * constructor
     * @param employees employees
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    /**
     * default constructor
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;

    /**
     * Method that returns list of employees
     * @return string of employees 
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Method that sets employees list
     * @param employees employees 
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Method by which you can get list of employees
     * @return list of employees
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
