package oops;

 class box{
      int length;
      int breath;
      int height;


 box(int l ,int b, int h){
    this.length = l;
    this.breath = b;
    this.height = h;
}

boolean isEqual(box b){
    if (length==b.length && breath ==b.breath && height==b.height) 
        return true;

     return false;   
    
}

}


public class object_passing {
    public static void main(String[] args){
           box blackbox = new box(1, 2, 3);
           box b1 = new box(1, 2, 3);  
           System.out.println();
          
           System.out.println( blackbox.isEqual(b1));
           
    }
}
