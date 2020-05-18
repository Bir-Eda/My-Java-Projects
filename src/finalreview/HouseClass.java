package finalreview;

public class HouseClass {
    public static void main(String[] args) {
   House myHouse=new House("500 north street", "Pink");
   House.Room myRoom=myHouse.new Room(350);
        System.out.println(myRoom instanceof House.Room);
        myHouse.warmUp();
        myHouse.coolDown();
        myRoom.openDoor();
        myRoom.closeDoor();
    }
}
class House {
    String address;
    String color;

    public House(String address, String color) {
        this.address = address;
        this.color = color;
    }

    void color() {
        System.out.println("Pink house");
    }

    void coolDown() {
        System.out.println("House is cooling down");
    }

    void warmUp() {
        System.out.println("Warming up");
    }

    class Room {
        double size;

        public Room(double size) {
            this.size = size;
        }

        void openDoor() {
            System.out.println("Door open");
        }

        void closeDoor() {
            System.out.println("Close door");
        }
    }
}
