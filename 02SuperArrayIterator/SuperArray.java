public class SuperArray {
    private String[] data;
    private int size;

    // constructor
    public SuperArray() {
	data = new String[10];
	size = 0;
    }

    public SuperArray(int initialCapacity) {
	if (initialCapacity < 0) {
	    throw new IllegalArgumentException("Initial Capacity can't be <= 0!");
	}
	else {
	    data = new String[initialCapacity];
	    size = 0;
	}
    }

    public int size() {
	return size;
    }

    // adds the value n to the next available slot in SuperArray
    public boolean add (String n) {
	if (size() >= data.length) {
	    grow();
	}
        data[size()] = n;

	size += 1;
	return true;
    }

    public String get(int index) {
	if (index < 0 || index >= size()) {
	    throw new IndexOutOfBoundsException();
	}
	else {    
	    return data[index];
	}
    }

    public String toString() {
      String retVal = "";
      for (int i = 0; i < size - 1; i++) {
	  retVal += "" + data[i] + ", ";
      }
      String lastVal = "" + data[size - 1];
      return "[ " + retVal + lastVal + "]";
    }

    public String toStringDebug() {
	String debugVal = "";
	for (int i = 0; i < data.length - 1; i++) {
	    if (i < size) {
		debugVal += "" + data[i] + ", ";
	    }
	    else if ( i < data.length - 1) {
		debugVal += "_,";
	    }
	}
	return "[" + debugVal + "_ ]";
    }

    public void clear() {
	size = 0;
    }

    public boolean isEmpty() {
	return (size() == 0);
    }

    public String set (int index, String element) {
	if (index < 0 || index >= size()) {
	    throw new IndexOutOfBoundsException();
	}
	else {
	    String a = get(index);
	    data[index] = element;
	    return a;
	}
    }

    public void grow() {
        String[] temp = new String[size() * 2];
	for (int i = 0; i < data.length; i++) {
	    temp[i] = data[i];
	}
	data = temp;
    }

    public void add(int index, String element) {
	if (index < 0 || index  > size()) {
	    throw new IndexOutOfBoundsException();
	}
	else if (size < data.length) {
	    for (int i = size - 1; i >= index; i--) {
		data[i+1] = data[i];
	    }
	    data[index] = element;
	    size += 1;
	}
	else {
	    grow();
	    add(index, element);
	}
    }

    public String remove(int index) {
	if (index < 0 || index  > size()) {
	    throw new IndexOutOfBoundsException();
	}
	else {
	    String a = get(index);
	    for (int i = index;i < size - 1; i++ ) {
		data[i] = data[i + 1];
	    }
	    size -= 1;
	    return a;
	}
    }

    public String[] toArray() {
	String[] orderedArray = new String[size];
	for (int i = 0; i < size; i++) {
	    orderedArray[i] = data[i];
	}
	return orderedArray;
    }
	

    public int indexOf (String i) {
	int retValIndexOf = 0;
	for (int j = 0; j < size; j++) {
	    if (data[j].equals(i)) {
		retValIndexOf = j;
		break;
	    }
	    else {
		retValIndexOf = -1;
	    }
	}
	return retValIndexOf;
    }

    public int lastIndexOf(String i) {
	int retValLastIndex = 0;
	for (int j = size - 1; j > 0; j--) {
	    if (data[j].equals(i)) {
		retValLastIndex = j;
		break;
	    }
	    else {
		retValLastIndex =  -1;
	    }
	}
	return retValLastIndex;
    }
		    
    public void trimToSize() {
	String[] temp = new String[size()];
	for (int i = 0; i < size(); i++) {
	    temp[i] = data[i];
	}
	data = temp;
	size = data.length;
    }
		       
}
