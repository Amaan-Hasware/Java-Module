package com.codus; // codus = Coding With Asus

import java.util.Scanner;   // header file for taking user input (Not necessary to write right now, it will come
                            // automatically when you start "Taking user input" phase below)

public class Main {

    static int sum(int f, int m) {           //↑
        // Used in methods phase  (You will see in last)
        // We created a method to get mean so that we dont have to write entire
        // code again n again
        return f + m;                         //↓
    }

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World");

    /* ********************************* Variables: **************************************
    How to declare a variable:
        Syntax: <DataType> <VariableName> = <Value>;
    */
        String Amaan = "Productivity";
        System.out.println(Amaan);

        int a = 45;
        float pi = 3.14f; //(NOTE IN FLOAT U NEED TO PUT F AFTER THE VALUE AND D FOR DOUBLE )
        System.out.println(a);
        System.out.println(pi);

        boolean IsAdult = false;
        System.out.println(IsAdult);


/*        Rules for creating a variable:
            can contain digits , underscores, Dollar Signs, Letters
            Should begin with a letter, $ or _
            Should not contain whitespaces
            you cannot use reserved keywords from Java
 */
        // ******************* Java Data Types ******************************
/*
          Two Types of Java Data Types:
          1. Primitive Data Type - byte(1 byte), short(2 byte), long(8 byte), int (4 byte), float (4 byte),
             Double(8 byte), Boolean(1 bit)
          2. Non-Primitive or Reference Data Type
//*/
        byte u = -56;
        double d = 49.36;
        System.out.println(u);
        System.out.println(d);
        char grade = 'A';
        System.out.println(grade);

/*
        // ******************* Operators In Java ******************************
        Operand, Operator, Operand

        Operand, Operator, Operand   Result
           7         +        7     =  14
           and many many others but as they were basic , I Did not include
*/
        // ******************* Taking User input in Java *************************
        Scanner scan = new Scanner(System.in); // Here by typing the Keyword Scanner , it will create a header file
        // automatically at the start of the code ( I mentioned above earlier)
        System.out.println("Enter String: ");

        String input = scan.nextLine();
        System.out.println(input);

        System.out.println("Enter Age: ");
        int Age = scan.nextInt();
        System.out.println(Age);

        // ******************* String Methods *************************
        String name = "Amaan";
        String reference = "Believer Of Fitness";
        System.out.println(name + " from \"" + reference + "\"");

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        // To find out whether the string contains the following characters or not
        System.out.println(name.contains("ma"));

        // To find out index positions of the characters Or characters at index positions
        System.out.println(name.charAt(2));

        // To find out index positions of the characters Or characters at index positions
        System.out.println(name.endsWith("an"));

//
        // To find out index positions of the characters Or characters at index positions
        System.out.println(name.indexOf("maan"));


//    ********************************* Math Class *********************************
        int numb1 = 7, numb2 = 4;
        System.out.println(Math.max(numb1, numb2));
        System.out.println(Math.min(numb1, numb2));
        System.out.println(Math.sqrt(36));
        System.out.println(Math.sqrt(numb2));

        //        abs function will give us always positive values
        System.out.println(Math.abs(-11));
        System.out.println(Math.abs(11));

//      Math.random will give random values
        System.out.println(Math.random());

//   ********************* Conditional Statements *********************
        System.out.println("Enter your Age");
        int age = scan.nextInt();
//
        if (age > 18) {
            System.out.println("As your age is " + age + " You are Adult");
        } else if (age == 18) {
            System.out.println("You're age is 18");
        } else {
            System.out.println("As your age is " + age + " You are not an Adult");
        }

//   ********************* Switch Statements *********************
        switch (age) {
            case 12:
                System.out.println("You are 12 years old");
                break;
            case 18:
                System.out.println("You are 18 years old");
                break;
            default:
                System.out.println("You did not match any of the cases");
        }

//  ****************************** QUIZ *****************************
//  Write a code to print Sunday - Saturday based on number taken via user input
        Scanner olx = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = scan.nextInt();
        if (number == 1) {
            System.out.println("Sunday");
        } else if (number == 2) {
            System.out.println("Monday");
        } else if (number == 3) {
            System.out.println("Tuesday");
        } else if (number == 4) {
            System.out.println("Wednesday");
        } else if (number == 5) {
            System.out.println("Thursday");
        } else if (number == 6) {
            System.out.println("Friday");
        } else if (number == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("Please Select between 1-7");
        }

        Scanner flip = new Scanner(System.in);
        System.out.println("Enter a number between 1-7");
        int no = scan.nextInt();

        switch (no) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Incorrect Input");

//  ********************************** Loops ******************************************
                // while loop
                int xyz = 0;
                while (xyz != 10) {
                    xyz++;
                    System.out.println(xyz);//

                    // Do-While
                    int x = 0;
                    do {
                        System.out.println(x);
                        x++;
//            System.out.println(x);
                    } while (x != 100);

                    // For Loop
                    // Syntax:
                    //        for(str1;st2;st3)
//        Statement one will run before the loop, statement 2 will check the condition is satisfied or not, Statement 3
//        will be iterated everytime the code is being used

                    for (int i = 0; i <= 10; i++) {
                        System.out.println(i);
                    }

//  ************************ Arrays ***************************
                    int[] Marks = {1, 2, 3, 4};
                    System.out.println(Marks[2]);
                    Marks[2] = 6;
                    System.out.println(Marks[2]);
//
                    for (int i = 1; i <= Marks.length; i++) {
                        System.out.println(i);
                    }
                    int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
                    System.out.println(matrix[1][1]);
                    String[] RE = {"classic", "thunderbird", "bullet"};
                    for (String info : RE) {
                        System.out.println(info);
                    }
//
// ************************* Try Catch ********************************************
                    String[] hobby = {"Headphones", "Keyboard", "Mouse", "Monitor", "Steam"};
                    System.out.println(hobby[5]);
                    System.out.println("Code that will be Ignored but shouldnt be ignored");
//        Here it will show error as the Array is upto only index number 4 and no value at index number 5
//        And the next lines of code after the error part will be ignored by the compiler/interpretor.
//        To solve that issue we will use the try and catch method
                    try {
                        System.out.println(hobby[5]);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    System.out.println("Code that was Ignored but wont be ignored now due to try and catch");
//
//
//         ************************* Methods ********************************************
                    System.out.println(sum(5, 7)); // Method Sum was used rom the header files


                }
        }

    }
}