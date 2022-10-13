package ClassProjects;

public class lab {

    public static double getDiff(double k, double dk, double a) {
        double diff = 0;
        double tk = k + dk;
        double pa = ((a/100) * 5);
        double ta = a + pa;

        diff = (tk/ta) * 100;
        double tdiff = 100.0 - diff;
        return tdiff;
    }

    public static void main(String[] args) {
        System.out.println(getDiff(47.83, 0.7889,50) + "% difference");





    }
    
}
