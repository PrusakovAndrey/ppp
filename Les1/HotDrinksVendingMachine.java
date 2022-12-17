package Les1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HotDrinksVendingMachine extends VendingMachine {


    Set<HotDrinkProduct> hotproducts = new HashSet<>();

    public HotDrinksVendingMachine() {
        // products.add(new Product("Coca-cola", 50, 1));
        // products.add(new Product("Sprite", 49, 2));
        // products.add(new Product("Lays", 75, 3));
        // products.add(new Product("Mars", 35, 4));
        // products.add(new Product("Fanta", 50, 5));
        // products.add(new DrinksProduct("Тархун", 35, 6, 500, "Стекло", "Газированый"));
        // products.add(new DrinksProduct("Байкал", 45, 7, 500, "Стекло", "Газированная"));
        // products.add(new ChokoProduct("Аленка", 100, 8, 90, "Молочный", true));
        // products.add(new ChipsProduct("Lays", 120, 9, 45, "лук"));
        hotproducts.add(new HotDrinkProduct("Coffee", 100, 10, 200, null, null, 75));
        hotproducts.add(new HotDrinkProduct("Coffee", 100, 11, 400, null, null, 75));
        hotproducts.add(new HotDrinkProduct("Coffee", 100, 12, 400, null, null, 95));
        hotproducts.add(new HotDrinkProduct("Tea", 40, 13, 200, null, null, 75));
        hotproducts.add(new HotDrinkProduct("Tea", 40, 14, 200, null, null, 95));
        hotproducts.add(new HotDrinkProduct("Tea", 40, 15, 400, null, null, 95));

    }

    @Override
    public void getProduct(){
        Scanner ui = new Scanner(System.in);
        System.out.println("Выбеите тип напитка (Кофе - 1, Чай - 2): ");
        String typeOfDrink = null;
        switch(ui.nextInt()){
            case 1:
            typeOfDrink = "Coffee";
            break;
            case 2:
            typeOfDrink = "Tea";
            break;
            default: 
            break;
        } 

        System.out.println("Выберите температуру напитка (95 градусов - 1, 75 градусов - 2): ");
        int tempOfDrink = 0;
        switch(ui.nextInt()){
            case 1:
            tempOfDrink = 95;
            break;
            case 2:
            tempOfDrink = 75;
            break;
            default: 
            break;
        } 

        System.out.println("Выбеите объем напитка (250.мл - 1, 400.мл - 2): ");
        int volOfDrink = 0;
        switch(ui.nextInt()){
            case 1:
            volOfDrink = 250;
            break;
            case 2:
            volOfDrink = 400;
            break;
            default: 
            break;
        } 

        for (HotDrinkProduct hotproduct: hotproducts) {
            if (!hotproduct.getName().equals(typeOfDrink)) 
                continue;
            if (hotproduct.getVolume() != volOfDrink)
                continue;
            if (hotproduct.getTemp() != tempOfDrink)
                continue;
            System.out.println(hotproduct.toString());//HotDrinkProduct.toString());
        }
    }

}
