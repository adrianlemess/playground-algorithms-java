public int lengthOfLongestSubstring(String s) {
          Set<Character> set = new HashSet<Character>();
          
          int longestLength = 0;
          int left = 0;
          int right = 0;

          while(right < s.length()) { // right: 2
            if (set.contains(s.charAt(right))) {
                // If already in the list
                set.remove(s.charAt(left));
                left++;
            } else {
                set.add(s.charAt(right)); // set: p, w
                right++; // 2
                
                longestLength = Math.max( right - left, longestLength); // 2

            }
              
            
          }
              
          return longestLength;
    }