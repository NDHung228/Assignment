package test.demo;

public class Room  implements TestInterface{
     final int ID_ROOM;


     public Room() {
         ID_ROOM  = 0 ;
         System.out.println("demo");
         printText();
     }

    public Room(int idRoom) {
        System.out.println("This is idRoom");
        ID_ROOM = idRoom;
    }

    public final void test() {
        System.out.println("This is method final test");
    }

    @Override
    public void demo() {

    }

    public void printText() {
        System.out.println("This is method final printText in Room");
    }
}
