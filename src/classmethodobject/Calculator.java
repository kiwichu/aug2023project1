package classmethodobject;

public class Calculator {
    //class implementation

    //main method is an entry point to the application
    /* if you add "int total" here it turns it into a global variable*/
    /*the mechanism of reassignment which shows why it does the first step then the second*/
    public static void main(String[] args) {
        Calculator myObject = new Calculator();
        myObject.add();
        myObject.sub();
        myObject.mul();
        myObject.div();

    }

    //user defined methods
    //accessModifier non-accessModifier
    //methodType methodName(methodParameters) {MethodBody}
    //method: is a function is a reusable block of code that executes/runs only when called
    //function is a set of instructions to your computer
    void add() {
        //non-return method does not return anything, it is void
        // a return method returns a value
        //method implementation
        int a = 10;
        int b = 5;
        // local variable
        int total;
        total = a + b;
        System.out.println(total);

    }

        void sub() {
            int a = 10;
            int b = 5;

            int total;

            total = a - b;
            System.out.println(total);

        }

    void mul() {
        int a = 10;
        int b = 5;

        int total;

        total = a * b;
        System.out.println(total);

    }

    void div() {
        int a = 10;
        int b = 5;

        int total;

        total = a / b;
        System.out.println(total);

    }

    }

