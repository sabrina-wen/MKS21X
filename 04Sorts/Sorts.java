public class Sorts {
  /**EDIT THIS METHOD TO MATCH YOUR NAME 
  */
  public static String name() {
    return "09.Wen.Sabrina"; 
  }

  /**Selection sort of an int array. 
  *Upon completion, the elements of the array will be in increasing order.
  *@param data the elements to be sorted.
  */
    public static void selectionSort(int[] data) { 
	for (int i = 0; i < data.length - 1; i++) {
	    if (data[i] > data[i + 1]) {
		int current = data[i];
	        data[i] = data[i + 1];
		data[i + 1] = current;
	    }
	}
    }

    public static void main (String[] args) {
	int[] ary = new int[5];
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
    }

}
