public class RoomCarpet {
    private RoomDimension size;
    private double carpetCost;

//CONTRUCTOR
    public RoomCarpet(RoomDimension inSize, double inCarpetCost) {
        size = inSize;
        carpetCost = inCarpetCost;
    }  

//METHOD
    public double getTotalCost() {
        return size.getArea() * carpetCost;
    }

//TO STRING 
    public String toString(){
        return "Area " + size.getArea() + "/t Cost per square meter: " + carpetCost + "/n";
    }
}