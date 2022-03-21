

import java.util.HashSet;
import java.util.Scanner;


public class Operations {
    HashSet<Employee> empset = new HashSet();
    Employee emp1 = new Employee(101, "aman", 26, "Hashedin", "SDET", 50000, "101 street 1-sec4", 1010101010);
    Employee emp2 = new Employee(102, "yash", 28, "Hashedin", "SDET", 50000, "102 street 1-sec4", 313131313);
    Employee emp3 = new Employee(103, "rahul", 23, "Hashedin", "SDET", 50000, "103 street 1-sec4", 2121212121);

    public Operations() {
        this.empset.add(this.emp1);
        this.empset.add(this.emp2);
        this.empset.add(this.emp3);
    }
     int id;
     String name;
     int age;
     String companyName;
     String designation;
     int salary;
     String address;
     int phone;

    boolean found=false;

    Scanner scan=new Scanner(System.in);

    public void showData() {
        for (Employee emp:empset){
            System.out.println(emp);
            System.out.println("\n ");
        }

    }

    //view emp data
    public void viewData(){

        System.out.println("Enter the Employee ID");
        id=scan.nextInt();
        for(Employee emp:empset){
            if(emp.getId()==id){
                System.out.println(emp);
                found=true;
            }
            if(!found) {
                System.out.println("Invalid ID!");
            }

        }

    }
}
