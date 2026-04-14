package simpleOrderA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SimpleOrderMain {

    private final Map<Integer, Item> catalog = new HashMap<>();
    private final ArrayList<Order> orders = new ArrayList<>();
    private int nextOrderId = 1;

    public SimpleOrderMain() { }

    public void addCatalogItem(int id, String name, double price) {
        catalog.put(id, new Item(id, name, price));
    }

    public int handleNewOrder(String name, ArrayList<Integer> itemIds, ArrayList<Integer> quantities) {
        ArrayList<String> itemNames = new ArrayList<>();
        ArrayList<Double> itemPrices = new ArrayList<>();
        ArrayList<Integer> itemQuantities = new ArrayList<>();

        for (int i = 0; i < itemIds.size(); i++) {
            int itemId = itemIds.get(i);
            int qty = quantities.get(i);
            Item it = catalog.get(itemId);
            if (it == null) {
                return -1;
            }
            itemNames.add(it.name);
            itemPrices.add(it.price);
            itemQuantities.add(qty);
        }

        int id = nextOrderId++;
        Order order = new Order(id, name, itemNames, itemPrices, itemQuantities);
        orders.add(order);
        return id;
    }

    public String handleDisplayOrderReport(int orderId) {
        Order o = findOrder(orderId);
        if (o == null) {
            return "";
        }
        return o.constructOrderReport();
    }

    private Order findOrder(int id) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).id == id) {
                return orders.get(i);
            }
        }
        return null;
    }
}
