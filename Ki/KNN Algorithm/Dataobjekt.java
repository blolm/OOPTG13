
public class Dataobjekt {

    int x;
    int y;
    int klasse = -1;

    
    public Dataobjekt(int x, int y, int klasse){
        this.x = x;
        this.y = y;
        this.klasse = klasse;
    }

    public Dataobjekt(int x, int y){
        this.x = x;
        this.y = y;
        klasse = -1;
    }
    
public void setX(int x) {
    this.x = x;
}
public int getX() {
    return x;
}
public void setY(int y) {
    this.y = y;
}
public int getY() {
    return y;
}
}