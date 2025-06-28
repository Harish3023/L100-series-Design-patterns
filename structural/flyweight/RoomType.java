package structural.flyweight;
//Concrete Flyweight
public class RoomType implements Room {
    private final String type;
    private final String bedType;
    private final boolean hasAC;
    private final double basePrice;

    public RoomType(String type, String bedType, boolean hasAC, double basePrice) {
        this.type = type;
        this.bedType = bedType;
        this.hasAC = hasAC;
        this.basePrice = basePrice;
    }

    @Override
    public void displayRoomDetails(String roomNumber, int floor, boolean isAvailable) {
        System.out.println("Room " + roomNumber + " [Type: " + type +
                ", Bed: " + bedType + ", AC: " + hasAC +
                ", Price: ₹" + basePrice +
                ", Floor: " + floor +
                ", Available: " + isAvailable + "]");
    }
}