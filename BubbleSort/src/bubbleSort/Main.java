package bubbleSort;

public class Main {

	public static void main(String[] args) {
		int array[] = {5,1,67,7,3,4};
		printArray(bubbleSort(array));
	}
	
	public static void printArray(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int[] bubbleSort(int arr[]) {	
		int temp;
		for(int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

}
