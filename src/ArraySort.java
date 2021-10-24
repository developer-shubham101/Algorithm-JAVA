public class ArraySort {

	private int[] arrayValue = new int[50];
	private int arraySize = 10;

	ArraySort() {
		// int[] tmpArray = { 2, 5, 3, 1, 4, 8, 6, 7, 9, 0 };
		// int[] tmpArray = { 23, 55, 13, 41, 24, 86, 77, 77, 59, 40 };
		int[] tmpArray = { 23, 24, 40, 41, 55, 59, 77, 77, 86, 13 };
		for (int i = 0; i < tmpArray.length; i++) {
			arrayValue[i] = tmpArray[i];
		}

		// for (int i = 0; i < arraySize; i++) {
		// arrayValue[i] = (int) (Math.random() * 10) + 10;
		// }
	}

	void selectionSort() {
		for (int i = 0; i < arraySize; i++) {
			int lastIndex = i;
			for (int j = i; j < arraySize; j++) {
				if (arrayValue[j] < arrayValue[i]) {
					lastIndex = j;
				}
			}
			printArray();
			int tmpValue = arrayValue[i];
			arrayValue[i] = arrayValue[lastIndex];
			arrayValue[lastIndex] = tmpValue;

		}
		printArray();
	}

	// 23, 55, 13, 41, 24, 86, 77, 77, 59, 40
	void insertionSort() {
		System.out.println("-----");
		for (int i = 1; i < arraySize; i++) {
			printArray();
			int j = i;
			int toInsert = arrayValue[i];
			while (j > 0 && (arrayValue[j - 1] > toInsert)) {
				arrayValue[j] = arrayValue[j - 1];
				j--;
				printArray();
			}
			arrayValue[j] = toInsert;

			printArray();
			System.out.println("\n");
		}
		System.out.println("-----");
	}

	void bubbleSort() {
		for (int i = arraySize - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.println("Check: " + arrayValue[j] + " is greater than " + arrayValue[j + 1]);
				if (arrayValue[j] > arrayValue[j + 1]) {
					System.out.println("yes it is so we ");
					int tmpValue = arrayValue[j];
					arrayValue[j] = arrayValue[j + 1];
					arrayValue[j + 1] = tmpValue;
					System.out.println("Move: " + tmpValue + " to " + arrayValue[j] + " and move: " + arrayValue[j]
							+ " to " + tmpValue);

					printArray();
				} else {
					System.out.println("no it is so we leave it here.");
				}
			}

		}
	}
	// 012345678
	// 123456789
	// 7

	void binarySearchForValue(int value) {
		int lowerIndex = 0;
		int highIndex = arraySize - 1;

		while (lowerIndex <= highIndex) {

			int middleIndex = (highIndex + lowerIndex) / 2;
			// System.out.println("middleIndex: " + middleIndex);
			if (arrayValue[middleIndex] > value) {
				// System.out.println(
				// "if " + arrayValue[middleIndex] + " > " + value + " = " +
				// (arrayValue[middleIndex] > value));
				highIndex = middleIndex - 1;
			} else if (arrayValue[middleIndex] < value) {
				// System.out.println(
				// "if " + arrayValue[middleIndex] + " < " + value + " = " +
				// (arrayValue[middleIndex] > value));

				lowerIndex = middleIndex + 1;
			} else {
				System.out.println("We found the value at: " + middleIndex);
				lowerIndex = highIndex + 1;
			}
		}

	}

	void printArray() {
		System.out.println("----------------------------------------");
		for (int i = 0; i < arraySize; i++) {
			System.out.print("| " + i + " ");

		}
		System.out.println();
		System.out.println("----------------------------------------");

		for (int i = 0; i < arraySize; i++) {
			System.out.print("|" + arrayValue[i] + " ");
		}
		System.out.println();
		System.out.println("----------------------------------------");
	}

	public static void main(String[] args) {

		ArraySort arraySort = new ArraySort();
		arraySort.printArray();
		// arraySort.bubbleSort();
		// System.out.println();
		// System.out.println();
		// System.out.println("----------------------------------------");
		// arraySort.binarySearchForValue(77);
		// arraySort.printArray();

		// arraySort.selectionSort();

		arraySort.insertionSort();
	}
}
