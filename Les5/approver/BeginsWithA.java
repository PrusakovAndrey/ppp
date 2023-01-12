package approver;

public class BeginsWithA<T> implements IsGood<T> {

    @Override
    public boolean isGood(T item) {
        if(((String) item).charAt(0) == 'a') return true;
        return false;
    }
    
}
