import java.util.*;
public class Display {
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
  System.out.println("Enter a number");
  int n=sc.nextInt();
  for( int i=1;i<=n;i++){
    if(n%10==0){
        continue;
    }
    System.out.println(i);
   }
}
}
  
