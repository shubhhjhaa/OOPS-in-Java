import java.util.*;
class Cylinder{
    Scanner obj=new Scanner(System.in);
    float radius;
    float height;
    void setRadius(){
        System.err.println("Enter the radius : ");
        radius=obj.nextFloat();
    }
    void setHeight(){
        System.err.println("Enter the Height : ");
        height=obj.nextFloat();
    }
    void getRadius(){
        System.err.println("Radius : "+radius);
        
    }  
    void getHeight(){
        System.err.println("Height : "+height);
        
    }
    void surfaceArea(){
        double formula= 2*Math.PI*radius*(radius+height);
        System.err.println("Surface Area : "+formula);
    }
    void Volume(){
        double formula1=Math.PI*radius*radius*height;
        System.err.println("Volume : "+formula1);
    }
}
public class practice_9_q1 {
    public static void main(String[]main){
    Cylinder c1= new Cylinder();
    c1.setRadius();
    c1.setHeight();
    c1.Volume();
    c1.surfaceArea();
    }
}
