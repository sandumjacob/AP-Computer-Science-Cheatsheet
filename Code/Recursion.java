public class Recursion {
    /*
    Trees are useful for determining the output of a recursive function
    */
    public static int factorial(int number) {

        //Exit case
        //This is needed so that the recursive method is not an infinite loop
        if (number==1) {
            return 1;
        }

        //Method calls itself
        return number * factorial(number-1);
    }

    public static void main(String[] args) {
        //Prints "24"
        System.out.println(factorial(4));
    }

}
