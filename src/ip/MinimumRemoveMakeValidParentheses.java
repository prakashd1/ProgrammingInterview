package ip;

public class MinimumRemoveMakeValidParentheses {
    public static void main(String[] args) {
        MinimumRemoveMakeValidParentheses a=new MinimumRemoveMakeValidParentheses();
        System.out.println(a.minRemoveToMakeValid("))(("));
    }

    public String minRemoveToMakeValid(String s) {
        int open=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                open++;
            }else if(c==')' && open>0){
                if(open>0){
                    open--;
                }else continue;

            }
            sb.append(c);
        }
        if(open>0)
        for(int i=sb.length()-1; i>=0;i--){
            char c = sb.charAt(i);
            if(c == '(' && open >0){
                sb.deleteCharAt(i); open--;
            }
        }

        return sb.toString();
    }

}
