import java.util.Scanner;

public class Main {
    Operations operate = new Operations();
    static boolean ordering = true;

    public Main() {
    }

    public static void menu() {
        System.out.println("***************** Welcome to User Database *****************\n 1.Add User Data\n 2.List User Data\n 3.Update User Data\n 4.Delete User Data\n 5.Exit");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Operations operate = new Operations();

        do {
            menu();
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Add User Data");
                    operate.addEmp();
                    break;
                case 2:
                    System.out.println("List User Data");
                    operate.viewData();
                    break;
                case 3:
                    System.out.println("Update User Data");
                    operate.updateEmp();
                    break;
                case 4:
                    System.out.println("Delete User Data");
                    operate.deleteEmp();
                    break;
                case 5:
                    System.out.println("Thank You");
                    System.exit(0);
                default:
                    System.out.println("Please enter valid choice");
            }
        } while(ordering);

    }
}
