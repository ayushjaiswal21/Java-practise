//patern1
import java.util*;
public class pattern{
  public static void main(String args[]){
    int n=4;
    int m=5;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=m:;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

//patern2
public class pattern{
  public static void main(String args[]){
    int n=4;
    int m=5;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=m:;j++){
        if(i==a||i==1){
          System.out.print("*");
        }else if (j==b||j==1){
          System.out.print("*");
        }else{
          System.out.print(" ");
        }
      }
    System.out.println();
    }
  }
}
//patern3

public class pattern{
  public static void main(String args[]){
    int m=5;
    for(int i=1;i<=m;i++){
      for(int j=1;j<=i:;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

//pattern 4
public class pattern{
  public static void main(String args[]){
    int n=4;
    for(int i=n;i>=1;i--){
      for(int j=1;j<=i:;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

//pattern5
public class pattern{
  public static void main(String args[]){
    int n=4;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n-i:;j++){
        System.out.print("");
      }
      for(int k=1;k<=i:;k++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

//pattern6
public class pattern{
  public static void main(String args[]){
    int n=4;
    for(int i=1;i<=n1;i++){
      for(int j=1;j<=i:;j++){
        System.out.print(j);
      }
      System.out.println();
    }
  }
}

//pattern7
public class pattern{
  public static void main(String args[]){
    int n=4;
    for(int i=i;i<a-i+1;i++){
      for(int j=1;j<=i:;j++){
        System.out.print(j);
      }
      System.out.println();
    }
  }
}

//pattern8
public class pattern{
  public static void main(String args[]){
    int m =5;
    int n=1;
    for(int i=1;i<m;i++){
      for(int j=1;j<=i:;j++){
        System.out.print(n);
        b++;
      }
      System.out.println();
    }
  }
}

//pattern9
public class pattern{
  public static void main(String args[]){
    int n=5;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i:;j++){
        if(i+j)%2==0){
          System.out.print("1");
        }
        else{
          System.out.println("0")
        }
      }
    }
  }
}

//pattern 10 (butterfly pattern)
public class pattern{
  public static void main(String args[]){
    int n=4;
    for(int i=1;i<n;i++){
      for(int j=1;j<=i:;j++){
        System.out.print("*");
      }
      int space = 2*(n-i);
      for(int j=1:j<=space;j++){
        System.out.print(" ");
      }
      for(int j=1:j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  for(int i=n;i>=1;i--){
    for(int j=1;j<=i:;j++){
      System.out.print("*");
    }
      int spaces = 2*(n-i);
      for(int j=1:j<=spaces;j++){
        System.out.print(" ");
      }
      for(int j=1:j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
    }    
  }
}

//pattern 11 solid rhombus
public class pattern{
  public static void main(String args[]){
    int n=5;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n-1:;j++){
          System.out.print(" ");
        }
      for(int j=1;j<=5:;j++){
          System.out.print("*");
        }
       System.out.println();
      }
    }
  }

//pattern 12

public class pattern{
  public static void main(String args[]){
    int n=5;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n-1:;j++){
          System.out.print(" ");
        }
      for(int j=1;j<=i:;j++){
          System.out.print(i+" ");
        }
       System.out.println();
      }
    }
  }
