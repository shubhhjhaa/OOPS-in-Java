class Mythr extends Thread{
    public void run(){
        System.out.println("I am chatting with her.");
    }
}
class Mythr1 extends Thread{
    public void run(){
        System.out.println("I am cooking maggie.");
    }
}
public class threads {
    public static void main(String[]args){
        Mythr t1= new Mythr();
        Mythr1 t2= new Mythr1();
        t1.start();
        t2.start();

    }
}
