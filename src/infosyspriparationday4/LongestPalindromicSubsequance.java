
package infosyspriparationday4;
import java.util.*;
public class LongestPalindromicSubsequance {
	static ArrayList<ArrayList<Character>> list = new ArrayList<>();

	public static void main(String[] args) {
			Scanner sc  = new Scanner(System.in);
		//String  s = sc.next();
			String str="BBABCBCAB";
			char[] c = str.toCharArray();
			System.out.println(longPalSubSeq( c,  0, str.length()-1));

		}
	
	private static int longPalSubSeq(char[] c, int sh, int lon) {

		if(sh == lon)
            return 1;

		 if(lon - sh == 1){
	            if(c[sh] == c[lon])
	                return 2;
	            
	            else 
	                return 1;
	        }
		 if(c[sh] == c[lon])
	            return 2 + longPalSubSeq (c, sh + 1, lon - 1);
	        
	        return Math.max( longPalSubSeq (c, sh, lon - 1), 
	        		longPalSubSeq(c, sh + 1, lon));
	}

	}