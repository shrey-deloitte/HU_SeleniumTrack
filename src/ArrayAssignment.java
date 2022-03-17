import java.util.*;

public class ArrayAssignment {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int a[] = new int[n];
            int i,j,sum = 0;
            for(i=0;i<n;i++)
            {
                a[i] = scan.nextInt();
            }
         //   scan.close();
            int count=0;
            for(i=0;i<n;i++)
            {
                sum = 0;
                for(j=i;j<n;j++)
                {
                    sum = sum + a[j];
                    if(sum<0){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    //scan.close();
}
