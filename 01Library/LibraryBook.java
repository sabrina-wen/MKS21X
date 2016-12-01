public abstract class LibraryBook extends Book implements Comparable<LibraryBook> {
    private String callNumber;

    public LibraryBook (String author, String title, String ISBN, String callNum) {
	super(author, title, ISBN);
	this.callNumber = callNum;
    }

    public String getCallNum() {
	return callNum;
    }

    public void setCallNum(String newCallNum) {
	this.callNumber = newCallNum;
    }

    public abstract void checkout(String patron, String due);

    public abstract void returned();

    public abstract String circulationStatus();

    
}
