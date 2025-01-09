class Solution {
    public List<String> commonChars(String[] words) {
        List<String> ans = new ArrayList<>();
        Map<Character,Integer> freq = new HashMap<>();
        for(int i=0;i<words[0].length();i++){
            freq.put(words[0].charAt(i),freq.getOrDefault(words[0].charAt(i),0)+1);
        }
        for(int i=1;i<words.length;i++){
            Map<Character,Integer> temp = new HashMap<>();
            for(int j=0;j<words[i].length();j++){
                if(freq.containsKey(words[i].charAt(j))){
                    temp.put(words[i].charAt(j),temp.getOrDefault(words[i].charAt(j),0)+1);
            temp.put(words[i].charAt(j),Math.min(temp.get(words[i].charAt(j)),freq.get(words[i].charAt(j))));
                }
            }
            freq=temp;
        }
        for(char c : freq.keySet()){
        for(int i = 0; i < freq.get(c); i++) ans.add(c + ""); 
    }
        return ans;
    }
}