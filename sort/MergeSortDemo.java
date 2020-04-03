package sort;

public class MergeSortDemo {

    private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi){
        assert isSorted(a, lo, mid);
        assert isSorted(a, mid+1, hi);
        int i=lo, j=mid+1;
        for(int k=lo; k<=hi; k++){
            if(i>mid) a[k] = aux[j++];
            else if(j>hi) a[k] = aux[i++];
            else if(less(aux[j], aux[i])) a[k]=aux[j++];
            else a[k] = aux[i++];
        }
        assert isSorted(a, lo, hi);
    }
    public static void merge(Comparable[] a, int lo, int mid, int hi){
        Comparable[] aux = new Comparable[a.length];
        merge(a, aux, lo, mid, hi);
    }
    private static void sort(Comparable[] a, Comparable[]aux, int lo, int hi){
        if(hi<=lo) return;
        int mid = lo +(hi-lo)/2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid+1, hi);
        merge(a, aux, lo, mid, hi);
    }
    public static void sort(Comparable[] a){
        Comparable[] aux = new Comparable[a.length];
        sort(a, aux, 0, a.length-1);
    }

    public static void bottomUpSort(Comparable[] a){
        int N = a.length;
        for(int sz=1; sz<N; sz=sz+sz){
            for(int lo=0; lo<N-sz; lo+=sz+sz){
                merge(a, lo, lo+sz-1, Math.min(lo+sz+sz-1, N-1));
            }
        }
    }

    private static boolean less(Comparable aux, Comparable aux1) {
        return aux.compareTo(aux1)< 0 ;
    }

    private static boolean isSorted(Comparable[] a, int lo, int mid) {
        for(int i=lo; i<mid; i++){
            if(!less(a[i],a[i+1])) return false;
        }
        return true;
    }

    public static void main(String[]args){
        Comparable[] a = {1,5,8,9,12,3,5,6,8,9};
        Comparable[] res = new Comparable[9];
        merge(res,a, 0,4,8);
        for(Comparable k : res){System.out.print(" "+k);}
    }
}
