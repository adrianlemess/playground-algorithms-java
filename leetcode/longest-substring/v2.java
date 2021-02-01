 // 6ms
 // O(n)
 
 public int lengthOfLongestSubstring(String s) {
          Set<Character> set = new HashSet<Character>();
          
          int longestLength = 0;
          int left = 0;
          int right = 0;

          while(right < s.length()) { // right: 2
            Character ch = s.charAt(right); // w
            if (set.contains(ch)) {
                // If already in the list
                set.remove(s.charAt(left));
                left++;
            } else {
                set.add(ch); // set: p, w
                right++; // 2
            
            }
              
             if ((right - left) > longestLength) {
                longestLength = right - left; // 2
            }

            
          }
              
          return longestLength;
    }