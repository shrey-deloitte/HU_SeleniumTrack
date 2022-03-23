
public class Employee {
    private int id;
    private String name;
    private int age;
    private String companyName;
    private String designation;
    private int salary;
    private String address;
    private  String phone;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", companyName='" + companyName + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                '}';
    }



    public Employee(int id, String name, int age, String companyName, String designation, int salary, String address,  String phone) {
    //super();
    this.id=id;
    this.name=name;
    this.age=age;
    this.companyName=companyName;
    this.designation=designation;
    this.salary=salary;
    this.address=address;
    this.phone=phone;
    }
}