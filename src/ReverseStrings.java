import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int n= scan.nextInt();
        int i;
        ArrayList<String> list = new ArrayList<>();
        for(i=0;i<n;i++){
            list.add(scan.next());
        }

        Collections.reverse(list);
        System.out.println(list);

    }
}
