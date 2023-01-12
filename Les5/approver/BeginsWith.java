package approver;

// BeginsWith — в конструкторе запоминает строку. 
// Ему дают строку, он проверяет, 
// что она начинается с того, что он запомнил

public class BeginsWith<T> implements IsGood<T> {
    private T str;
    
    public BeginsWith(T str){
        this.str = str;
    }
    
    @Override
    public boolean isGood(T text) {
        if( ((String) str).equals((String) text)){
            return true;
        }
        return false;
    }
    
}
