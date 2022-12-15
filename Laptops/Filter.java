package Laptops;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Filter {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<Laptop>();
        laptops.add(new Laptop("HP", 8, 256, "Win", "Black", 580));
        laptops.add(new Laptop("HP", 16, 256, "Win", "Black", 780));
        laptops.add(new Laptop("HP", 32, 1028, "Win", "Black", 1080));
        laptops.add(new Laptop("Dell", 4, 128, "Win", "Black", 630));
        laptops.add(new Laptop("Dell", 8, 256, "Win", "Black", 800));
        laptops.add(new Laptop("Dell", 32, 512, "Win", "Black", 800));
        laptops.add(new Laptop("Apple", 16, 256, "Mac", "White", 1200));
        laptops.add(new Laptop("Apple", 16, 512, "Mac", "Silver", 1450));
        laptops.add(new Laptop("Apple", 32, 1028, "Mac", "Silver", 1590));
        laptops.add(new Laptop("XXX", 8, 256, "No", "Black", 490));
        laptops.add(new Laptop("XXX", 16, 1028, "No", "Silver", 610));
        laptops.add(new Laptop("XXX", 8, 512, "No", "Black", 530));
        laptops.add(new Laptop("Lenovo", 16, 256, "Win", "Black", 730));
        laptops.add(new Laptop("Lenovo", 16, 256, "Win", "White", 730));
        laptops.add(new Laptop("Lenovo", 16, 512, "Win", "Black", 915));

        // Оставить только ноутбуки Acer

        Scanner request = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую необходимому критерию:" + "\n" + "ОЗУ:" + "\n" + "4Гб  - 1"
                + "\n" + "8Гб  - 2" + "\n" + "16Гб - 3" + "\n" + "32Гб - 4");
        String userInput1 = request.nextLine();
        int memory = 0;
        switch (userInput1) {
            case "1":
                memory = 4;
                break;
            case "2":
                memory = 8;
                break;
            case "3":
                memory = 16;
                break;
            case "4":
                memory = 32;
                break;
            default:
                break;
        }

        System.out.println("Жесткий диск : " + "\n" + "128Гб  - 1" + "\n" + "256Гб  - 2" + "\n" + "512Гб  - 3" + "\n"
                + "1028Гб - 4");
        String userInput2 = request.nextLine();
        int cache = 0;
        switch (userInput2) {
            case "1":
                cache = 128;
                break;
            case "2":
                cache = 256;
                break;
            case "3":
                cache = 512;
                break;
            case "4":
                cache = 1028;
                break;
            default:
                break;
        }

        System.out.println(
                "Операционная система : " + "\n" + "Windows  - 1" + "\n" + "Mac Os  - 2" + "\n" + "Without OS  - 3");
        String userInput3 = request.nextLine();
        String os = null;
        switch (userInput3) {
            case "1":
                os = "Win";
                break;
            case "2":
                os = "Mac";
                break;
            case "3":
                os = "No";
                break;
            default:
                break;
        }

        System.out.println("Цвет : " + "\n" + "Черный  - 1" + "\n" + "Белый  - 2" + "\n" + "Серебрянный  - 3");
        String userInput4 = request.nextLine();
        String col = null;
        switch (userInput4) {
            case "1":
                col = "Black";
                break;
            case "2":
                col = "White";
                break;
            case "3":
                col = "Silver";
                break;
            default:
                break;
        }

        System.out.println("Введите максимальную цену : ");
        String maxPrice = request.nextLine();
        int price = Integer.parseInt(maxPrice);
        
        List<Laptop> filtered = new ArrayList<>();
        for (Laptop laptop : laptops) {
            if (laptop.getMemory() != memory)
                continue;
            if (laptop.getCache() != cache) 
                continue;
            if (!laptop.getOs().equals(os)) 
                continue;
            if (!laptop.getColor().equals(col)) 
                continue;
            if (laptop.getPrice() >= price) 
                continue;

            filtered.add(laptop);
        }
        System.out.println(filtered);
    }

}