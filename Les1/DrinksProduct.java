package Les1;

public class DrinksProduct extends Product{
    private int volume;
    private String pack;
    private String gas;
    public DrinksProduct(String name, int price, int number, int volume, String pack, String gas) {
        super(name, price, number);
        this.volume = volume;
        this.pack = pack;
        this.gas = gas;
    }
    public int getVolume() {
        return volume;
    }
    public String getPack() {
        return pack;
    }
    public String getGas() {
        return gas;
    }
    @Override
    public String toString() {
        return super.toString()+"Drinks [volume=" + volume + ", pack=" + pack + ", gas=" + gas + "]";
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    
}
