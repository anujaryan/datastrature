package array;

public class OneDimensionalArrayMain {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Creating a blank array of size 10 ..");
		
		OneDimensionalArray one1d=new OneDimensionalArray(10);
		
		System.out.println("Traversing an array.... ");
		
		one1d.traversing1d();
		System.out.println();System.out.println();
		
		one1d.insertAnElement(0, 0);
		one1d.insertAnElement(1, 10);
		one1d.insertAnElement(2, 20);
		one1d.insertAnElement(3, 30);
		one1d.insertAnElement(4, 40);
		one1d.insertAnElement(5, 50);
		one1d.insertAnElement(6, 60);
		one1d.insertAnElement(7, 70);
		one1d.insertAnElement(8, 80);
		one1d.insertAnElement(9, 90);
		
		one1d.insertAnElement(1, 100);
		one1d.insertAnElement(10, 200);
		
		System.out.println();
		System.out.println();
		
		System.out.println("Accessing cell number is ....");
		one1d.accessingCell(1);
		one1d.accessingCell(15);
		
		System.out.println();System.out.println();
		
		System.out.println("Searching an element "+ 50);
		
		one1d.searchElement(60);
		one1d.searchElement(150);
		System.out.println(); System.out.println();
		
		System.out.println("============================================");
		System.out.println("Before Deleting array is ....!");
		one1d.traversing1d();
		one1d.deleteElement(5);
		//one1d.deleteElement(20);
		System.out.println("\n After Deleting Array is ......!  ");
		one1d.traversing1d();
		System.out.println(); System.out.println();
        		
		
		
		
	}//end of main method...
}//end of class


class OneDimensionalArray {

	int arr[] = null;
	int i = 0;

	//creating an empty array of size 10
	OneDimensionalArray(int arraySize) {
		arr = new int[arraySize];

		for (i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}

	}

	// traversing an array 
	public void traversing1d() {

		try {

			for (i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		} catch (Exception e) {
			System.out.println("Array does not exists !");
		}

	}
	
	// inserting an element into array...
	public void insertAnElement(int location, int value) {

		try {
			if (arr[location] == Integer.MIN_VALUE) {
				arr[location] = value;
				System.out.println("Successfully inserted  location ->  value " + location + " ->" + arr[location]);
			} else {
				System.out.println("Location already occupied..");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access the array !");
		}

	}
	
	//accessing a cell

	public void accessingCell(int cellnumber) {

		try {
			System.out.println(arr[cellnumber]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access array!..");
		}

	}
	
	// Searhing an element 
	
	
	public void searchElement(int svlaue) {

		for (i = 0; i < arr.length; i++) {

			if (arr[i] == svlaue) {
				System.out.println(" Value found ! ");
				System.out.println("Index of " + svlaue + "  is : " + i);
				return;
			}

		}
		System.out.println(svlaue + "  is not found !..");

	}
	
// Deleting an element from array ....
	
	public void deleteElement(int index) {

		try {
			arr[index] = Integer.MIN_VALUE;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index invalid to given array...");
		}

	}
	
	
}