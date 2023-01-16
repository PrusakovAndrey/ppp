package approver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Создайте интерфейс IsGood<T>. Внутри него содержится единственная функция:
boolean isGood (T item);

Создайте следующие детские классы:
IsEven — ему дают целое число, он одобряет его, если оно чётное
IsPositive — ему дают целое число, он одобряет его, если оно положительное
BeginsWithA — ему дают строку, он одобряет её, если она начинается с буквы A
BeginsWith — в конструкторе запоминает строку. Ему дают строку, он проверяет, что она начинается с того, что он запомнил

Создайте обобщённую функцию filter. Ей дают любую коллекцию любого типа, и одобрятель IsGood. Функция возвращает новую коллекцию, куда входят только одобренные элементы из коллекции.
 */

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,-4,2,-5,7,29,6);
        
        IsGood<Integer> isEven = new IsEven();
        Iterable<Integer> evenNumbers = filter (numbers,isEven);
        for (Integer number: evenNumbers) 
            System.out.println(number);
            
            System.out.println("\n");

        IsGood<Integer> isPositive = new IsPositive();
        Iterable<Integer> positiveNumbers = filter(numbers, isPositive);
        for (Integer number : positiveNumbers)
        System.out.println(number);
    }

private static <Elem> Iterable<Elem> filter (Iterable<Elem> collection, IsGood<Elem> isGood){
    List<Elem> filtered = new ArrayList<>();
    for (Elem elem : collection ) 
        if (isGood.isGood(elem))
        filtered.add(elem);
    
    return filtered;
}

}
