package oops;

public class varArgsDemo {

    static int minValue(int... vals){
           int min = Integer.MAX_VALUE;
           for(int k: vals){
            min=k;
           }
           return min;
    }
    public static void main(String[] args) {
        int m = minValue(4,23,1,5);
        System.out.println(m);
        int n= minValue(null);
System.out.println(n);

    }
}
