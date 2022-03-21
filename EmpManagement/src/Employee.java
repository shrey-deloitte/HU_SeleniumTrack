


public class Employee {
    private int id;
    private String name;
    private int age;
    private String companyName;
    private String designation;
    private int salary;
    private String address;
    private int phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Employee(int id, java.lang.String name, int age, String companyName, String designation, int salary, String address, int phone) {
    super();
    this.id=id;
    this.name=name;
    this.age=age;
    this.companyName=companyName;
    this.designation=designation;
    this.salary=salary;
    this.phone=phone;
    }
}