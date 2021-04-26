public class RoomCarpet {
    float costPerArea;
    RoomDimension room1 = new RoomDimension(10, 10);

//CONTRUCTOR
    public RoomCarpet(float inCostPerArea) {
        costPerArea = inCostPerArea;
    }

//METHOD
    public float calcCost() {
        return room1.area() * cost
    }

//TO STRING 
    public String toString(){}
}