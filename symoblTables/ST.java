package symoblTables;

public class ST<Key extends Comparable<Key>,Value> {

    Value[] vals;
    Comparable[] keys;
    private int N;

    public void put(Key key, Value value){}
    public Value get(Key key){
      if(isEmpty()) return null;
      int i = rank(key);


        if(i<N &&  keys[i].compareTo(key) == 0) return vals[i];
      else return null;
    }

    private int rank(Key key) {
        int lo=0, hi = N-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            int cmp = key.compareTo((Key) keys[mid]);
            if(cmp<0) hi = mid-1;
            else if(cmp>0) lo=mid-1;
            else if(cmp == 0) lo = mid+1;
        }
        return lo;
    }

    public void delete(Key key){
        put(key, null);
    }

    public boolean contains(Key key)
    {
        return (get(key) != null);
    }
    public boolean isEmpty(){
        return true;
    }
    public int size(){
        return N;
    }

}
