public class Sorts {
  /**EDIT THIS METHOD TO MATCH YOUR NAME 
  */
  public static String name() {
    return "09.Wen.Sabrina"; 
  }

  /**Selection sort of an int array. 
  *Upon completion, the elements of the array will be in increasing order.
  *@param data the elements to be sorted.
  *find smallest element located at index i or any of the higher indicies
  *swap that value into index i
  *increase i and repeat until the last index
  */
    public static void selectionSort(int[] data) {
	// increasing i and repeating until last index (ongoing)
	for (int i = 0; i < data.length - 1; i++) {
	    // finding smallest element located at index i
	    int smallest = i;
	    for (int j = i + 1; j < data.length; j++) {
		if (data[j] < data[smallest]) {
		    smallest = j;
		}
	    }
	    // swapping value into index i
	    int placeholder = data[smallest];
	    data[smallest] = data[i];
	    data[i] = placeholder;
	}
    }

    public static void insertionSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
	    // looks at current element (first element bc we assume zeroth element is already sorted
	    int present = data[i];
	    // we use j so we can compare w/ present
	    // if we don't have present, the value at the beginning of the for loop will be changed by the end
	    int j = i;
	    while (j > 0 && data[j - 1] > present) {
		// assuming present element is at index > 0 and prev element > present element
		data[j] = data[j - 1];
		// present element = prev element
		j--;
		// loops through the elements BEFORE present element to make sure we inserted correctly
	    }
	    data[j] = present;
	    // the element we took out is put back in here
        }
    }

    public static void bubbleSort (int[] data) {
	int countdown = data.length - 1;
	while (countdown > 0) {
	    for (int i = 0; i < data.length - 1; i++) {
		if (data[i] > data[i + 1]) {
		    int temp = data[i];
		    data[i] = data[i + 1];
		    data[i + 1] = temp;
		}
	    }
	    countdown--;
	}
    }

    public static void main (String[] args) {
	int ary[] = new int[5];
	ary[0] = 64;
	ary[1] = 25;
	ary[2] = 12;
	ary[3] = 22;
	ary[4] = 11;
	System.out.println("should print out 11, 12, 22, 25, 64");
        bubbleSort(ary);
	for (int i = 0; i < ary.length; i++) {
	    System.out.println(ary[i]);
	}
        int ary2[] = new int[8];
	ary2[0] = 58;
	ary2[1] = -2;
	ary2[2] = 93;
	ary2[3] = 34;
	ary2[4] = 58;
	ary2[5] = -8394;
	ary2[6] = 11;
	ary2[7] = 395;
       	System.out.println("should print out -8394, -2, 11, 34, 58, 93, 395, 432");
        bubbleSort(ary2);
	for (int i = 0; i < ary2.length; i++) {
	    System.out.println(ary2[i]);
	}

	int ary3[] = new int[1];
	ary3[0] = 110;
	bubbleSort(ary3);
        
	for (int i = 0; i < ary3.length; i++) {
	    System.out.println(ary3[i]);
	}
	
    }

}
