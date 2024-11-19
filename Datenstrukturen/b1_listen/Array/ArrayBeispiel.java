package b1_listen.Array;

public class ArrayBeispiel {

    public static void main(String[] args) {
        
        double messwerte[] = new double[3];
        messwerte[0] = 1.3;
        messwerte[1] = 1.8;
        messwerte[2] = 1.5;
        
        for (double mw : messwerte) {
            System.out.println(mw);
        }
    }
}