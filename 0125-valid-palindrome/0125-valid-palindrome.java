class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length() -1;

        s = s.toLowerCase();

        while(left < right){
            char c1 = s.charAt(left);
            char c2 = s.charAt(right);

            if(!(c1>= 'a' &&  c1<= 'z' || c1>= '0' && c1<= '9')){
                left++;
                continue;
            }

            if(!(c2>= 'a' &&  c2<= 'z' || c2>= '0' && c2<= '9')){
                right--;
                continue;
            }

            if(c1 != c2){
                return false;
            }
        
            left++;
            right--;
        }
    
    return true;

    }
}