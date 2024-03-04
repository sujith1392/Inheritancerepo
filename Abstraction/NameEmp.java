package Abstraction;

public class NameEmp implements EmployeeInterface{
    @Override
    public void EmployeeName() {
        System.out.println("checking the name ");

    }

    @Override
    public void EmployeeDept() {
        System.out.println("checking the dep name");
    }


//    @Override
//    public void EmployeeNam(){
//        System.out.println("To get name of the employee from employeenam");
//    }
//
//    @Override
//    public void EmployeeDetails(){
//        System.out.println("To get deoartment details from employeedetails method ");
//    }
}
