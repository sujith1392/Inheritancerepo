package Abstraction;

public abstract class Employee {

    //Abstract method
    abstract void getEmployeeDetails();

    //Non abstract method
    void getEmployeeDept(){
        System.out.println("To get employee department");
    }

}
