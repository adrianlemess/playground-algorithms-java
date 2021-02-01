// 16ms
// O(n^2)

class Solution {
    public int lengthOfLongestSubstring(String s) {
           String cache = "";
        
          int longestLength = 0;
        
        
          for (char ch: s.toCharArray()) {
            int indexInCache = cache.indexOf(ch);

            if (indexInCache != -1) {
                // If already in the list
               int indexRepeatedInCache = indexInCache;
               
                cache = cache.substring(indexRepeatedInCache + 1);
                
            }
            cache = cache + ch;
            // Fill longestLength when cache is bigger
            if (cache.toCharArray().length > longestLength) {
                longestLength = cache.toCharArray().length;
            }
            
          }
              
          return longestLength;
    }
}