class Solution {
    public boolean isPalindrome(String s) {
        String c = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        String r = new StringBuilder(c).reverse().toString();
        
        for(int i=0;i<c.length();i++){
            if(c.charAt(i)!=r.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
