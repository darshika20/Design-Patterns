import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private String dept;
    private int salary;
    private List<Employee> subOrdinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subOrdinates = new ArrayList<>();
    }

    public void addSubOrdinates(Employee employee) {
        subOrdinates.add(employee);
    }

    public void removeSubOrdinates(Employee employee) {
        subOrdinates.remove(employee);
    }

    public List<Employee> getSubOrdinates() {
        return this.subOrdinates;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
