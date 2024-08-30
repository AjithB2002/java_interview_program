package oops;

public class stack {
    int s[] = new int[10];
    int tos;

    stack() {             //constructor
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("stack is full");
        } else {
            // tos=tos+1;
            // s[tos]=item;
            s[++tos] = item;
        }

    }

    int pop(){
        if (tos>=0) {
            return s[tos--];
        }
        else{
            System.out.println("stack is empty");
            return -1;
        }
    }
}
