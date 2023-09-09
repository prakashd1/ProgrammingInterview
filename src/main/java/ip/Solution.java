package ip;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public boolean isPalindrome(String s) {
        if(s==null || s.length()==0) return false;
        int a=0,b=s.length()-1;
        while(a<b){
            char c1 = Character.toLowerCase(s.charAt(a));
            char c2 = Character.toLowerCase(s.charAt(b));
            if(!isAplhanumeric(c1) && !isAplhanumeric(c2)){
                a++;b--;
                continue;
            }else if(!isAplhanumeric(c1)){
                a++;
                continue;
            }else if(!isAplhanumeric(c2)){
                b--;
                continue;
            }else if(c1!=c2){
                return false;
            }else{ a++;b--;}
        }
        return true;
    }

    boolean isAplhanumeric(Character character){
        return  ((character >= '0' & character <= '9') || (character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z'));
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome("A man, a plan, a canal: Panama"));
    }
}