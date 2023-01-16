package approver;

// IsPositive — ему дают целое число, он одобряет его, если оно положительное

public class IsPositive implements IsGood<Integer> {

    @Override
    public boolean isGood(Integer item) {
        return item > 0;
    }
    
}
