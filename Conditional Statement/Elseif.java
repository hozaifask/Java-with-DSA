import java.util.*;


public class Elseif {
    int a=19;
    int age=a;
    public static void main(String args[]) {
            int age=17;
        if(age>=18){
            System.out.println("Adult");
        }else if(age<18 && age>13){
            System.out.println("Tenagers");
        }else{
            System.out.println("Child");
        }
        
    }
    
}
