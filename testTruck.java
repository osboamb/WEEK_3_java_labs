public class testTruck {
    public static void main(String[] args) {
        Person person1 = new Person("Stefan", "GB", "111122223333");
        Truck truck1 = new Truck("VW", 20, person1,  500, 250);
        System.out.println(truck1);
    }
}