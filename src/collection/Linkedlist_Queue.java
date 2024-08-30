package collection;
import java.util.*;

public class Linkedlist_Queue {
    public static void main(String[] args) {
        LinkedList<Integer> alist = new LinkedList<Integer>();


        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println("Head is" +q.peek());  //check the head
        System.out.println("remove is" +q.poll()); //removw firest element
        System.out.println("Head is" +q.peek());
       
      

        //Sorting and stored or order to store
       PriorityQueue<Integer> p = new PriorityQueue<Integer>();
       p.add(5);
       p.add(6);
       p.add(7);
       p.add(8);
       System.out.println("Head is" +p.peek());  //check the head
       System.out.println("remove is" +p.poll()); //removw firest element
       System.out.println("Head is" +p.peek());

    }
}
