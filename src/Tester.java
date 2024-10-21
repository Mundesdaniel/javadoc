
//create a class called ArithmeticOperators that has 4 methods:
//sum() method that takes 2 int parameters as input called num1 and num2 and
// returns their summation int
//sub() method that takes 2 int parameters as input called num1 and num2
// and returns their subtraction int
//mul() method that takes 2 int parameters as input called num1 and num2
// and returns their multiplication int
//div() method that takes 2 int parameters as input called num1 and num2
// and returns their division int
//create a class called Tester that has the main method where you:
//create a new ArithmeticOperators object
//print in console the result of the 4 methods invocations, passing them (as params) int numbers as you like
//add Javadoc comments to:
//the 2 classes with a short description and the author
//the 5 methods with a short description, the parameters and the return value
//create a folder called GeneratedJavadoc under the main project folder
//generate the Javadoc file using the IntelliJ Javadoc plugin right inside the newly created folder
//explore the freshly generated Javadoc


/**
 * The type Tester.
 */
public class Tester {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        ArithmeticOperators operators = new ArithmeticOperators();
        System.out.println(operators.sum(5,5));
        System.out.println(operators.mul(7,2));
        System.out.println(operators.sub(20,13));
        System.out.println(operators.div(7,2));
    }
}

