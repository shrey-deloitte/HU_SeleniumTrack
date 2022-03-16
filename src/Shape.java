public class Shape {
    public static int  square(int x){
        return  x*x;
    }

    public static float circle(float  x){
        return  22/7 * x *x;
    }

    public static double triangle(int x,int y){
        return 0.5* x *y;
    }

    public static int rectangle(int x,int y){
        return  y *x;
    }

    public static void main(String[] args) {

        System.out.println("The square's area is " +  square(2));
        System.out.println("The rectangle's area is " +  rectangle(2,4));
        System.out.println("The circle's's area is " +  circle(2));
        System.out.println("The triangle's area is " +  triangle(2,4));
    }
}
