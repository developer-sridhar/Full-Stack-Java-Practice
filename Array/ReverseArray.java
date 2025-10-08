package Array;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[ ] = {5,6,2,3,1};
		for(int i=0; i<arr.length/2; i++) {
			int temp = arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
			
		}
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
