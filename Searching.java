package self_study_array;

import java.util.Arrays;
import java.util.Random;

public class Searching {

	public static void main(String[] args) {

		int[] array1 = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };


		binary_search(array1, 18);
		System.out.println("//////////////////////////////////////////");
		linear_search(array1, 18);
	}

////////////////////////////////////////////////////////////////////
	public static int binary_search(int[] a, int key) {
		Arrays.sort(a);

		return binarysearch(a, 0, a.length, key);
	}

	private static int binarysearch(int[] a, int fromIndex, int toIndex, int key) {
		int low = fromIndex;
		int high = toIndex - 1;
		int counter =0;
		
		while (low <= high) {
			
			int mid = (low + high) / 2;
			int midval = a[mid];
			if (midval == key) {
				System.out.println("iteration number: "+counter);
				System.out.println("value " +key +" was found at index " + mid);
				return mid; // key found
			} 
			
			else if (midval < key) {
				
				low = mid + 1;
				
			} 
			
			else {// (midval > key )
				
				high = mid - 1;
			}
			System.out.println("iteration number: "+counter);
			counter++;
		}
		System.out.println("value "+key +" was not found");
		return -1; // key not found.
	}

/////////////////////////////////////////////////////////////////////////////////////////////
	public static long linear_search(int[] arr, int value_needed) {

		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value_needed) {
				index = i;
				System.out.println("value " + value_needed + " was found at index: " + index);
				break;
			}
			System.out.println("iteration number: "+i);
		}
		if (index == -1) {
			System.out.println("value " + value_needed + " was not found");
		}

		return index;
	}
}
