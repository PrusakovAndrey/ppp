package ClassWork.data;

public class Teacher extends User{
    private String Subject;

    public Teacher(String name, String password, String subject) {
        super(name, password);
        Subject = subject;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    @Override
    public String toString() {
        return super.toString() + "," + Subject;
    }
    
}
