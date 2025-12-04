package practice_11;
interface basicAnimal{
    void eat();
    void sleep();
}
class Monkey{
    void jump(){
     System.err.println("jump");
    }
    void bite(){
     System.err.println("bite");
    }
}
class human extends Monkey implements basicAnimal{
  public void eat(){
    System.err.println("Humans can eat as animal do");
  }
  public void sleep(){
    System.err.println("Humans can sleep as animal do");
  }
}
public class q3 {
   public static void main(String[]args){
    human h1= new human();
    h1.eat();
    h1.sleep();
    h1.bite();
    h1.jump();
   } 
}
