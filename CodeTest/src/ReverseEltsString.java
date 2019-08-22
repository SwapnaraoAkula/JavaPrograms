import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseEltsString {

	public static void main(String[] args) {
		String str = "hi all how are you";
		
		//Collections.reverse(str);
		String[] strarr = str.split(" ");
		String [] revstr = new String[strarr.length];
		ArrayList<String> al = new ArrayList<String>();
		for(String s:strarr) {
			al.add(s );
		}
		for(int i=0;i<strarr.length;i++) {
			String rev = "";

			for(int j=strarr[i].length()-1;j>=0;j--) {
				rev+=strarr[i].charAt(j);
			}
			revstr[i]=rev;
		}
		System.out.println(Arrays.toString(revstr));
	}

}
