package Les1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

    

/*
Выявите и реализуйте классы для следующей задачи. 
Пропишите необходимый минимум полей и методов. 
Пока что оставьте методы пустыми.
Торговый автомат содержит в себе набор товаров. Покупатель вводит номер товара. 
Автомат высвечивает стоимость товара. Покупатель его оплачивает. 
Из лотка выпадает заказанный товар. 
*/


public class VendingMachine {

    Set<Product> products = new HashSet<>();

    public VendingMachine() {
        products.add(new Product("Coca-cola", 50, 1));
        products.add(new Product("Sprite", 49, 2));
        products.add(new Product("Lays", 75, 3));
        products.add(new Product("Mars", 35, 4));
        products.add(new Product("Fanta", 50, 5));
        products.add(new DrinksProduct("Тархун", 35, 6, 500, "Стекло", "Газированый"));
        products.add(new DrinksProduct("Байкал", 45, 7, 500, "Стекло", "Газированная"));
        products.add(new ChokoProduct("Аленка", 100, 8, 90, "Молочный", true));
        products.add(new ChipsProduct("Lays", 120, 9, 45, "лук"));
        products.add(new HotDrinkProduct("Coffee", 100, 10, 200, null, null, 75));
        products.add(new HotDrinkProduct("Coffee", 100, 11, 300, null, null, 75));
        products.add(new HotDrinkProduct("Coffee", 100, 12, 300, null, null, 75));
        products.add(new HotDrinkProduct("Tea", 40, 13, 200, null, null, 75));
        products.add(new HotDrinkProduct("Tea", 40, 14, 200, null, null, 85));
        products.add(new HotDrinkProduct("Tea", 40, 15, 200, null, null, 95));

    }

    public void findProductPrice(){

        Scanner ui = new Scanner(System.in);
        System.out.println("Введите номер товара: ");

        int number = ui.nextInt();
       

        for (Product product: products) {
            if (product.getNumber() == number) {
                System.out.println("Стоимость составляет:" + product.getPrice());
            }
        }
    }
    public void getProduct(){
        Scanner ui = new Scanner(System.in);
        System.out.println("Введите номер товара для выбора: ");

        int number = ui.nextInt();
       

        for (Product product: products) {
            if (product.getNumber() == number) {
                System.out.println(product.toString());
            }
        }

    }
}
