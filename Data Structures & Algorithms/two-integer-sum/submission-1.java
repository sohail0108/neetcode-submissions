/* my logic
class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n=arr.length;
        int ans[]=new int[2];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }

        return ans;
    }

}*/

// optimized logic

class Solution {
    public int[] twoSum(int[] arr, int target) {
        // Map to store: Key = value of element, Value = its index
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            
            // If the complement exists, we found our pair
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Otherwise, store current number and move on
            map.put(arr[i], i);
        }
        
        // Return empty if no solution is found
        return new int[] {};
    }
}

