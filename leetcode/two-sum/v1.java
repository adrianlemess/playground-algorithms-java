class Solution {
        public int[] twoSum(int[] nums, int target) {
           if (nums.length == 2) {

               return new int[] { 0, 1};
           }
        
           Map<Integer,Integer> cache = new HashMap<Integer,Integer>();
  
           for (int i = 0; i < nums.length; i++) {
               int otherPair  = target - nums[i];
           
               if (cache.containsKey(otherPair)) {
                   return new int[] {  cache.get(otherPair), i};
                   
               } else {
                  cache.put(nums[i], i);

               }
               
           }
        
        return new int[2];
    }
    
}