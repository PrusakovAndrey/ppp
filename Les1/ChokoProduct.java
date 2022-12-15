package Les1;

public class ChokoProduct extends Product {
    private int weight;
    private String flavour;
    private boolean nuts;
    
    public ChokoProduct(String name, int price, int number, int weight, String flavour, boolean nuts) {
        super(name, price, number);
        this.weight = weight;
        this.flavour = flavour;
        this.nuts = nuts;
    }
    public int getWeight() {
        return weight;
    }
    public String getFlavour() {
        return flavour;
    }
    public boolean getNuts() {
        return nuts;
    }
    
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }
    public void setNuts(boolean nuts) {
        this.nuts = nuts;
    }
    @Override
    public String toString() {
        return super.toString() + "Choko [weight=" + weight + ", flavour=" + flavour + ", nuts=" + nuts + "]";
    }
    
    
}
