// Last updated: 10/26/2025, 10:23:53 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }
            else{
                int currfreq=map.get(s.charAt(i));
                map.put(s.charAt(i),currfreq+1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(!map2.containsKey(t.charAt(i))){
                map2.put(t.charAt(i),1);
            }
            else{
                int currfreq=map2.get(t.charAt(i));
                map2.put(t.charAt(i),currfreq+1);
            }
        }
        return map.equals(map2);
    }
}