package questions_one_to_one_hundred._6;

import java.util.HashSet;
import java.util.Set;

public class ZigZagConversion {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String ans = new ZigZagConversion().convert(s, numRows);
        System.out.println(ans);
    }

    private String convert(String s, int numRows) {
        if (s.length() < 1) {
            return s;
        }

        int h=0,w=0;
        int div = s.length() / numRows;
        int remainder = s.length() % numRows;
        char res [][] = new char[numRows][div + remainder + 2];
        boolean r = false;

        for(int i =0; i < s.length(); i ++) {
            char c = s.charAt(i);
            res[h][w] = c;
            if(r && (h-1) == 0) {
                r = false;
                h = 0;
                w++;
            } else if( r && (h -1) !=0) {
                h--;
                w++;
            } else if(!r) {
                h++;
                if((h + 1) > numRows) {
                    h--;
                    r = true;
                    w++;
                }
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for(int i =0; i < res.length; i++) {
            for(int j = 0; j < res[i].length; j ++){
                char ele = res[i][j];
                stringBuilder.append(ele);
            }
        }
        return stringBuilder.toString();
    }

}
