
public class CommonEltsInTwoArrays {

	public static void main(String[] args) {
		int [] arr1 = {2,3,4,1,5};
		int [] arr2 = {3,7,8,9,4,5};
		System.out.println("Common Elements are:");
		for(int i =0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}

}
