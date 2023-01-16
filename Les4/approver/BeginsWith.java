package approver;

// BeginsWith — в конструкторе запоминает строку. 
// Ему дают строку, он проверяет, 
// что она начинается с того, что он запомнил

public class BeginsWith<Elem> implements IsGood<Elem> {
    private Elem str;
    
    public BeginsWith(Elem str){
        this.str = str;
    }
    
    @Override
    public boolean isGood(Elem text) {
        if( ((String) str).equals((String) text)){
            return true;
        }
        return false;
    }
    
}
