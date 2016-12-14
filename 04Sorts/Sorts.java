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

    public static void main (String[] args) {
	int ary[] = new int[5];
	ary[0] = 64;
	ary[1] = 25;
	ary[2] = 12;
	ary[3] = 22;
	ary[4] = 11;
	System.out.println("should print out 11, 12, 22, 25, 64");
        selectionSort(ary);
	for (int i = 0; i < ary.length; i++) {
	    System.out.println(ary[i]);
	}
        int ary2[] = new int[8];
	ary2[0] = 432;
	ary2[1] = -2;
	ary2[2] = 93;
	ary2[3] = 34;
	ary2[4] = 58;
	ary2[5] = -8394;
	ary2[6] = 11;
	ary2[7] = 395;
       	System.out.println("should print out -8394, -2, 11, 34, 58, 93, 395, 432");
        selectionSort(ary2);
	for (int i = 0; i < ary2.length; i++) {
	    System.out.println(ary2[i]);
	}
    }

}
