package com.codus;

import java.util.Scanner;

public class Main {
//Recursion:- A Function can call itself. Such calling of function by itself is called Recursion
//    Factorial(0)=1
//    factorial(n) = n * n-1*.....1
//    factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
//    factorial(n) = n*factorial(n-1)
    static int factorial(int a){
        if (a==1 || a==0){
            return 1;
        }
        else{
            return a * factorial(a-1);
        }
    }
    static int iterative(int a){
        if (a==1 || a==0){
        return 1;
        }
        else{
            int product=1;
            for(int i=1;i<=a;i++){
                product =product*i ;
            }
            return product;
        }
    }
//    static int fibo(int a) {
//        int ex = 0;
//
//        for (int i = 1; i <= a; i++) {
//            ex=ex+i;
//            return ex;
//        }
//        return ex;
//    }


    public static void main(String[] args) {
//        System.out.println("The Factorial of 5 is ");
//        int f = factorial(5);
//        System.out.println(f);

//        To take a user input
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your number: ");
//        int i = input.nextInt();
//        System.out.println("The Factorial of " + i + " is ");
//        int b = factorial(i);
//        System.out.println(f);

//      Iterative Approach (For loop)
        int a=iterative(5);
        System.out.println(a);

//        int b=fibo(5);
//        System.out.println(b);
        }


    }



