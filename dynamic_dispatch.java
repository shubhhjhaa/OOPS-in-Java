// Dynamic method dispatch
class cellPhone{
    void SwitchOn(){ // m1
        System.err.println("Switch On");
    }
    void SwitchOff(){ // m2 
        System.err.println("Switch Off");
    }
}
class smartphone extends cellPhone{
    void SwitchOn(){
        System.err.println("Smartphone Switch On ho rha hai");
    }
void playMusic(){
    System.err.println("Playing song");
}
}
public class dynamic_dispatch {
public static void main(String[]args){
 // super = sub 
 cellPhone c1= new smartphone(); // cellPhone ka ref and smartPhone class ka object bnaya hai..and here cellphone class ke sare methods ko tm use kr skte ho but smartphone class ke sirf whi methods tm use kr skte ho jinhe tm override ke kr rhe ho from super class
 c1.SwitchOn();
 c1.SwitchOff();
//  c1.playMusic(); // error
}
    
}