import java.util.List;

//Static Methods that are examples of the various algorithms on the test
public class Algorithms {

    //Search Algorithms

    /*Also known as sequential sort
    This method linearly searches a list for a target object, and returns the targets index.
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
            }
        }
        return -1;
    }
    /*Binary search works by "Dividing and Conquering"
    In order for a binary search to work, the list must be SORTED

    It is part of the Collections class:
    public static <T> int binarySearch(List<? extends T> list,
                   T target,
                   Comparator<? super T> c)
    Example:
    int index = Collections.binarySearch(listToSearch, 50);

    This method performs a binary search on a list of integers, and returns the index of the target.
    If the target is not found, -1 is returned.
    */
    public static int binarySearch(List<Integer> listToSearch, int target) {
        int l = 0, r = listToSearch.size() - 1;
        while (l <= r)
        {
            int m = l + (r-l)/2;

            // Check if target is present at mid
            if (listToSearch.get(m).equals(target))
                return m;

            // If target is greater, ignore left half
            if (listToSearch.get(m) < target)
                l = m + 1;

                // If target is smaller, ignore right half
            else
                r = m - 1;
        }
        return -1;
    }

}
