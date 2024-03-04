package Abstraction;

public class NonTech extends Employee {

    @Override
    void getEmployeeDetails() {
        System.out.println("Find non tech ");
    }

    public static void main(String[] args) {
        NonTech nonTech = new NonTech();
        nonTech.getEmployeeDetails();
    }
}
