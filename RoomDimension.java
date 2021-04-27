public class RoomDimension {
    private double length;
    private double width;

//CONSTRUCTOR 
    public RoomDimension(double inLength, double inWidth) {
        length = inLength;
        width = inWidth;
    }
    
//METHOD
    public double getArea() {
        return length * width;
    }

    public String toString() {
        return "The room measures: " + length + " long by " + width + " wide, with an area of " + getArea();
    }
}
