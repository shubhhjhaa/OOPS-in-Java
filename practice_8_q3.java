import java.util.*;
class Square{
    Scanner obj=new Scanner(System.in);
   int side;
   void getSide(){
    System.err.println("Enter the side of the square : ");
    side=obj.nextInt();
   } 
   void area(){
       int areaf=side*side;
       System.err.println("Area : "+areaf);
   }
   void perimeter(){
    int peri=4*side;
    System.err.println("Perimeter : "+peri);
   }

}
public class practice_8_q3 {
    public static void main(String[]args){
    Square s1= new Square();
    s1.getSide();
    s1.area();
    s1.perimeter();
  }
}
