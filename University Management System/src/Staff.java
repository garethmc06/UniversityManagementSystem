public class Staff extends Person{
    String department;
    double salary;

    public Staff(String ID, String name, String email, String department, double salary) {
        super(name, ID, email);
        this.department = department;
        this.salary = salary;

    }

    // Getters and Setters
    public String getDepartment() {
        return department;
    }

    public double getSalary(){
        return salary;
    }

    public void setDepartment(String newDepartment) {
        this.department = newDepartment;
    }

    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }
}
