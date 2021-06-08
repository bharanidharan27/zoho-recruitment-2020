import java.util.*;

public class ZohoProgram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int strLen = str.length();
        int middleIndex = strLen / 2;

        str = str + str;
        
        for(int r=0; r<strLen; r++) {

            int offset = 0; 
            for(offset = 0; offset<strLen-r-1; offset++) System.out.print(" ");

            int tempIndex = middleIndex;
            while(offset < strLen) {
                System.out.print(str.charAt(tempIndex++));
                offset++;
            }

            System.out.println("");
        }
    }
}
