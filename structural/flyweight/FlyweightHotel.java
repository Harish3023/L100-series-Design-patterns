package structural.flyweight;
public class FlyweightHotel {
    public static void main(String[] args) {
        RoomFactory factory = new RoomFactory();

        Room deluxe = factory.getRoomType("Deluxe", "Queen", true, 4500.0);
        deluxe.displayRoomDetails("101", 1, true);
        deluxe.displayRoomDetails("102", 1, false);

        Room suite = factory.getRoomType("Suite", "King", true, 8000.0);
        suite.displayRoomDetails("201", 2, true);

        Room anotherDeluxe = factory.getRoomType("Deluxe", "Queen", true, 4500.0);
        anotherDeluxe.displayRoomDetails("103", 1, true);

        System.out.println("Total Room Types Created (shared): " + factory.totalRoomTypes());
    }
}