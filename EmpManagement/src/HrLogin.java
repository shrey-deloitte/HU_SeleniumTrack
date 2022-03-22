import java.net.MulticastSocket;
import java.util.HashSet;
import java.util.Scanner;

public class HrLogin {
    HashSet<Hr> idp  = new HashSet();
    Scanner scan=new Scanner(System.in);
    String usrname;
    String password;
    String repassword;
    Boolean ordering=true;
    boolean found=false;

    public void login(){
        System.out.println("Enter Username for Login: ");
        usrname=scan.next();

        for (Hr username:idp){

            if(username.getUsername().equals(usrname)){
                System.out.println("Enter Password: ");
                password=scan.next();

                LoginValidation log=new LoginValidation();
                log.isAllPresent(password);
                if(username.getPassword().equals(password)){
                    found=true;
                    UserDashboard userDashboard = new UserDashboard();
                    userDashboard.dashboard();
                }


            }
            if(!found){
                System.out.println("Invalid Username!!");
            }
        }




    }

    public void register(){

        boolean userNameAvalBool = false;
        while (!userNameAvalBool) {
            System.out.println("Enter Username: ");
            usrname = scan.next();
            userNameAvalBool = checkUserNameAvailablity(usrname);

            if (!userNameAvalBool) {
                System.out.println("Username already exists. Try another username");
            }
        }

        LoginValidation log=new LoginValidation();
        boolean logInBool = false;


        while ( !logInBool){
            System.out.println("Enter Password: ");
            password=scan.next();
            System.out.println("Enter RePassword: ");
            repassword=scan.next();

            if (repassword.equals(password)) {

                logInBool = log.isAllPresent(password);

                if (!logInBool) {
                    System.out.println("Invalid Password. Please try again.");
                }
            }else{
                System.out.println("Both password doesn't match");
            }




        }

        Hr hr=new Hr( usrname, password);

        idp.add(hr);

        System.out.println("User Credentials Updated! ");


    }

    private boolean checkUserNameAvailablity(String username) {

        for(Hr hr : idp){

            if(hr.getUsername().equals(username))
                return false;
        }

        return true;
    }

    public void hrLoginMain(){



        int choice;


        do{
            System.out.println("************** Welcome to User Database **************\n1.Login \n2.Register\n3.Exit\n\nEnter your choice: ");


            choice=scan.nextInt();

            switch (choice){
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
                case 3:
                    System.out.println("Thank you");
                    System.exit(0);
                default:
                    System.out.println("Invalid Input! ");

            }
        }while (ordering);


    }


}
