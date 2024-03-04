package Abstraction;

public class InformationTech extends Employee {
    @Override
    void getEmployeeDetails() {
        System.out.println("To get employee details from method getEmployeeDetails in InformationTech class ");
    }

    public static void main(String[] args) {
        InformationTech informationTech = new InformationTech();
        informationTech.getEmployeeDetails();
    }
}
