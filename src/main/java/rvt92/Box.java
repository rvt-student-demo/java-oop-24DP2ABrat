package rvt92;


import java.util.ArrayList;

public class Box implements Packable {
private int max_weight;
private ArrayList<Packable> items;

public Box(int max_weight) {
this.max_weight = max_weight;
this.items = new ArrayList<>();
}

public void add(Packable item) {
this.items.add(item);

}
// weigth = 0
// for-each pa items
// +=

public double weight() {
double weight = 0;
for (Packable item : items) {
			weight += item.weight();
if(weight>this.max_weight){
System.out.println("Svars parsniedz maksimumu");
System.out.println("Tas svars ir: "+ weight);
}
}

return weight;
}

public String toString() {
	return "Box: " + items.size() + " items, total weight: " + this.weight() + " kg";
}
}
