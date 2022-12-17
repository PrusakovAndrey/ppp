package Les2.Les2Task1;

public abstract class Employee {
    public String position;
    public int salary;
    public String name;
    public abstract void work();
    public Employee(int salary, String position, String name){
        this.salary = salary;
        this.position = position;
    }

}
