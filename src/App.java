public class App {


    public static void method(){
        System.out.println("hii");
    }

    public static int add(int a,int b){
       return a+b;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        method();
        int c =add(2,3);
        System.out.println(c);
    }
}
