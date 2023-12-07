import java.util.*;
public class usebreak {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
      do{
        System.out.println("Enetr a number");
        int n=sc.nextInt();
        if(n%10==0){
            break;
        }
        System.out.println( "you have enter  " +n);
      }while(true);
    }
}
