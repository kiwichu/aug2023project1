package classobjectconstructor;

public class TestHouse {

    public static void main(String[] args) {

        //create class name then create an object name then new class
        House myHouse = new House("52 Senator St");

        House yourHouse = new House("52 Senator St");

        House hisHouse = new House("52 Senator St");

        myHouse.room();
        System.out.println(myHouse.color);
        myHouse.unit = '8';

        House herHouse = new House("52 Senator St");

    }
}
