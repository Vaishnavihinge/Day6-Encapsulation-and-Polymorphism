//Real life Encapsulation Example - Employee
class Employee {

    private int empId;
    private String empName;
    private double salary;

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be Zero");
        }
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getSalary() {
        return salary;
    }
}

public class Encapsulation {
    public static void main(String args[]) {

        Employee e1 = new Employee();

        e1.setEmpId(1);
        e1.setEmpName("ABC");
        e1.setSalary(500000);

        System.out.println("Employee ID : " + e1.getEmpId());
        System.out.println("Employee Name : " + e1.getEmpName());
        System.out.println("Emoloyee Salary : " + e1.getSalary());

    }
}
