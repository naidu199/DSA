package Easy;
import java.util.*;
class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
        int min=Collections.min(arr);


        return arr.indexOf(min);
    }
}
