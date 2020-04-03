package priorityqueue;

public class UnorderedMaxPQ <Key extends Comparable<Key>> {
    private Key[] pq; //pq[i] ith element on pq
    private int N; // number if elements on pq

    public UnorderedMaxPQ(int capacity){
        pq= (Key[]) new Comparable[capacity];
    }
    public boolean isEmpty(){
        return N == 0;
    }
    public void insert(Key x){
        pq[N++] = x;
    }
    public Key delMax(){
        int max= 0;
        for(int i=1; i<N; i++){
            if(less(max, i)) max = i;
            exch(max, N-1);
        }
        return pq[--N];
    }

    private void exch(int max, int i) {
        int te = max;
        max = i;
        i=te;
    }

    private boolean less(int max, int i) {
        return max<i;
    }

}
