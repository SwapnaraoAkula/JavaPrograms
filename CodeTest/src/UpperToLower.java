
public class UpperToLower {

	public static void main(String[] args) {
		String str = "hi All hoW ARE you";
		char ch;
		String result= "";
		//char [] charArray = str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				ch=(char) (str.charAt(i)+32);
			}else {
				ch=str.charAt(i);
		}
			result=result+ch;
	}
		System.out.println(result);

}
}
