//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Resturant;

public abstract class Item {
    private String name;
    private double price;
    private double cost;

    
    public Item(String name, double price, double cost) {
        this.name = name;
        this.price = price;
        this.cost = cost;
    }

    public Item() {
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Foods{, name='" + this.name + "', price=" + this.price + ", cost=" + this.cost;
    }
}
