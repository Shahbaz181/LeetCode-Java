class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
        return false;
        }

        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        for (int i=0; i< s.length(); i++){
            char character = s.charAt(i);

            if(mapS.containsKey(character)){
                mapS.put(character, mapS.get(character)+1);
            }else{
                mapS.put(character,1);
            }
        }

        for (int i=0; i< t.length(); i++){
            char character = t.charAt(i);

            if(mapT.containsKey(character)){
                mapT.put(character, mapT.get(character)+1);
            }else{
                mapT.put(character,1);
            }
        }
        return mapS.equals(mapT);
    }
}