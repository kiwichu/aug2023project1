package classmethodobject;

public class TestCalculator {

    public static void main(String[] args) { //main method

        //by using an object, you connect the second class to the first class
        Calculator cal = new Calculator();

        //create object: instance of a class
        //className objectName = new className()

        //non-return method cannot be assigned
        //non-return method cannot be printed

        //return method can be assigned
        //return method can be printed
        cal.add();
        cal.sub();
        cal.mul();
        cal.div();
    }
}
