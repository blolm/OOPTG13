# k Means Algorithmus

## Definition

Clustering von zufälligen Datenpunkten

## Algorithmus

### Beschreibung

-wähle 1,2, bis k zufällige Zentren für Cluster die klassifiziert werden sollen.
-wiederhole solange sich die Position eines Clusters ändert
    -Ordne alle Datenpunkte zum nächsten Cluster zu.

    für alle Cluster:
        für alle Datensätz des Clusters
            -berechne den mittleren x-y Wert zu zu diesem
        -setze die Position dieses Clusters neu.





### Pseudocode (Morpheus Tutorials)

wähle Clusterzentren $c_1,c_2,\cdots c_k \leftarrow \R$
    solange ein $c_j$ sich ändert:
        Für alle $x_i$
            $l=argmin_{j=1}^k=(|x_i-c_j|)$

    Für alle$c_j$

### Pseudocode Beispiel:

```python
+kMeans(data:List<MyData>, k)

    List<MyCluster> cluster = setzeCluster(k)
    delta:FKZ <-Double.MAxVAlue

    wiederhole
        //Bestimme für jedes Datenobjekt das nächste Cluster
        Set<DOUBLE, Cluster> distanzen = new TreeMap<>()
        FÜR o IN data
            FÜR c IN cluster
                distanzen.put(getDistance(o,c), c)
            ENDE FÜR
            

        ENDE FÜR

        //Datenobjekte den Clustern zuordnen


        //Für jedes Cluster den neuen Mittelwert
        //aller Datenobjekt berechnen.

        //Prüfen ob neue Mittelwerte von den alten Mittelwerten abweichen (delta)
        delta <- 


    solange (delta > 0)

``` 