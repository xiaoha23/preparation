package findNumber;

import java.util.List;

public class Solution {
    public static String findNumber(List<Integer> arr, int k) {
        return arr.stream().anyMatch(e -> e == k) ? "YES" : "NO";

    }
}
