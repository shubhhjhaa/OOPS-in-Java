package practice_11;
interface TvRemote{
   void SwitchOn();
   void SwitchOff();

}
class smartTvRemote implements TvRemote{
 public void SwitchOn(){
    System.err.println("Switch on");
  }
  public void SwitchOff(){
    System.out.println("Switch off");
  }

}
public class q5 {
    public static void main(String[] args) {
        
    }
}
