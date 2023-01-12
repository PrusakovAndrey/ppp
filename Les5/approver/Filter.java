package approver;

public static <T>Iterable<T> Filter(Iterable<T> collection, IsGood<T> approver) {
    
    Collection<T> result = new LinkedList<T>();

    for (T t: collection){
        if (approver.isGood(t)){
            result.add(t);
        }
    }
    return (Iterable<T>)result;

}
