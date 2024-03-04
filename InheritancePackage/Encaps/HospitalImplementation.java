package InheritancePackage.Encaps;

public class HospitalImplementation {

    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        hospital.setName("sanjeev");
        hospital.setAge(25);
        hospital.setCode(5);
        hospital.setAddress("6251 irving");

        System.out.println("hospital name: "+ hospital.getName());
        System.out.println("hospital age: "+ hospital.getAge());
        System.out.println("hospital code: "+ hospital.getCode());
        System.out.println("hospital address: "+ hospital.getAddress());
    }
}
