package Interfaces;

public class PersonTest {
    public static void main(String[] args) {
//        Person kojo = new Student("Kojo", "math");
//        System.out.println(kojo.description());
//        System.out.println(kojo.hashCode());

        Intern a = new Intern("Conor", "Math");
        Student b = new Intern("Conor", "Math");
        Employee c = new Intern("Conor", "Math");

        System.out.println(((Employee)b).getSalary());

    }

}
