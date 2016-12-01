public abstract class LibraryBook extends Book implements Comparable<LibraryBook> {
    private String callNumber;

    public LibraryBook (String author, String title, String ISBN, String callNum) {
	super(author, title, ISBN);
	this.callNumber = callNum;
    }

    public String getCallNum() {
	return this.callNumber;
    }

    public void setCallNum(String newCallNum) {
	this.callNumber = newCallNum;
    }

    public abstract void checkout(String patron, String due);

    public abstract void returned();

    public abstract String circulationStatus();

    public int compareTo (LibraryBook other) {
	return this.callNumber.compareTo(other.callNumber);
    }

    public String toString() {
	return super.toString() + "Circulation Status: " + circulationStatus() + "; Call Number: " + getCallNum();
    }
}
