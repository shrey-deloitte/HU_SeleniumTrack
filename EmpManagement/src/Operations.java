

import java.util.HashSet;
import java.util.Scanner;


public class Operations {
    HashSet<Employee> empset = new HashSet();

    int id;
    String name;
    int age;
    String companyName;
    String designation;
    int salary;
    String address;
    String phone;

    boolean found = false;
    static boolean ordering = true;

    Scanner scan = new Scanner(System.in);

    //test
    public void showData() {
        for (Employee emp : empset) {
            System.out.println(emp);
            System.out.println("\n ");
        }

    }

    //view emp data
    public void viewData() {

        System.out.println("Enter the Employee ID");
        id = scan.nextInt();
        for (Employee emp : empset) {
            if (emp.getId() == id) {
                System.out.println(emp);
                found = true;
            }

        }
        if (!found) {
            System.out.println("Invalid ID!\n");
        } else {
            System.out.println("employee found");
        }

    }

    public void updateEmp() {
        System.out.print("Enter the Employee ID: ");
        id = scan.nextInt();
        boolean validAge = false;

        for (Employee emp : empset) {
            if (emp.getId() == id) {
                System.out.println("Enter details: ");

                System.out.print("Enter Updated Name: ");
                name = scan.next();
                emp.setName(name);


                System.out.print("Enter Updated age: ");
                age = scan.nextInt();

                //age validation
                if (age > 18 && age < 100) {

                    emp.setAge(age);

                } else {
                    System.out.println("Invalid Age");

                }
            }


            System.out.print("Enter Updated Company Name: ");
            companyName = scan.next();
            emp.setCompanyName(companyName);


            System.out.print("Enter Updated Designation: ");
            designation = scan.next();
            emp.setDesignation(designation);


            //salary validation
            System.out.println("Enter Updated salary: ");
            salary = scan.nextInt();
            if (salary != 0) {
                emp.setAge(salary);

            } else {
                System.out.println("Invalid Salary");
            }


            System.out.println("Enter Updated address: ");
            address = scan.next();
            emp.setAddress(address);


            System.out.println("Enter Updated phone: ");
            phone = scan.next();
            emp.setPhone(phone);


            System.out.println("Updated all the details ");

            System.out.println(emp);
            found = true;

        }

        if(!found){
            System.out.println("Employee not present");
        }
    }


    public  void  deleteEmp(){
        System.out.print("Enter employee ID: ");
        id=scan.nextInt();
        boolean found=false;
        Employee empdelete=null;
        for(Employee emp:empset){
            if(emp.getId()==id){
                empdelete=emp;
                found=true;
            }

        }
        if(!found){
            System.out.println("Invalid ID");
        }

        else{
            empset.remove(empdelete);
            System.out.println("Employee deleted successfully");
            System.out.println("Modified Data: ");
            for (Employee emp:empset) {
                System.out.println(emp);
            }
        }
    }

    public void addEmp(){
        boolean valid=false;
        id=empset.size()+1;
        System.out.println(" Employee ID: "+id);
        System.out.println("Enter Employee name: ");
        name= scan.next();
        System.out.println("Enter Employee Age: ");

        while(!valid){
            age=scan.nextInt();
            if(age>18 && age <100){
                valid=true;

            }
            else {
                System.out.println("please enter a valid age: ");
            }
        }
        System.out.println("Enter Company Name: ");
        companyName=scan.next();
        System.out.println("Enter employee Designation: ");
        designation= scan.next();
        System.out.println("Enter employee salary");

        valid=false;
        while (!valid){
            salary= scan.nextInt();
            if(salary==0){
                System.out.println("Please enter valid  Salary");

            }
            else {
                valid=true;

            }
        }

        System.out.println("Enter employee address: ");
        address=scan.next();
        System.out.println("Enter employee phone no");

        valid=false;
        while (!valid){
            phone= scan.next();
            if(phone.length()!=10){
                System.out.println("Please enter valid  Phone no.");

            }
            else {
                valid=true;

            }
        }

        Employee emp=new Employee(id,name,age,companyName,designation,salary,address,phone);

        empset.add(emp);

        System.out.println(emp);
        System.out.println("Employee added successfully! ");

    }



}



