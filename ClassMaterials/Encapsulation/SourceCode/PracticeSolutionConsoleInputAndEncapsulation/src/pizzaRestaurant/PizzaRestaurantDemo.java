package pizzaRestaurant;

// SOLUTION A: Pizza calculates its own cost
import java.util.*;
import java.time.LocalDate;

// Solution A Classes
class PizzaMainA {
    private Map<Integer, OrderA> orders = new HashMap<>();
    private int nextOrderNum = 1;
    
    public int handleCreateNewOrder(String customerData) {
        OrderA order = new OrderA(nextOrderNum, customerData);
        orders.put(nextOrderNum, order);
        return nextOrderNum++;
    }
    
    public void handleAddPizza(int orderNum, List<String> toppings) {
        OrderA order = orders.get(orderNum);
        if (order != null) {
            order.addPizzaToOrder(toppings);
        }
    }
    
    public OrderA getOrder(int orderNum) {
        return orders.get(orderNum);
    }
}

class OrderA {
    private int orderNum;
    private String customerData;
    private List<PizzaA> pizzas;
    private LocalDate orderDate;
    
    public OrderA(int orderNum, String customerData) {
        this.orderNum = orderNum;
        this.customerData = customerData;
        this.pizzas = new ArrayList<>();
        this.orderDate = LocalDate.now();
    }
    
    public void addPizzaToOrder(List<String> toppingList) {
        PizzaA pizza = new PizzaA(toppingList);
        pizzas.add(pizza);
    }
    
    public double getCost() {
        double totalCost = 0.0;
        for (PizzaA pizza : pizzas) {
            totalCost += pizza.getCost();
        }
        return totalCost;
    }
    
    // Getters
    public int getOrderNum() { return orderNum; }
    public String getCustomerData() { return customerData; }
    public List<PizzaA> getPizzas() { return pizzas; }
    public LocalDate getOrderDate() { return orderDate; }
}

class PizzaA {
    private List<String> toppings;
    
    public PizzaA(List<String> toppings) {
        this.toppings = new ArrayList<>(toppings);
    }
    
    public double getCost() {
        // Check for "The Special" - peppers, onions, and sausage
        if (isTheSpecial()) {
            return 12.0;
        }
        
        // Base cost
        double cost = 8.0;
        
        // First 2 toppings cost $2 each
        int toppingCount = toppings.size();
        if (toppingCount <= 2) {
            cost += toppingCount * 2.0;
        } else {
            // First 2 toppings at $2 each, rest at $1 each
            cost += 2 * 2.0; // First 2 toppings
            cost += (toppingCount - 2) * 1.0; // Additional toppings
        }
        
        return cost;
    }
    
    private boolean isTheSpecial() {
        if (toppings.size() != 3) return false;
        
        Set<String> specialToppings = new HashSet<>(Arrays.asList("peppers", "onions", "sausage"));
        Set<String> pizzaToppings = new HashSet<>();
        for (String topping : toppings) {
            pizzaToppings.add(topping.toLowerCase());
        }
        
        return specialToppings.equals(pizzaToppings);
    }
    
    public List<String> getToppings() {
        return new ArrayList<>(toppings);
    }
}

// =================================================================
// SOLUTION B: Order calculates pizza costs
// =================================================================

class PizzaMainB {
    private Map<Integer, OrderB> orders = new HashMap<>();
    private int nextOrderNum = 1;
    
    public int handleCreateNewOrder(String customerData) {
        OrderB order = new OrderB(nextOrderNum, customerData);
        orders.put(nextOrderNum, order);
        return nextOrderNum++;
    }
    
    public void handleAddPizza(int orderNum, List<String> toppings) {
        OrderB order = orders.get(orderNum);
        if (order != null) {
            order.addPizzaToOrder(toppings);
        }
    }
    
    public OrderB getOrder(int orderNum) {
        return orders.get(orderNum);
    }
}

class OrderB {
    private int orderNum;
    private String customerData;
    private List<PizzaB> pizzas;
    private LocalDate orderDate;
    
    public OrderB(int orderNum, String customerData) {
        this.orderNum = orderNum;
        this.customerData = customerData;
        this.pizzas = new ArrayList<>();
        this.orderDate = LocalDate.now();
    }
    
    public void addPizzaToOrder(List<String> toppingList) {
        PizzaB pizza = new PizzaB(toppingList);
        pizzas.add(pizza);
    }
    
