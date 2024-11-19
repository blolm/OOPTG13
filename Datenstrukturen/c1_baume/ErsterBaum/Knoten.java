package ErsterBaum;

public class Knoten{
 public Knoten links;
 public Knoten rechts;   
 public int wert;

 public Knoten (int i){
    this.wert = i;
 }

 @Override
 public String toString() {
    return "Wert: "+ wert;
 }
}