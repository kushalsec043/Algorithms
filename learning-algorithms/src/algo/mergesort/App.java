package algo.mergesort;

public class App {

	public static void main(String[] args) {
		
		int[] inputArray = { 9,6,2,5,7 };
		MergeSort sorter = new MergeSort();

		sorter.sort(inputArray);

		for(int i = 0; i < inputArray.length; i++){
			System.out.println(inputArray[i]);
		}
		
	}
}