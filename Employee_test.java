public class Employee_test {
    public static void main (String[] args) {
        Employee person1 = new Employee("Matt Morgan", 11111, "COMSC", "Lecturer");
        System.out.println(person1);

        Employee person2 = new Employee("Amber Osborne", 22222);
        System.out.println(person2);

        Employee person3 = new Employee();
        System.out.println(person3);
    }
}