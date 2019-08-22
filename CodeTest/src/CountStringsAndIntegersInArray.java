
public class CountStringsAndIntegersInArray {

	public static void main(String[] args) {
		int cn=0,cs=0;
		String [] arr = {"2","sai","4","5","ram"};
		System.out.println("Elements of Array:");
		for(String str:arr) {
			System.out.println(str);
		}
		for(int i=0;i<arr.length;i++) {
			try {
				Integer.parseInt(arr[i]);
					cn++;
			}
				catch(NumberFormatException e) {
					cs++;
				}
			}
		System.out.println("Number of string:"+cs);
		System.out.println("Number of Integers:"+cn);

		
	}

}
