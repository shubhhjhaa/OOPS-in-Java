import java.util.*;
class employee{
Scanner obj=new Scanner(System.in);
    private int salary;
    private String name;
    public void setName(){
  System.err.println("Enter Your Name : ");
  name=obj.nextLine();
    }
    void getName(){
        System.out.println("Name : "+name);
    }
    public void getSalary(){
     System.err.println("Enter your salary : ");
     salary=obj.nextInt();
     System.err.println("Salary : "+salary);

    }

}
public class practice_8_q1 {
    public static void main(String[]args){
   employee e1= new employee();
   e1.setName();
   e1.getName();
   e1.getSalary();

    }
}
