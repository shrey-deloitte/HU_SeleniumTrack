public  class Loops {
    public static void main(String[] args) {

        int i, j, k;

        for (i= 1; i<= 10 ; i++)
        {
            for (j=i; j <10 ;j++)
            {
                System.out.print(" ");
            }
            for (k=1; k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (i=10; i>=1; i--)
        {
            for(j=i; j<=10;j++)
            {
                System.out.print(" ");
            }
            for(k=1; k<i ;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
    }






