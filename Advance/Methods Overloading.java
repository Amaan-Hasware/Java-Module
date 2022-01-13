package com.codus;

public class Main {
    //Example Method ↓
    //static int logic()
    // Also we use the keyword static while creating a method so that the method gets created for that class and not
    // for the object of the class.
    // Static methods is shared by  all the objects of the class.
     static int STATIC (int a, int b){
        int c= a+ b;
        System.out.println(c);
        return c;
    }

    // If u don't want anything to return when ur method runs, we use the help of the keyword void return
    static void joke(){
        System.out.println("Jokey Haha");
    }

    static void change(int a){
        a= 101;
    }

    static void change2(int [] arr){
        arr[0]=101;
    }

    static void foo(){
        System.out.println("Good Morning Bro");
    }

    static void foo(String a ){
        System.out.println("Good Morning "+ a);
    }
    static void foo(String a , String b ){
        System.out.println("Good Morning "+ a);
        System.out.println("Good Morning "+ b);
    }
    static void foo(String a , String b , String c){
        System.out.println("Good Morning "+ a);
        System.out.println("Good Morning "+ b);
     }
    static void str(String a){
        System.out.println(a);
    }
     static void str(String a, String b){
         System.out.println(a+b);
     }





    public static void main(String[] args) {
    STATIC(1,2);
    // Here we have called out a method that was already defined in the main class of the code
    joke();
    //Case 1: Changing the integer using method
    int x=45;
    change(x);
    System.out.println("The value after changing is "+x);
//    here the value of x is copied into the method but the actual value has not been changed
//    let's try the same for Array
        // Case 2: Changing the Array
        // we have created a method which will try to manipulate the value of the Array
        int [] marks={52,73,77,89,98,94};
        change2(marks);
        System.out.println("The value after changing is "+marks[0]);
        // Array's value can be manipulated with method

//      Method Overloading means that Two or more methods can have same name but different parameters. Such methods
//      are called as Method Overloading
        foo("Rabia", "Amaan", "Hasware");
        foo("Amaan","Ammo");
        str("Amaan");
    }
}
