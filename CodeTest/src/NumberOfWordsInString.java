import java.util.*;
public class NumberOfWordsInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter line:");
	String line = sc.nextLine();
	sc.close();
	int count=0;
	for(int i = 0;i <line.length()-1;i++)
	{

		if((line.charAt(i)==' ') && (line.charAt(i+1)!=' ')) {
			count++;
			}
		}
   System.out.println("Total number of words in a string:"+count+1);

}
	
}


