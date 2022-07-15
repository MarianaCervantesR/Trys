import java.util.*;

public class Employee {
    public String Name;
    public int Age;
    public String Address;
    public Employee(String Name,int Age,String Adress)
    {
        this.Name=Name;
        this.Age=Age;
        this.Address=Adress;
    }


    public void setAddress(String address) {
        Address = address;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public int getAge() {
        return Age;
    }

    public String toString()
    {
        return "Name: " + Name + " Age: " +  Age + " Address: " + Address;
    }
}
class directory
{
    public static void main(String[] args)
    {
        Employee employee = new Employee("Mariana",25,"Mexico");
        employee.setName("Mariana Cervantes");
        employee.setAge(26);
        employee.setAddress("Sinaloa");
        System.out.println(employee);

        List <Employee> employees = new ArrayList<>();
        employees.add(new Employee("Mariana",25,"Mexico"));
        employees.add(new Employee("Carlos",21,"Mexico"));
        employees.add(new Employee("Ileanna",21,"Mexico"));
        employees.add(new Employee("Ximena",25,"USA"));
        employees.add(new Employee("Juan",23,"USA"));
        employees.add(new Employee("Maria",27,"Mexico"));
        employees.add(new Employee("John",21,"USA"));
        employees.add(new Employee("Henry",30,"Mexico"));
        employees.add(new Employee("Pam",20,"USA"));
        employees.add(new Employee("Paul",25,"Mexico"));
        System.out.println("Employee List: " + employees);

        HashMap <String,Employee> emp = new HashMap();
        emp.put("E1",new Employee("Mariana",25,"Mexico"));
        emp.put("E2",new Employee("Carlos",21,"Mexico"));
        emp.put("E3",new Employee("Ileanna",21,"Mexico"));
        emp.put("E4",new Employee("Ximena",25,"USA"));
        emp.put("E5",new Employee("Juan",23,"USA"));
        emp.put("E6",new Employee("Maria",27,"Mexico"));
        emp.put("E7",new Employee("John",21,"USA"));
        emp.put("E8",new Employee("Henry",30,"Mexico"));
        emp.put("E9",new Employee("Pam",20,"USA"));
        emp.put("E10",new Employee("Paul",25,"Mexico"));
        System.out.println(emp);

    }
}
