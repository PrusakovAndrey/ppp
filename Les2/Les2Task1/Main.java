package Les2.Les2Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> company = new ArrayList<>();
        company.add(new DesignerEmployee());
        company.add(new DesignerEmployee());
        company.add(new DesignerEmployee());
        company.add(new ProgrammerEmployee());
        company.add(new ProgrammerEmployee());
        company.add(new ProgrammerEmployee());
    
        for (Employee employee : company) {
            employee.work();
        }
    
    }
    

}
