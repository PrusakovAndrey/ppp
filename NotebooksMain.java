import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NotebooksMain {
    public static void main(String[] args) {

        userRequest();

        Notebooks Laptop1 = new Notebooks("HP", 8, 256, "Win", "Black", 580);
        Notebooks Laptop2 = new Notebooks("HP", 16, 256, "Win", "Black", 780);
        Notebooks Laptop3 = new Notebooks("HP", 32, 1028, "Win", "Black", 1080);
        Notebooks Laptop4 = new Notebooks("Dell", 4, 128, "Win", "Black", 630);
        Notebooks Laptop5 = new Notebooks("Dell", 8, 256, "Win", "Black", 800);
        Notebooks Laptop6 = new Notebooks("Dell", 32, 512, "Win", "Black", 800);
        Notebooks Laptop7 = new Notebooks("Apple", 16, 256, "Mac", "White", 1200);
        Notebooks Laptop8 = new Notebooks("Apple", 16, 512, "Mac", "Silver", 1450);
        Notebooks Laptop9 = new Notebooks("Apple", 32, 1028, "Mac", "Silver", 1590);
        Notebooks Laptop10 = new Notebooks("XXX", 8, 256, "No", "Black", 490);
        Notebooks Laptop11 = new Notebooks("XXX", 16, 1028, "No", "Silver", 610);
        Notebooks Laptop12 = new Notebooks("XXX", 8, 512, "No", "Black", 530);
        Notebooks Laptop13 = new Notebooks("Lenovo", 16, 256, "Win", "Black", 730);
        Notebooks Laptop14 = new Notebooks("Lenovo", 16, 256, "Win", "White", 730);
        Notebooks Laptop15 = new Notebooks("Lenovo", 16, 512, "Win", "Black", 915);
        // System.out.println(Laptop15);
    }

    public static void userRequest() {
        Map<String, Integer> req = new HashMap<>();
        int x = 0;
        Scanner request = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую необходимому критерию:" + "\n" + "ОЗУ:" + "\n" + "4Гб  - 1"
                + "\n" + "8Гб  - 2" + "\n" + "16Гб - 3" + "\n" + "32Гб - 4");
        String userInput1 = request.nextLine();
        switch (userInput1) {
            case "1":
                x = 4;
                break;
            case "2":
                x = 8;
                break;
            case "3":
                x = 16;
                break;
            case "4":
                x = 32;
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
                x = 128;
                break;
            case "2":
                x = 256;
                break;
            case "3":
                x = 512;
                break;
            case "4":
                x = 1028;
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
                x = 1;
                break;
            case "2":
                x = 2;
                break;
            case "3":
                x = 3;
                break;
            default:
                break;
        }
        req.put("os", x);
        // 4 - Цвет … ");

        System.out.println("Цвет : " + "\n" + "Черный  - 1"
        + "\n" + "Белый  - 2" + "\n" + "Серебрянный  - 3");
String userInput4 = request.nextLine();
switch (userInput4) {
    case "1":
        x = 1;
        break;
    case "2":
        x = 2;
        break;
    case "3":
        x = 3;
        break;
    default:
        break;
}
req.put("color", x);

System.out.println("Введите максимальную цену : ");
String maxPrice = request.nextLine();

        System.out.println(req.get("memory"));
        System.out.println(req.get("cache"));
        System.out.println(req.get("os"));
        System.out.println(maxPrice);
    }
}
