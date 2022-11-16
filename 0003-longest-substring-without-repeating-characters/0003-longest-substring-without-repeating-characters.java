class Solution {
    public int lengthOfLongestSubstring(String s) {
        String e = "";
        int ans = 0;
        for (char c : s.toCharArray()) {
            String current = String.valueOf(c);
            if (e.contains(current)) {
                e = e.substring(e.indexOf(c) + 1);
            }
            e = e + c;
            ans = Math.max(e.length(), ans);
        }
        return ans;
    }
}