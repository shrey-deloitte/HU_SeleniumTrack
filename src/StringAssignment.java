import java.util.Scanner;

public class StringAssignment {
    public static <string> void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1=scan.nextLine();
        String s2=scan.nextLine();
        String s3=scan.nextLine();

        String valid=" ";

        int i=0,j=0;

        boolean first=true;
        boolean second=false;

        while (i<s1.length() && j<s2.length()){
            if(first){
                valid += String.valueOf(s1.charAt(i));
                i++;
                first = false;
                second = true;
            }

            else if(second){
                valid += String.valueOf(s2.charAt(j));
                j++;
                first = true;
                second = false;
            }
        }

        while (i<s1.length()){
            valid += String.valueOf(s1.charAt(i));
            i++;
        }

        while (j<s2.length()){
            valid += String.valueOf(s2.charAt(j));
            j++;
        }

        if(valid.equals(s3)){
            System.out.println("Valid Shuffle");
        }else{
            System.out.println("Invalid Shuffle");
        }
    }
}
