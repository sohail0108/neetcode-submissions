// class Solution {
//     public boolean isAnagram(String s, String t) {
//         int n =s.length();
//         int m=t.length();
//         if(n!=m) return false;
//         char[] a=s.toCharArray();
//         char[] b=t.toCharArray();

//         Map<Character, Integer> map = new HashMap<>();
//         for(int i=0;i<n;i++){
//             map.put(a[i],map.getOrDefault(a[i],0)+1);
//             map.put(b[i],map.getOrDefault(b[i],0)-1);
//         }
        
//         for(int x:map.values()){
//             if(x!=0){
//                 return false;
//             }
//         }

//         return true;
//     }
// }



class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26]; // Fixed size array for 'a'-'z'

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int val : count) {
            if (val != 0) return false;
        }

        return true;
    }
}

