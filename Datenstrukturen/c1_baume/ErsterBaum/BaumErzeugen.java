package ErsterBaum;

public class BaumErzeugen{
    public static void main(String[] args) {
        
        MeinBaum meinBaum = new MeinBaum();
        meinBaum.insert(5);
        meinBaum.insert(2);

        System.out.println(meinBaum);
    }
}