package collection;
import java.util.*;

/**
 * ArrayList
 */
public class Arraylist {

    public static void main(String[] args) {
        
        int a[]  = new int[5];
        ArrayList<Integer> alist = new ArrayList<Integer>();
        
        for(int i=1;i<=5;i++){
            alist.add(i);
        }
        System.out.println(alist);

        alist.add(100);
        alist.add(100);
        alist.set(3,50);  
        System.out.println(alist);
        System.out.println(alist.get(3));
        System.out.println(alist.contains(100));

       //Interator
        for(int e:alist){
            System.out.println(e + ",");
        }
        Iterator<Integer> e = alist.iterator();
        System.out.println("using iterator");
        while(e.hasNext()){
            System.out.println(e.next());
        }

        ArrayList<String> slist = new ArrayList<String>();
        slist.add("ajith");
        System.out.println(slist);

    }
}