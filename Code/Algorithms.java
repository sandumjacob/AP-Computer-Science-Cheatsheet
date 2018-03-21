import java.util.List;

//Static Methods that are examples of the various algorithms on the test
public class Algorithms {

    //Search Algorithms

    /*Also known as sequential sort
    This linearly searches a list for a target object, and returns the targets index.
    If the target is not found, -1 is returned.

    Since it searches linearly, the number of iterations increases with the size of the list in a directly linear relationship.
    Advantages:
    * Easy to write
    * Works fine with a small list
    Disadvantages:
    * Inefficient with large lists, since it has to go through the ENTIRE array
    */
    public static int linearSearch(List listToSearch, Object target) {
        for (int i = 0; i < listToSearch.size(); i++) {
            if (listToSearch.get(i).equals(target)) {
                return i;
            } else {
                return -1;
            }
        }
    }

}
