import java.util.Iterator;
import java.util.NoSuchElementException;

public class SuperArrayIterator implements Iterator<String> {
    private SuperArray ary;
    private int pos;
    
    // superarrayiterator needs to know which superarray is it looking at,
    // need refence to superarray -->
    // store in instance variable, need to initialize variable

    public SuperArrayIterator(SuperArray data) {
	ary = data;
	pos = 0;
    }

    public boolean hasNext() {
	return pos < ary.size();
    }

    public String next() {
	if (hasNext()) {
	    pos++;
	    return ary.get(pos - 1);
	}
	else {
	    throw new NoSuchElementException();
	}
    }

    public void remove() {
	throw new UnsupportedOperationException();
    }
    
}
