class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {

            int[] count = new int[26];

            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);

                count[c-'a']++;
            }

            String key = Arrays.toString(count);

            if (map.containsKey(key)) {
                map.get(key).add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(key,list);
            }
        }

        return new ArrayList<>(map.values());
    }
}