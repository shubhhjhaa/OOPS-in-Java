package practice_11;
abstract class TelePhone{
   abstract void ring();
  abstract  void lift();
   abstract void disconnect();
}
class smartTelephone extends TelePhone{
    void ring(){
        System.err.println("Ringing");
    }
   void lift(){
     System.err.println("call connected");
    }
    void disconnect(){
        System.err.println("call disconnected");
    }
    void Game(){
        System.out.println("playing game");
    }
}

public class q4 {
    public static void main (String[]args){
        // you can understand polymorphism with the help of an smartphone like smartphone has several methods in it. Camera , gps, media player etc. and in polymorphism if you take camera as a refrence and create smartphone object then you can use only camera methods..
        TelePhone t1 = new smartTelephone();
        t1.ring(); // Ypu can use all the methods present under telephone class
        // t1.Game() // error 
    }
}
