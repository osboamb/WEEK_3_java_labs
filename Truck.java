public class Truck extends Vehicle {
    private double load_cap;
    private int tow_cap;

//CONSTRUCTOR 
    public Truck(String manufac, int cylinders, Person owner, double load_cap, int tow_cap) {
        super(manufac, cylinders, owner); // super targets the constructor in the parent constructor 
        this.load_cap = load_cap;
        this.tow_cap = tow_cap;
    }
//GETTERS & SETTERS 
    public void setLoad_cap(double load_cap) {
        this.load_cap = load_cap;
    }

    public void setTow_cap(int tow_cap) {
        this.tow_cap = tow_cap;
    }

//toString
    public String toString() {
        return manufac + "\n" + cylinders + "\n" + owner + "\n" + load_cap + "\n" + tow_cap + "\n";
    }
}