import java.util.*;

class Solution {
    List<String> happy = new ArrayList<>();
    
    public String getHappyString(int n, int k) {
        char[] chars = {'a', 'b', 'c'};
        generateHappyString("", n, chars);
        return k > happy.size() ? "" : happy.get(k - 1);
    }

    private void generateHappyString(String path, int n, char[] chars) {
        if (path.length() == n) {
            happy.add(path);
            return;
        }
        for (char c : chars) {
            if (path.isEmpty() || path.charAt(path.length() - 1) != c) {
                generateHappyString(path + c, n, chars);
            }
        }
    }
}
