package Les4;

/*
Класс Группа содержит в себе коллекцию Студентов. По группе можно перемещаться с помощью итератора. 
(Это повторяет 1-ю задачу из классной работы). Остальные задачи надстраиваются поверх неё.
Создайте класс GroupListIterator, который позволяет перемещаться по группе в обоих направлениях. 
Он реализует интерфейс ListIterator<Student>.
Добавьте в Группу метод listIterator (), который позволяет начать итерацию с помощью GroupListIterator.
Создайте класс ReverseIterator, который работает как итератор по группе в обратном направлении:
• Он отслеживает текущую позицию в переборе
• Он изначально выставлен на конечную позицию
• Он движется справа налево
Проверьте, как он работает.
 */

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        
        list.add("qwe");
        list.add("asd");
        list.add("zxc");
        
        Iterator<String> it = list.descendingIterator(); 
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
