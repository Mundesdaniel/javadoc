//create a class called ArithmeticOperators that has 4 methods:
//sum() method that takes 2 int parameters as input called num1 and num2 and
// returns their summation int
//sub() method that takes 2 int parameters as input called num1 and num2
// and returns their subtraction int
//mul() method that takes 2 int parameters as input called num1 and num2
// and returns their multiplication int
//div() method that takes 2 int parameters as input called num1 and num2
// and returns their division int

/**
 * The type Arithmetic operators.
 */
public class ArithmeticOperators {
    /**
     * Sum int.
     *
     * @param num1 the num 1
     * @param num2 the num 2
     * @return the int
     */
    public int sum(int num1, int num2){

        return num1 + num2 ;
    }

    /**
     * Sub int.
     *
     * @param num1 the num 1
     * @param num2 the num 2
     * @return the int
     */
    public int sub(int num1, int num2){
        return num1 - num2 ;
    }

    /**
     * Mul int.
     *
     * @param num1 the num 1
     * @param num2 the num 2
     * @return the int
     */
    public  int mul(int num1 ,int num2){
        return num1 * num2;
    }

    /**
     * Div int.
     *
     * @param num1 the num 1
     * @param num2 the num 2
     * @return the int
     */
    public  int div (int num1 ,int num2){
        return num1 / num2;
    }
}


