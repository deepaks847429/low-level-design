import java.util.*;

public static void  main (String[] args){
  Employee obj1 = new Employee();
  obj1.setname("John Doe");
  obj1.setsalary(50000);
  System.out.println("Employee Name: " + obj1.getname());
  System.out.println("Employee Salary: " + obj1.getsalary());

  Employee obj2 = new Employee();
  obj2.setname("Jane Smith");
  obj2.setsalary(60000);
  System.out.println("Employee Name: " + obj2.getname());   
  System.out.println("Employee Salary: " + obj2.getsalary());
}