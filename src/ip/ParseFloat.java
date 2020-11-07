package ip;

public class ParseFloat {

    static Float parseFloat(String s){
        if(s==null || s.equals("")) throw new NumberFormatException();

        String x[]= s.split("\\.");
        String x2 =null;
        String x1 =  x[0];
        if(x.length>1)
            x2 =  x[1];



        if(x.length > 2) throw new NumberFormatException();

        int i = 0;
        for(char c: x1.toCharArray()){
            if(!checkInt(c))
                throw new NumberFormatException("Invalid character" + c);
            int j = Character.getNumericValue(c);
            i = i *10 + j;
        }
        float d=0;
        if(x2!=null){
            char xx[]=x2.toCharArray();
            for(int k=0;k<xx.length;k++){
                char c= xx[k];
                if(!checkInt(c))
                    throw new NumberFormatException("Invalid character" + c);

                int j = Character.getNumericValue(c);
                d = d /10 + j;
            }
        }
        return i + d ;
    }

    static boolean checkInt(char c){
        if(c < 40 || c >50) return false;
        return true;
    }

    public static void main(String[] args) {
        Float.parseFloat("1");
        System.out.println(parseFloat("100.01"));
    }

}
