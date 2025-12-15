package ex_ifcondition;

import java.util.Scanner;

public class Ex_If_elseif_else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year");
        int a=sc.nextInt();
        if (a%4==0){
            System.out.println("leap year");
        }else if(a%100==0){
            System.out.println("not a leap year");
        }
        else if(a%400==0){
            System.out.println("leap year");
        }
        else {
            System.out.println("Not a leap year");
        }

    }
}
