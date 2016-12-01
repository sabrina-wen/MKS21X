public class ReferenceBook extends LibraryBook {
    private String collection;

    public ReferenceBook (String author, String title, String ISBN, String callNum, String collection) {
	super(author, title, ISBN, callNum);
	this.collection = collection;
    }

    public String getCollection() {
	return this.collection;
    }

    public void setCollection(String newCollection) {
	this.collection = newCollection;
    }

    // overrides checkout function from LibraryBook
    public void checkout(String patron, String due) {
	System.out.println("cannot check out a reference book");
    }

    // overrides returned function from LibraryBook
    public void returned() {
	System.out.println("reference book could not have been checked out -- return impossible");
    }

    // overrides circulationStatus() from LibraryBook
    public String circulationStatus() {
	return "non-circulating reference book";
    }

    public String toString() {
	return super.toString() + " Collection: " + getCollection();
    }
}
