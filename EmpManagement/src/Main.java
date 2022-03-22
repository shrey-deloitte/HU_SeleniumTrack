import java.util.Scanner;

public class Main {
    Operations operate = new Operations();
    static boolean ordering = true;


    public static void menu() {
        System.out.println("***************** Welcome to User Database *****************\n 1.Add User Data\n 2.List User Data\n 3.Update User Data\n 4.Delete User Data\n 5.Exit");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Operations operate = new Operations();
        HrLogin login = new HrLogin();
        login.hrLoginMain();


    }

}



