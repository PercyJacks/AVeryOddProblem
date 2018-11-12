// This is a solution for the Bloomberg Code Challenge 2018 'A Very Odd Problem' 
// Percy Jacks

import java.util.*;

public class Problem {
	
	private static int[] inputArray;
	private static int n;

	private static List<Integer> evenList;
	private static int evenSum;
	
	public static void main(String[] args) {
		getInputs();
		evenList = new ArrayList<Integer>();
	    toEvenList(evenList, inputArray);
	    printArrayList(evenList);
	    getEvenSum();
	    evaluate();
	}
	/**
	 * To get the input from the user and put it in a variable n and an integer array.
	 */
	private static void getInputs() {
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		inputArray = new int[n];
		for (int i=0; i<n; i++) {
			inputArray[i] = input.nextInt();
		}
		input.close();
	}
	
	/**
	 * To parse through the array and load all the even values into an ArrayList
	 * @param list Array List to contain even values
	 * @param arr Input array
	 */
	public static void toEvenList(List<Integer> list, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (isEven(arr[i])) {
				list.add(Integer.valueOf(arr[i]));
			}
	    }
	}
	
	/**
	 * To print out the array list. For debugging purposes.
	 * @param arrayList ArrayList to be printed out
	 */
	private static void printArrayList(List<Integer> arrayList) {
		System.out.print("[ ");
		for (int i=0; i<arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + " ");
		}
		System.out.println("]");
	}
	
	/**
	 * To check if the value is an even number
	 * @param x value
	 * @return boolean true or false
	 */
	private static boolean isEven(int x) {
		return (x % 2 == 0);
	}
	
	/**
	 * To calculate the total sum of numbers stored in the list of even numbers
	 */
	private static void getEvenSum() {
		for (int k=0; k<evenList.size();k++) {
	    	evenSum += evenList.get(k);
	    }
	}
	
	/**
	 * Algorithm to decide whether the input array is safe to hand over to your friend who hates odd numbers.
	 */
	private static void evaluate() {
		// case1: Total sum of array must be even
		// case2: Must be at least 2 even numbers in the array
		
		if ((evenList.size()>=2) && isEven(evenSum)) { // If case 1 and 2 are true then yes
			System.out.println("YES");
		}	
		else {
			// Else, remove an element of the even array list and check that case 2 is still met
			int rand = (int) ((Math.random() * evenList.size()));
			evenList.remove(rand);
			if (evenList.size()>=2)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}

}
