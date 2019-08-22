import java.util.List;

public class StringToStringArray {
	public static void main(String args[])
	{
		String str = "hi how are you all";
		String [] strArr = str.split(" ");
		System.out.println(strArr.length);
		for(String s:strArr) {
			System.out.println(s);
		}
	}

}
 