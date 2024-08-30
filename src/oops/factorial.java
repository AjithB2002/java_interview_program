package oops;

public class factorial {
    static int fact(int a){
             if(a==0)
                return 1;
             return (a*fact(a-1));
             
        }
    public static void main(String[] args) {
        int n=5;
       System.out.println(fact(n));
        // int n=5;
        // int f=1;
        // for(int i=1;i<=n;i++){
        //  f =f*i;    
        // }
        // System.out.println(f);  
    }
}
