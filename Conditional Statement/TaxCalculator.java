import java.util.*;
public class TaxCalculator {
    public static void main(String args[]){
    System.out.println("Enter your income");
     Scanner sc=new Scanner(System.in);
     int income=sc.nextInt();
     int tax;
     if(income<500000){
         tax=0;
     }else if(income<1000000 && income>=500000){
        tax=(int) (income * 0.2);
     }else{
       tax=(int)(income * 0.3);
     }
     System.out.println("Your income is:" +tax);
    }
    
}
