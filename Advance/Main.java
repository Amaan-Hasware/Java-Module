package com.codus;

import java.util.Scanner;

public class Main {
    static int logic(int x, int y){
        int z;
        if (x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter String: ");
//        String input = scan.nextLine();
//        System.out.println(input);

        Scanner logic = new Scanner(System.in);
        System.out.println("Enter The Number 1 :");
        int Num1 = logic.nextInt();
        System.out.println("Enter The Number 2 :");
        int Num2 = logic.nextInt();

        int f=logic(Num1,Num2);
        System.out.println(f);
    }
}
