package classobjectconstructor;

public class House {

    //in a class you can create variables and methods
    //these are the properties to the class House

    String color = "white";

    int numberOfRooms = 5;
    char unit;

    //constructor is the entity that defines/effects the object
    //constructor is a block of code similar to method called implicitly/indirectly during  the object creation
    //the syntax of the constructor is className(parameters){body}

    //built constructor
    House(String address){
        System.out.println("the address is "+ address);
    }
    House(String address, String city, String country){
        System.out.println("the address is "+ address);
        System.out.println("the city is "+ city);
        System.out.println("the country is "+ country);
    }



    void room() {
        System.out.println("sleep");

    }

}

