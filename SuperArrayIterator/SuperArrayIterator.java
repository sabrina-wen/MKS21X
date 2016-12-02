import java.util.Iterator;

public class SuperArrayIterator implements Iterable<String> {
    // superarrayiterator needs to know which superarray is it looking at,
    // need refence to superarray -->
    // store in instance variable, need to initialize variable

    SuperArray data = new SuperArray();

    public SuperArrayIterator() {
	this.data = data;
    }
}
