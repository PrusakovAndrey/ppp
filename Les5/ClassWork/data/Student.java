package ClassWork.data;

public class Student extends User{
    private String department;
    private Integer group;
    private Integer year;
    
    public Student(String name, String password, String department, Integer group, Integer year) {
        super(name, password);
        this.department = department;
        this.group = group;
        this.year = year;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString() + "," + department + "," + group + "," + year;
    }
    
    }

