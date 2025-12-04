package Pr1;

import java.util.Scanner;

public class C2SWITCH {
    public static void main(String[] args) {
        Scanner OB= new Scanner(System.in);
        System.out.println("ENTER DAY 1TO 7");
        if (OB.hasNextInt()){
            int DAY= OB.nextInt();
            switch (DAY){
            case 1:
                System.out.println("Monday");
                break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                default:
                    System.out.println("FOOL INTEGER ONLY");
            }
        }else {
            System.out.println("ENTER INT ONLY");
        }


    }
}
