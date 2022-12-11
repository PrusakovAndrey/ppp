import java.lang.foreign.ValueLayout.OfShort;

public class Notebooks {
    
        /*
        Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. 
        Реализовать в java.
        Создать множество ноутбуков.
        Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации 
        и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
        “Введите цифру, соответствующую необходимому критерию:
        1 - ОЗУ
        2 - Объем ЖД
        3 - Операционная система
        4 - Цвет …
        Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры 
        фильтрации можно также в Map.
        Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. 
        */
    
    private String brand;
    private int memory;
    private int cache;
    private String os;
    private String color;
    private int price;
    public Notebooks(String brand, int memory, int cache, String os, String color, int price) {
        this.brand = brand;
        this.memory = memory;
        this.cache = cache;
        this.os = os;
        this.color = color;
        this.price = price;
    }
    
    public String getBrand() {
        return brand;
    }

    public int getMemory() {
        return memory;
    }

    public int getCache() {
        return cache;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setMemory(int memory) {
        this.memory = memory;
    }
    public void setCache(int cache) {
        this.cache = cache;
    }
    public String getOs() {
        return os;
    }
    public void setOs(String os) {
        this.os = os;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Notebooks [brand=" + brand + ", memory=" + memory + ", cache=" + cache + ", os=" + os + ", color="
                + color + ", price=" + price + "]";
    }
    
    
}



