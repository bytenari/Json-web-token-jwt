import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int num = 5;
        int[] arr ={-1, 1, 3,4,5,2};
    }
    public int arrProduct(int[] arr){
        // TODO:
        //base
        if (arr.length == 0) return 1;
        //recursive
        return arr[0] * arrProduct(Arrays.copyOfRange(arr, 1, arr.length));
    }
}
