package approver;

public class BeginsWithA<Elem> implements IsGood<Elem> {

    @Override
    public boolean isGood(Elem item) {
        if(((String) item).charAt(0) == 'a') return true;
        return false;
    }
    
}
