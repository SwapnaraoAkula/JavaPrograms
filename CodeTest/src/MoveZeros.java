import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {
		int [] arr = {0,3,0,1,4,0,5,9,7,0,8};
		int temp=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
			
			if(arr[i]==0) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