    public double computeCostForPizza(PizzaB pizza) {
        List<String> toppings = pizza.getToppings();
        
        // Check for "The Special" - peppers, onions, and sausage
        if (isTheSpecial(toppings)) {
            return 12.0;
        }
        
        // Base cost
        double cost = 8.0;
        
        // First 2 toppings cost $2 each
        int toppingCount = toppings.size();
        if (toppingCount <= 2) {
            cost += toppingCount * 2.0;
        } else {
            // First 2 toppings at $2 each, rest at $1 each
            cost += 2 * 2.0; // First 2 toppings
            cost += (toppingCount - 2) * 1.0; // Additional toppings
        }
        
        return cost;
    }
    
    private boolean isTheSpecial(List<String> toppings) {
        if (toppings.size() != 3) return false;
        
        Set<String> specialToppings = new HashSet<>(Arrays.asList("peppers", "onions", "sausage"));
        Set<String> pizzaToppings = new HashSet<>();
        for (String topping : toppings) {
            pizzaToppings.add(topping.toLowerCase());
        }
        
        return specialToppings.equals(pizzaToppings);
    }
    
    public double getCost() {
        double totalCost = 0.0;
        for (PizzaB pizza : pizzas) {
            totalCost += computeCostForPizza(pizza);
        }
        return totalCost;
    }
    
    // Getters
    public int getOrderNum() { return orderNum; }
    public String getCustomerData() { return customerData; }
    public List<PizzaB> getPizzas() { return pizzas; }
    public LocalDate getOrderDate() { return orderDate; }
}

class PizzaB {
    private List<String> toppings;
    
    public PizzaB(List<String> toppings) {
        this.toppings = new ArrayList<>(toppings);
    }
    
    public List<String> getToppings() {
        return new ArrayList<>(toppings);
    }
}

// =================================================================
// DEMONSTRATION CODE
// =================================================================

public class PizzaRestaurantDemo {
    public static void main(String[] args) {
        System.out.println("=== SOLUTION A DEMO ===");
        demonstrateSolutionA();
        
        System.out.println("\n=== SOLUTION B DEMO ===");
        demonstrateSolutionB();
    }
    
    private static void demonstrateSolutionA() {
        PizzaMainA pizzaMain = new PizzaMainA();
        
        // Create order
        int orderNum = pizzaMain.handleCreateNewOrder("John Doe");
        
        // Add pizzas
        pizzaMain.handleAddPizza(orderNum, Arrays.asList("cheese"));
        pizzaMain.handleAddPizza(orderNum, Arrays.asList("peppers", "onions", "sausage")); // The Special
        pizzaMain.handleAddPizza(orderNum, Arrays.asList("cheese", "pepperoni", "mushrooms", "olives"));
        
        OrderA order = pizzaMain.getOrder(orderNum);
        System.out.println("Customer: " + order.getCustomerData());
        System.out.println("Order #: " + order.getOrderNum());
        System.out.println("Total Cost: $" + order.getCost());
        
        for (int i = 0; i < order.getPizzas().size(); i++) {
            PizzaA pizza = order.getPizzas().get(i);
            System.out.println("Pizza " + (i+1) + ": " + pizza.getToppings() + " - $" + pizza.getCost());
        }
    }
    
    private static void demonstrateSolutionB() {
        PizzaMainB pizzaMain = new PizzaMainB();
        
        // Create order
        int orderNum = pizzaMain.handleCreateNewOrder("Jane Smith");
        
        // Add pizzas
        pizzaMain.handleAddPizza(orderNum, Arrays.asList("cheese"));
        pizzaMain.handleAddPizza(orderNum, Arrays.asList("peppers", "onions", "sausage")); // The Special
        pizzaMain.handleAddPizza(orderNum, Arrays.asList("cheese", "pepperoni", "mushrooms", "olives"));
        
        OrderB order = pizzaMain.getOrder(orderNum);
        System.out.println("Customer: " + order.getCustomerData());
        System.out.println("Order #: " + order.getOrderNum());
        System.out.println("Total Cost: $" + order.getCost());
        
        for (int i = 0; i < order.getPizzas().size(); i++) {
            PizzaB pizza = order.getPizzas().get(i);
            System.out.println("Pizza " + (i+1) + ": " + pizza.getToppings() + " - $" + order.computeCostForPizza(pizza));
        }
    }
}