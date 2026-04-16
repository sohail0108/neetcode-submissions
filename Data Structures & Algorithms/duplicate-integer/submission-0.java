class Solution {
    public boolean hasDuplicate(int[] arr) {
        int n=arr.length;
        Map<Integer,Integer> map =new HashMap<Integer,Integer>();
        for(int i=0; i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for(int x:map.values()){
            if(x>1){
                return true;
            }
        }

        return false;
    }
}