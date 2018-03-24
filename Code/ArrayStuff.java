import java.util.Arrays;
public class ArrayStuff {

    public static int[][] search2DArrayForIntArray(int[][] arrayToSearch, int[] target) {
        return null;
    }

    public static int[][] search2DArrayForInt(int[][] arrayToSearch, int target) {
        int output[][];
        for (int j = 0; j < arrayToSearch.length; j++) {
            for (int k = 0; k < arrayToSearch[0].length; k++) {
                if (arrayToSearch[j][k] == target) {
                    output = new int[][]{{j}, {k}};
                    return output;
                }
            }
        }
        output = new int[][]{{-1}, {-1}};
        return output;
    }


    public static void main(String[] args) {
        int twoDimensionalArray[][] = new int[][]{
                {1,5,3,2}, {10,20,50,64}, {100,543,687,896}, {1253,3462,6526,4754}
        };
        
        //Arrays.deepToString is needed because we are printing 2d Arrays
        //Will return [[3], [0]]
        System.out.println(Arrays.deepToString(search2DArrayForInt(twoDimensionalArray, 1253)));
        //Will return [[-1], [-1]]
        System.out.println(Arrays.deepToString(search2DArrayForInt(twoDimensionalArray, 28084)));

    }

}
