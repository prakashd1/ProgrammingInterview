package ip;

//https://leetcode.com/problems/robot-return-to-origin/
public class RobotOrigin {
    public static void main(String[] args) {

    }
    public boolean judgeCircle(String moves) {
        int x=0,y=0, invalid=0;

        for(char c:moves.toCharArray()){
            switch (c){
                case 'U': y++; break;
                case 'D': y--;break;
                case 'L': x--;break;
                case 'R':x++;break;
                default: invalid++;
            }
        }
        if(x==0 && y==0) return true;
        return false;

    }
}
