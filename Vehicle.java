public class Vehicle {
    protected String manufac;
    protected int cylinders;
    protected Person owner;

//CONSTRUCTOR
    public Vehicle(String manufac, int cylinders, Person owner) {
        this.manufac = manufac;
        this.cylinders = cylinders;
        this.owner = owner;
    }
}