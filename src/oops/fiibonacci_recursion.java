package oops;


public class fiibonacci_recursion {

static void fibonacci (int x){
          int a =0,b=1;
          for(int i=0;i<=x;i++){
            System.out.print(a);
           int c=a+b;
             a=b;
             b=c;
          }
}
    public static void main(String[] args) {
        int n=10;
        fibonacci(n);
    }
}
