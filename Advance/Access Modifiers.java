package com.codus;
/*
 Access Modifiers: Specifier where a Method is accessible
 There are 4 types of Access Modifiers In Java:
 1)Private  (keyword = "private")
 2)Default  (keyword = no keyword)
     3)Protected    (keyword = "protected")
 4)Public   (keyword = "public")

 If you don't want anyone to screw with your class attributes you store em in your "private" Modifiers
 */
class Employee{
    private int Age;     // here if u use private keyword before int and String, it won't be recognized below down in
    private String name;    //  the code when it is being used

    public void setAge(int n){
        if (n>=18){
            System.out.println("you are Adult and eligible");
            Age=n;
        }
        else{
            System.out.println("you are not eligible, Hence Id=0, Try Again");
        }
    }

    public void setName(String n){
        name=n;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return Age  ;
    }
}
public class Main {


    public static void main(String[] args) {
        // write your code here
        Employee Amaan= new Employee();
//        Amaan.id=36;
//        Amaan.name="Ammo"; --> throws an error due to private access modifier
        Amaan.setName("Ammo");
        Amaan.setAge(21);
        System.out.println(Amaan.getId());
        System.out.println(Amaan.getName());


    }
}
