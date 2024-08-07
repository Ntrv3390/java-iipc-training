package employee;
public class Employee {
    private String name;
    private String basic_salary;
    private String department;
    private String email_id;

    @Override
    public String toString() {
        return "Name: " + this.name + "; Salary: " + this.basic_salary + "; Department: " + this.department + "; Email Id: " + this.email_id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBasicSalary() {
        return basic_salary;
    }
    public void setBasicSalary(String basic_salary) {
        this.basic_salary = basic_salary;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getEmailId() {
        return email_id;
    }
    public void setEmailId(String email_id) {
        this.email_id = email_id;
    }
    
}