class cellPhone{
    void ring(){
        System.err.println("Ringing..");
    }
    void Vibrate(){
        System.err.println("Vibrating...");
    }
}
public class practice_8_q2 {
    public static void main(String[]args){
     cellPhone c1= new cellPhone();

     c1.ring();
     c1.Vibrate();
}
}