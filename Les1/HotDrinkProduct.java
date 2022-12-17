package Les1;

public class HotDrinkProduct extends DrinksProduct {
    private int temp;
    public HotDrinkProduct(String name, int price, int number, int volume, String pack, String gas, int temp) {
        super(name, price, number, volume, pack, gas);
        this.temp = temp;
    }

      public int getTemp() {
        return temp;
    }

    @Override
    public String toString() {
        return "Получите ваш напиток: \n" + super.getName() + " объемом - " + super.getVolume()  + "мл, температуры - " + temp
              + " градусов \n" + "По цене - " + super.getPrice() + " руб";
    }

    // public void setTemp(int temp) {
    //     this.temp = temp;
    // }



  



}
