package practice_11;
abstract class pen{
    abstract void write();
    abstract void refill();
}
class FountainClass extends pen{
    void write(){
        System.err.println("Writing");
    }
    void refill(){
        System.err.println("refill");
    }
    void changeNib(){
        System.err.println("Change Nib");
    }

}
public class q2 {
    
}
