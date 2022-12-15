package Laptops;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Userchoice {
    
    public static void userRequest() {
        Map<String, String> req = new HashMap<>();
        String x = null;
        Scanner request = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую необходимому критерию:" + "\n" + "ОЗУ:" + "\n" + "4Гб  - 1"
                + "\n" + "8Гб  - 2" + "\n" + "16Гб - 3" + "\n" + "32Гб - 4");
        String userInput1 = request.nextLine();
        switch (userInput1) {
            case "1":
                x = "4";
                break;
            case "2":
                x = "8";
                break;
            case "3":
                x = "16";
                break;
            case "4":
                x = "32";
                break;
            default:
                break;
        }
        req.put("memory", x);

        System.out.println("Жесткий диск : " + "\n" + "128Гб  - 1"
                + "\n" + "256Гб  - 2" + "\n" + "512Гб  - 3" + "\n" + "1028Гб - 4");
        String userInput2 = request.nextLine();
        switch (userInput2) {
            case "1":
                x = "128";
                break;
            case "2":
                x = "256";
                break;
            case "3":
                x = "512";
                break;
            case "4":
                x = "1028";
                break;
            default:
                break;
        }
        req.put("cache", x);

        System.out.println("Операционная система : " + "\n" + "Windows  - 1"
                + "\n" + "Mac Os  - 2" + "\n" + "Without OS  - 3");
        String userInput3 = request.nextLine();
        switch (userInput3) {
            case "1":
                x = "Win";
                break;
            case "2":
                x = "Mac";
                break;
            case "3":
                x = "No";
                break;
            default:
                break;
        }
        req.put("os", x);

        System.out.println("Цвет : " + "\n" + "Черный  - 1"
                + "\n" + "Белый  - 2" + "\n" + "Серебрянный  - 3");
        String userInput4 = request.nextLine();
        switch (userInput4) {
            case "1":
                x = "Черный";
                break;
            case "2":
                x = "Белый";
                break;
            case "3":
                x = "Серебрянный";
                break;
            default:
                break;
        }
        req.put("color", x);

        System.out.println("Введите максимальную цену : ");
        String maxPrice = request.nextLine();
        req.put("price",maxPrice);
        
    }

}
