import java.util.*;
public class main{
  public static int factno(int a){
    int fac = 1;
    if(a==0||a==1){
      System.out.print("factorial is 1");
    }
    else if (a>1){
      for (int i=1;i<=a;i++){
        fac=fac*1;
      }
    }
    else{
      System.out.print("enter a valid no ");
    }
    return(fac);
  }
  public static void find_factorial(String[] args){
    Scanner sc = new scanner(system.in);
    System.out.print("enter no. for factorial : ");
    int a = sc.nextInt();
    System.out.print(factno(a));
  }
}
