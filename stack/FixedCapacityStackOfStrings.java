package stack;

public class FixedCapacityStackOfStrings {
    private String[] s;
    private int N=0;
    public FixedCapacityStackOfStrings(int capacity){
        s = new String[capacity];
    }
    public boolean isEmpty(){return  N== 0;}
    public void push(String item){
        if(N== s.length) resize(2*s.length);
        s[N++] = item;
    }
    public String pop(){
        String item = s[--N];
        s[N] = null;
        if(N>0 && N==s.length/4) resize(s.length/2); //Array is between 25% and 100% full
        return item;
    }

    private void resize(int capacity){
        String[] copy = new String[capacity];
        for(int i=0; i<N; i++){
            copy[i] = s[i];
        }
        s=copy;
    }
}
