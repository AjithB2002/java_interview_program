package oops;

class box {                //class
    int length;
    int breath;
    int height;


box(int l , int b, int h){        //constructor
      this.length = l;
      this.breath = b;
      this.height = h;
}

int volume(){                                   //method
       return length*breath*height;
}

boolean isEqual(box b){
    if (length==b.length && breath ==b.breath && height==b.height) 
        return true;

     return false;   
    
}


}
public class method3 {
    public static void main(String[] args) {

              box blockbBox = new box(1,2,3);
              box whitebBox = new box(2,4,5);        //object
              System.out.println(blockbBox.volume());
              System.out.println(blockbBox.isEqual(whitebBox));
    }
    
}

