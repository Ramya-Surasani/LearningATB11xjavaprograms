package ex_01_java_variable;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        System.out.println("Enter no");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        if(n<=0){
            System.out.println(fact);
        }else
            for (int i=1;i<=n;i++){
                fact=fact*i;
            }
        System.out.println("Factorial is:"+fact);
    }


}
