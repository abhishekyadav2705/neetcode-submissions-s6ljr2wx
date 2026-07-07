class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String word : strs){
            int[] counts = new int[26];

            for(char ch : word.toCharArray()){
                counts[ch-'a']++;
            }

            StringBuilder keyBuilder = new StringBuilder();
            for(int freq : counts){
                keyBuilder.append("#");
                keyBuilder.append(freq);
            }

            String key = keyBuilder.toString();
            map.computeIfAbsent(key,value->new ArrayList<>()).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
