package approver;

// IsEven — ему дают целое число, он одобряет его, если оно чётное

class IsEven implements IsGood<Integer> {

    @Override
    public boolean isGood(Integer item) {
        return item % 2 == 0;
    }
}
 