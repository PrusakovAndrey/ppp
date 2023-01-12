public class Main{ 
 public static void main(String[] args) {

    Integer[] n = {1,4,3,6,3,91};
    MyCollection<Integer> col1 = new MyCollection<Integer>(n);
    System.out.println(col1);
    System.out.println(col1.get(2));
    col1.set(99,1);
    System.out.println(col1);
    System.out.println(col1.size());
    col1.add(13);
    System.out.println(col1);


    }
}