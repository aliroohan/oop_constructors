class Employee{
    private String name;
    private double salary;
    private String cnic;

    public void setName(String name){
        this.name = name;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void setCnic(String cnic){
        this.cnic = cnic;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public String getCnic(){
        return cnic;
    }

    public Employee(){
        System.out.println("No-argument constructor called");
    }

    public Employee(String name, String cnic){
        setName(name);
        setCnic(cnic);
    }

    public Employee(String name, double salary, String cnic){
        this(name, cnic);
        setCnic(cnic);
    }
}
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Ali", "12345-1234567-1");
        Employee e3 = new Employee("Ahmed", 50000, "12345-1234567-1");
        
        e1.setName("Usman");
        e1.setSalary(56746);
        e1.setCnic("12345-1234567-1");

        e2.setSalary(36533);

        System.out.println("Name: " + e1.getName());
        System.out.println("Salary: " + e1.getSalary());
        System.out.println("CNIC: " + e1.getCnic());

        System.out.println("Name: " + e2.getName());
        System.out.println("Salary: " + e2.getSalary());
        System.out.println("CNIC: " + e2.getCnic());
        
        System.out.println("Name: " + e3.getName());
        System.out.println("Salary: " + e3.getSalary());
        System.out.println("CNIC: " + e3.getCnic());
    }

}
