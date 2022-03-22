import java.util.Scanner;
import java.util.regex.*;

public class LoginValidation {

        public static boolean isAllPresent(String password) {


            String regex = "^(?=.*[a-z])(?=." + "*[A-Z])(?=.*\\d)" + "(?=.*[@#&%*! ?]).+$";
            Pattern p = Pattern.compile(regex);

            if (password == null) {
                System.out.println("No");
                return false;
            }

            Matcher m = p.matcher(password);

            if (m.matches() && password.length()>5 && password.length()<10) {
                //System.out.println("Valid Password");
                return true;

            } else {
                //System.out.println("Invalid Password");
                return false;
            }
        }


            Scanner scan = new Scanner(System.in);


}



