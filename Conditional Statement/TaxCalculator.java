import java.util.*;
public class TaxCalculator {
    public static void main(String args[]){
    System.out.println("Enter your income");
     Scanner sc=new Scanner(System.in);
     int income=sc.nextInt();
     int tax;
     if(income<500000){
        System.out.println(" Your tax is O");
     }else if(income<1000000 && income>=500000){
        tax=(int) (income * 0.2);
        System.out.println("your tax is " + tax);
     }else{
        System.out.println(tax=(int)(income * 0.3));
     }
    //  System.out.println("Your income is:" +tax);
    }
    
}
