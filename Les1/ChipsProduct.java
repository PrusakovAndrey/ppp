package Les1;

public class ChipsProduct extends Product{
    private int weight;
    private String flavour;

    public ChipsProduct(String name, int price, int number, int weight, String flavour) {
        super(name, price, number);
        this.weight = weight;
        this.flavour = flavour;
    }

    public int getWeight() {
        return weight;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    @Override
    public String toString() {
        return super.toString() + "Chips [weight=" + weight + ", flavour=" + flavour + "]";
    }

    
    
}
