package approver;

// IsEven — ему дают целое число, он одобряет его, если оно чётное

public class IsEven<T> implements IsGood<T> {

    @Override
    public boolean isGood(T item) {
        if (item instanceof Integer){
            if ((Integer)item % 2 == 0){
                return true;
            }
        }
        return false;
    }
}
