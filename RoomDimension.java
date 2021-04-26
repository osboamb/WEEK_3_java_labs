public class RoomDimension {
    float length;
    float width;

//CONSTRUCTOR 
    public RoomDimension(float inLength, float inWidth) {
        length = inLength;
        width = inWidth;
    }
    
//METHOD
    public float area() {
        return length * width;
    }
