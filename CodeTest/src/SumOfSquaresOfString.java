
public class SumOfSquaresOfString {

	public static void main(String[] args) {
		String str = "234";
		
		String [] stringArr = str.split("");
		int sum=0;
		int [] squares = new int [str.length()];
		for(String i:stringArr) {
			System.out.print(i);
			System.out.println(" ");
		}
		for(int i=0;i<stringArr.length;i++) {
			squares[i]=Integer.parseInt(stringArr[i]) * Integer.parseInt(stringArr[i]);
			sum+=squares[i];
		}
		System.out.println("sum of square of string:"+sum);
	}

}
