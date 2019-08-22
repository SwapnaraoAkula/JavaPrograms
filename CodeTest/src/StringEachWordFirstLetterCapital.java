
public class StringEachWordFirstLetterCapital {

	public static void main(String[] args) {
		String str = "how are you all";
		String[] strArray = str.split(" ");
		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i]);
			System.out.print(" "); 
		}
		System.out.println("\n");
		for (int i = 0; i < strArray.length; i++) {
			String upperCase = (strArray[i].substring(0, 1).toUpperCase()) + strArray[i].substring(1);

		System.out.print(upperCase);
		System.out.print(" "); 
			
		}

	}

}
