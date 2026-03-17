class Pizza {
    private String size;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;
    public Pizza() {
    }
    public Pizza(String size, int cheeseToppings, int pepperoniToppings, int hamToppings) {
        this.size = size;
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
    }
    public double calcCost() {
        int basePrice = 0;
        if (size.equalsIgnoreCase("Small")) {
            basePrice = 10;
        } else if (size.equalsIgnoreCase("Medium")) {
            basePrice = 12;
        } else if (size.equalsIgnoreCase("Large")) {
            basePrice = 14;
        }
        int toppings = cheeseToppings + pepperoniToppings + hamToppings;
        return basePrice + (toppings * 2);
    }
    public String getDescription() {
        return size + " pizza with " + cheeseToppings + " cheese, " + pepperoniToppings + " pepperoni, and " + hamToppings + " ham.";
    }
}
class PizzaOrder {
    private Pizza p1,p2,p3;
    public PizzaOrder() {
    }
    public PizzaOrder(Pizza p1, Pizza p2, Pizza p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public double calcTotal() {
        double total=0;
        if(p1!=null) {
            total+=p1.calcCost();
        }
        if(p2!=null) {
            total+=p2.calcCost();
        }
        if(p3!=null) {
            total+=p3.calcCost();
        }
        return total;
    }
}
class PizzaRunner {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("Medium", 1, 1, 2);
        Pizza p2 = new Pizza("Large", 1, 1, 2);
        System.out.println(p1.getDescription());
        System.out.println(p2.getDescription());
        PizzaOrder order = new PizzaOrder(p1, p2, null);
        System.out.println("Total Order Cost: $" + order.calcTotal());
    }
}