class base{
    public base(){
        System.err.println("I am a constructor of base class");
    }
    // constructor overloading..
   public base(int a){
    System.err.println("I am a constructor of base class with value of a as : "+a);
   }
}
class derieved extends base{
    public derieved(){
        // super keyword ka use krenge to call parametrized constructor..
        super(10);
        System.err.println("I am a constructor of derieved class");
    }
}
public class Constructor_inheritence {
    public static void main(String[]args){
    derieved d1= new derieved();
    }
}
