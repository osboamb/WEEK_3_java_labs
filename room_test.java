import java.util.Scanner;

public class room_test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter room lenght: ");
        double length = in.nextDouble();
        System.out.println("Enter room width: ");
        double width = in.nextDouble();
        System.out.println("Enter price per square meter: ");
        double price = in.nextDouble();

        RoomDimension mattsRoom = new RoomDimension( length, width);
        RoomCarpet mattsCarpet = new RoomCarpet(mattsRoom, price);

        System.out.println("The cost of the carpet is £ " + mattsCarpet.getTotalCost());
    }
}