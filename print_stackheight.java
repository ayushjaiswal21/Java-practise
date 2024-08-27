public static int calcpower(int x ,int n){
  // base case
  if (x==0){
    return 0;
  }
  if(n==0){
    return 1:
  }
  // main work
  int power1=calcpower(x,n-1);
  int power=x*power;
}
public static void main (Strin args[]){
  int x=2;
  int n=5;
  int ans =calcpower(x,n);
  System.out.print(ans);
}
