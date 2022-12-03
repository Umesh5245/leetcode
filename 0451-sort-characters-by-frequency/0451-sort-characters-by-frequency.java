public class Solution {

    public String frequencySort(String s) {
        HashMap<Character, Integer> appr = new HashMap<Character, Integer>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!appr.containsKey(c)) {
                appr.put(c, 0);
            }
            appr.put(c, appr.get(c) + 1);
            max = Math.max(max, appr.get(c));
        }
        HashMap<Integer, Queue<Character>> index = new HashMap<Integer, Queue<Character>>();
        for (Character c : appr.keySet()) {
            int count = appr.get(c);
            if (!index.containsKey(count)) {
                index.put(count, new LinkedList<Character>());
            }
            index.get(count).add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = max; i > 0; i--) {
            if (index.containsKey(i)) {
                while (!index.get(i).isEmpty()) {
                    char c = index.get(i).poll();
                    for (int j = 0; j < i; j++) {
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString();
    }
}
