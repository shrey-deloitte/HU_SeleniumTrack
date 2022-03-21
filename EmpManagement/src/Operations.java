

import java.util.HashSet;
import java.util.Iterator;

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

    public void showData() {
        Iterator var1 = this.empset.iterator();

        while(var1.hasNext()) {
            Employee emp = (Employee)var1.next();
            System.out.println(emp);
        }

    }
}
