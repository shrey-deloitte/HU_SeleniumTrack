public class Animal {

    private static int legs;
    private static  int horns;
    private static  int nose;


    public static int getLegs() {
        return legs;
    }

    public static void setLegs(int legs) {
        Animal.legs = legs;
    }

    public static int getHorns() {
        return horns;
    }

    public static void setHorns(int horns) {
        Animal.horns = horns;
    }

    public static int getNose() {
        return nose;
    }

    public static void setNose(int nose) {
        Animal.nose = nose;
    }

    public static void main(String[] args) {

        setLegs(4);
        setHorns(2);
        setNose(1);

       System.out.println( getLegs());
       System.out.println(getHorns());
        System.out.println(getNose());



    }
}
