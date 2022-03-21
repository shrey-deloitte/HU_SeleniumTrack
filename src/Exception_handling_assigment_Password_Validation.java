import java.util.Scanner;
import java.util.regex.*;


public class Exception_handling_assigment_Password_Validation {

    public static void isAllPresent(String password) {


        String regex = "^(?=.*[a-z])(?=." + "*[A-Z])(?=.*\\d)" + "(?=.*[@#&%*! ?]).+$";
        Pattern p = Pattern.compile(regex);

        if (password == null) {
            System.out.println("No");
            return;
        }

        Matcher m = p.matcher(password);

        if (m.matches()) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }


    /* public void Password_validation(String password){
         try{
             if(password.length()<5||password.length()>10){
                 System.out.println("invalid password");
             }

         }

         catch(Exception e){
             System.out.println("test");

         }
     }
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the password");

        String password = scan.nextLine();
        try {
            isAllPresent(password);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
