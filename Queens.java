import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Queens {

    public static void main(String[] args) {
        perebor(1);
        }

        public static void perebor(int x) {
            Map<Integer, Integer> positions = new HashMap<>();
            positions.put(1,1);
            positions.put(1,2);
            positions.put(1,3);
            positions.put(1,4);
            positions.put(1,5);
            positions.put(1,6);
            positions.put(2,1);
            positions.put(2,2);
            positions.put(2,3);
            positions.put(2,4);
            positions.put(2,5);
            positions.put(2,6);
        int s = 9;
        // if(positions.containsKey(s)) System.out.println("Error");
        // else System.out.println("Good");
        if(positions.containsValue(s)) System.out.println("Error");
        else System.out.println("Good");

    }
}