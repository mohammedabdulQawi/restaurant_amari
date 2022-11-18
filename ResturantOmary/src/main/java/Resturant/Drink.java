
package Resturant;

public class Drink extends Item {
    private String drinks_Type;

    public String getDrinks_Type() {
        return drinks_Type;
    }

    public void setDrinks_Type(String drinks_Type) {
        this.drinks_Type = drinks_Type;
    }

    public Drink(String name, double price, double cost, String drinks_Type) {

        super(name, price, cost);

        this.drinks_Type = drinks_Type;
    }

    public String toString() {
        return super.toString()+ "drinks_Type='" + drinks_Type + '\'' + '}';
    }
}
