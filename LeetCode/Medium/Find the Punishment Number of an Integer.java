class Solution {
    public int punishmentNumber(int n) {
        int punishmentNum = 0;
        for (int curr = 1; curr <= n; curr++) {
            int square = curr * curr;
            if (canPartition(String.valueOf(square), 0, curr)) { 
                punishmentNum += square;
            }
        }
        return punishmentNum;
    }

    public boolean canPartition(String s, int index, int target) {
        if (index == s.length()) {
            return target == 0;
        }

        int sum = 0;
        for (int i = index; i < s.length(); i++) {
            sum = sum * 10 + (s.charAt(i) - '0');
            if (sum > target) {
                break; 
            }
            if (canPartition(s, i + 1, target - sum)) { 
                return true; 
            }
        }
        return false; 
    }
}
