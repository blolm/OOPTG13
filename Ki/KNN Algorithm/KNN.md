# The K-Nearest Neighbors (K-NN) algorithm is a popular Machine Learning algorithm used mostly for solving classification problems.

## How Does the K-Nearest Neighbors Algorithm Work?
The K-NN algorithm compares a new data entry to the values in a given data set (with different classes or categories).

Based on its closeness or similarities in a given range (K) of neighbors, the algorithm assigns the new data to a class or category in the data set (training data).

## Steps for K-NN algorithm 
1. Assign a value to K.

2. Calculate the distance between the new data entry and all other existing data entries (you'll learn how to do this shortly). Arrange them in ascending order.

3. Find the K nearest neighbors to the new entry based on the calculated distances.

4. Assign the new data entry to the majority class in the nearest neighbors.

## K-Nearest Neighbors Classifiers and Model Example With Diagrams

![](/Ki/KNN%20Algorithm/imagesmd/knn-data-graph.png)


The graph above represents a data set consisting of two classes — red and blue.

![](/Ki/KNN%20Algorithm/imagesmd/knn-data-graph-2.png)

A new data entry has been introduced to the data set. This is represented by the green point in the graph above.

We'll then assign a value to K which denotes the number of neighbors to consider before classifying the new data entry. Let's assume the value of K is 3.

![](/Ki/KNN%20Algorithm/imagesmd/knn-data-graph-3.png)

Since the value of K is 3, the algorithm will only consider the 3 nearest neighbors to the green point (new entry). This is represented in the graph above.

Out of the 3 nearest neighbors in the diagram above, the majority class is red so the new entry will be assigned to that class.

![](/Ki/KNN%20Algorithm/imagesmd/knn-data-graph-4.png)

The last data entry has been classified as red. 

<br>

## K-Nearest Neighbors Classifiers and Model Example With Data Set
Brightness	Saturation	Class
| Brightness  | Saturation |  Class  |
| ----------- | ---------- |---------|
|    40       |     20     |   Red   |
|    50       |     50     |   Blue  |
|    60       |     90     |   Red   |
|    10       |     25     |   Blue  |
|    70       |     70     |   Red   |
|    60       |     10     |   Blue  |
|    25       |     80     |   Red   | 


The table above represents our data set.   

<br>
We have two columns — Brightness and Saturation. Each row in the table has a class of either Red or Blue.

Before we introduce a new data entry, let's assume the value of K is 5.
<br>
<br>
### How to Calculate Euclidean Distance in the K-Nearest Neighbors Algorithm

Here's the new data entry:
| Brightness  | Saturation |  Class  |
| ----------- | ---------- |---------|
|    20       |     35     |   ?     | 

We have a new entry but it doesn't have a class yet. \
To know its class, we have to calculate the distance from the new entry to other entries in the data set using the Euclidean distance formula.

Here's the formula: $\sqrt{(X₂-X₁)^2+(Y₂-Y₁)^2 }$

Where:

X₂ = New entry's brightness (20).<br>
X₁= Existing entry's brightness.<br>
Y₂ = New entry's saturation (35).<br>
Y₁ = Existing entry's saturation.<br>

Let's do the calculation together. I'll calculate the first three.

#### Distance #1
For the first row, d1:

| Brightness  | Saturation |  Class  |
| ----------- | ---------- |---------|
|    20       |     35     |   ?     | 

d1 = $\sqrt{(20-40)^2+(35-20)^2 }$ <br>
=$\sqrt{400+225}$ <br>
= $\sqrt{625}$ <br>
= $25$

We now know the distance from the new data entry to the first entry in the table. Let's update the table.

| Brightness  | Saturation |  Class  | Distance|
| ----------- | ---------- |---------|---------|
|    40       |     20     |   Red   |    25   |
|    50       |     50     |   Blue  |?|
|    60       |     90     |   Red   |?|
|    10       |     25     |   Blue  |?|
|    70       |     70     |   Red   |?|
|    60       |     10     |   Blue  |?|
|    25       |     80     |   Red   |?|

#### Distance #2
For the second row, d2:

| Brightness  | Saturation |  Class  |Distance |
| ----------- | ---------- |---------|---------|
|    50       |     50     |   Blue  |    ?    |

d2 = $\sqrt{(20-50)^2+(35-50)^2 }$ <br>
=$\sqrt{900+225}$ <br>
= $\sqrt{1125}$ <br>
= $33.54$



Here's the table with the updated distance:

| Brightness  | Saturation |  Class  | Distance|
| ----------- | ---------- |---------|---------|
|    40       |     20     |   Red   |    25   |
|    50       |     50     |   Blue  |33.54|
|    60       |     90     |   Red   |?|
|    10       |     25     |   Blue  |?|
|    70       |     70     |   Red   |?|
|    60       |     10     |   Blue  |?|
|    25       |     80     |   Red   |?|


### All Distances in Order

|Brightness	|Saturation |	Class	|Distance|
| ----------- | ---------- |---------|---------|
|10|	25	|Red	|10|
|40|	20	|Red	|25|
|50|	50	|Blue	|33.54|
|25|	80	|Blue	|45|
|60|	10	|Red	|47.17|
|70|	70	|Blue	|61.03|
|60|	90	|Blue	|68.01|

Since we chose 5 as the value of K, we have `3 Red` and `2 Blue` which makes the new value class `Red`
<br>
<br>
## How to Choose the Value of K in the K-NN Algorithm
There is no particular way of choosing the value K, but here are some common conventions to keep in mind:

- Choosing a very low value will most likely lead to inaccurate predictions.
- The commonly used value of K is 5.
- Always use an odd number as the value of K.
<br>

## Advantages of K-NN Algorithm
- It is simple to implement.
- No training is required before classification.
<br>
 
## Disadvantages of K-NN Algorithm
- Can be cost-intensive when working with a large data set.
- A lot of memory is required for processing large data sets.
- Choosing the right value of K can be tricky.