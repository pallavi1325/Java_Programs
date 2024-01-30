package Java;
import java.util.*;
public class Function {
    int r = 9;
    int v = 4;
   Function(){
       System.out.println("Constructor Called");
   }
   void callFunction(){
       System.out.println("Function Called");
   }
   void add(int a, int b){
       int c= a+b;
       System.out.println("Addition of " + a + " and " + b +" is " + c);
   }
   int mul(int p, int q){
       return  p*q;
   }
    public static void main(String[] args){
       int x , y;
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two numbers for addition : ");
       x = sc.nextInt();
       y = sc.nextInt();
        Function f = new Function();
        f.callFunction();
        //f.add(6,7);
        f.add(x , y);
        System.out.println("Multiplication of "+ f.r+ " and "+ f.v+ " is "+ f.mul(f.r, f.v));
    }
}
