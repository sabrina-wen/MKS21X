import java.util.Iterator;

public class SuperArrayIterator implements Iterable<String> {
    private String[][] data;
    private int pos;
    
    // superarrayiterator needs to know which superarray is it looking at,
    // need refence to superarray -->
    // store in instance variable, need to initialize variable

    SuperArray data = new SuperArray();

    public SuperArrayIterator(String[] data) {
	this.data = data;
	pos = 0;
    }

    public boolean hasNext() {
	return pos < data.length() - 1;
    }

    
}
