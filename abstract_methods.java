// abstract class:- madam ek abstract class hai mere liye like...baki girls agar madam ki trah bnana chati hai then unko madam wali functionalities implememnt krna hi padega...
abstract class smartphone{
    abstract void SwitchOn();
    abstract void call();
    abstract void SwitchOff();
    abstract void Camera();
    // if any class extends from this abstract class then that class has to override all the methods present in the abstract class...and abstract class is like a templete or plan...jaise smartphone hai and uske andar kch basic functionalities hongi jo sb mein common hogi..and extended class iske alawa doosra methods bhi likh skti hai...
}
class vivoPhone extends smartphone{
  void SwitchOn(){
    System.err.println("vivoPhone Switch on ho rha hai");
  }
  void call(){
    System.err.println("calling");
  }
  void SwitchOff(){
    System.err.println("VivoPhone Switch off ho rha hai");
  }
  void Camera(){
    System.err.println("Camera ");
  }
}
public class abstract_methods {
    public static void main(String[]args){
  // We cannot create objects of abstract class.
  // smartphone s1= new smartphone(); // error
  vivoPhone v1=new vivoPhone();
  v1.SwitchOn();
  v1.call();
  v1.SwitchOff();
  v1.Camera();

    }
}
