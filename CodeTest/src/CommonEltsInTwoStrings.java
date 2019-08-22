
public class CommonEltsInTwoStrings {

	public static void main(String[] args) {
		String str1 = "ram sam sai tom rome";
		String str2 = "pan ban sai ram";
		String [] strarr1 = str1.split(" ");
		String [] strarr2 = str2.split(" ");
		System.out.println("Common elements in both Strings are:");
		for(int i =0;i<strarr1.length;i++) {
			for(int j=0;j<strarr2.length;j++) {
				if(strarr1[i].equals(strarr2[j])){
					System.out.println(strarr1[i]);
				}
			}
		}
	}

}
