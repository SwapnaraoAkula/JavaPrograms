
public class MissingNumberInArray {

	public static void main(String[] args) {
		int [] arr = {1,2,4,5,6,8,10};
		int mis;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]!=arr[i]+1) {
				mis=arr[i]+1;
				System.out.println("Missing number is:"+mis);
			
			}
	}

}
}
