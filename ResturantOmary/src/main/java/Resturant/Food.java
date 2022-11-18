package Resturant;

public class Food extends Item {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Food(String name, double price, double cost, String type) {
        super(name, price, cost);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() +
                "type='" + type + '\'' +
                '}';
    }
}
