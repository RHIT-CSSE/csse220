package simpleOrderA;

import java.util.ArrayList;

class Order {
    int id;
    String name;
    ArrayList<String> itemNames;
    ArrayList<Double> itemPrices;
    ArrayList<Integer> itemQuantities;

    Order(int id, String name, ArrayList<String> itemNames, ArrayList<Double> itemPrices, ArrayList<Integer> itemQuantities) {
        this.id = id;
        this.name = name;
        this.itemNames = itemNames;
        this.itemPrices = itemPrices;
        this.itemQuantities = itemQuantities;
    }

    String constructOrderReport() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order ").append(id).append(" for ").append(name).append("\n");
        for (int i = 0; i < itemNames.size(); i++) {
            String n = itemNames.get(i);
            double p = itemPrices.get(i);
            int q = itemQuantities.get(i);
            sb.append(n).append(" x ").append(q).append(" @ ").append(p).append(" = ").append(p * q).append("\n");
        }
        sb.append("Total: ").append(completeTotalCost());
        return sb.toString();
    }

    double completeTotalCost() {
        double total = 0.0;
        for (int i = 0; i < itemPrices.size(); i++) {
            total = total + itemPrices.get(i) * itemQuantities.get(i);
        }
        return total;
    }
}
