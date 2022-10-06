package Task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Room jackKingRoom = new Room(3, 20, 25);
        Room juliusDungeon = new Room(1, 1, 0);
        Room oliversDungeon = new Room(1, 1, 0);

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(jackKingRoom);
        rooms.add(juliusDungeon);
        rooms.add(oliversDungeon);

        Building jacksHouse = new Building(rooms, 3, 2, false);

    }

    public static int countLampsInBuilding(Building building) {
        int totalLamps = 0;
        for (Room r :
                building.getRooms()) {
            totalLamps += r.getNumberOfLamps();
        }
        return totalLamps;
    }

    public static boolean isNormal(Building building) {

        if (building.getRooms().size() < building.getNumberOfFloors()) {
            return true;
        } else {
            System.out.println("This is an odd building");
            return false;
        }
    }
}