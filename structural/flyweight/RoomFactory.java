package structural.flyweight;
import java.util.HashMap;
import java.util.Map;
//Flyweight Factory
public class RoomFactory {
    private final Map<String, Room> roomTypeMap = new HashMap<>();

    public Room getRoomType(String type, String bedType, boolean hasAC, double basePrice) {
        String key = type + "-" + bedType + "-" + hasAC + "-" + basePrice;

        Room room = roomTypeMap.get(key);
        if (room == null) {
            room = new RoomType(type, bedType, hasAC, basePrice);
            roomTypeMap.put(key, room);
        }
        return room;
    }

    public int totalRoomTypes() {
        return roomTypeMap.size();
    }
}