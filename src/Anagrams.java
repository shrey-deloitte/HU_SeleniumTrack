import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    public static <string> void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2= scan.nextLine();

        char charArray1[]=s1.toCharArray();
        char charArray2[]=s2.toCharArray();



        if (s1.length()!=s2.length()){
            System.out.println("Not Anagrams");
        }

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);



        if(Arrays.equals(charArray1,charArray2)){
            System.out.println("Yes,it is an Anagram");
        }
        else{
            System.out.println("Not an anagram");
        }




    }
}
