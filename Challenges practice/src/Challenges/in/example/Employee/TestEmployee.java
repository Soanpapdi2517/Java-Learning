package Challenges.in.example.Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee myEmp = new Employee("Sonu Yadav", 19, 15000);
        System.out.println(myEmp.getName());
        System.out.println(myEmp.getAge());
        System.out.println(myEmp.getSalary());
        myEmp.setName("Sonu y");
        myEmp.setAge(20);
        myEmp.setSalary(16000);
        System.out.println(myEmp.getEmployeeDetails());
    }
}
