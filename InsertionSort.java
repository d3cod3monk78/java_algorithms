/**
*===================== Insertion Sort=========================
* 
* Algorithm InsertionSort(A):
* 	Input: An array A of n comparable elements
* 	Output: The array A with elements rearranged in nondecreasing order
* 
* 	for k from n-1 do:
* 		insert A[k] at its proper location within A[0], A[1], ...., A[k]
* 
*  
**/

public class InsertionSort {
	public int[] sort(int array[]) {
		int arrayLength = array.length;

		for(int i = 1; i < arrayLength; i++) {
			int currentNodeValue = array[i];
			int j = i;

			while(j > 0 && array[j-1] > currentNodeValue) {
				array[j] = array[j-1];
				j--;
			}
			array[j] = currentNodeValue;
		}

		return array;
	}

	public int[] ksort(int array[]) {
		int arrayLength = array.length;

		for(int i = 1; i < arrayLength; i++) {
			int currentNodeValue = array[i];
			int j = i;

			while(j > 0 && array[j-1] < currentNodeValue) {
				array[j] = array[j-1];
				j--;
			}
			array[j] = currentNodeValue;
		}

		return array;
	}
}