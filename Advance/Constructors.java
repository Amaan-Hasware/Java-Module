package com.codus;
class Employee {
    private int age;     // here if u use private keyword before int and String, it won't be recognized below down in
    private String name;    //  the code when it is being used

//    public Employee(){
//        age =18;
//        name="Type-Your_Name";
//    }
    public Employee(String myName , int MyAge){
    age =MyAge;
    name=myName;
}
    public String getName() {return name;}
    public void setName(String n) {name = n;}

    public void setAge(int n) {age=n;}
    public int getAge() {return age;}
}
public class Main {

    public static void main(String[] args) {
	Employee Ammo= new Employee("Amaan",19);
//    Ammo.setName("Amaan");
//    Ammo.setAge(18);
//    Typing entire code for setting the info of different clients(Employees) can be very time consuming, therefore
//    here comes the Constructors. Create a public method which will set the default values for users who don't put
//    their values in the Age,Name Field.
//    So now if u just assign a new employee he will default have those valuees in him.
//    Example:

        System.out.println(Ammo.getAge());
        System.out.println(Ammo.getName());
//    Constructors are automatically invoked (no need for explicit invokation)


    }
}
