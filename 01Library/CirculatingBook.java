public class CirculatingBook extends LibraryBook {
    private String currentHolder = null;
    private String dueDate = null;

    public CirculatingBook (String author, String title, String ISBN, String callNum) {
	super(author, title, ISBN, callNum);
    }

    public void setCurrentHolder(String newHolder) {
	this.currentHolder = newHolder;
    }

    public String getCurrentHolder() {
	return this.currentHolder;
    }

    public void setDueDate(String newDueDate) {
	this.dueDate = newDueDate;
    }

    public String getDueDate() {
	return this.dueDate;
    }

    public void checkout(String patron, String due) {
        setDueDate(due);
	setCurrentHolder(patron);
    }

    public void returned() {
	currentHolder = null;
	dueDate = null;
    }

    public String circulationStatus() {
	if (currentHolder != null && dueDate != null) {
	    return "book available on shelves";
	}
	else {
	    return "Holder: " + getCurrentHolder() + "\n Due Date: " + getDueDate();
	}
    }

    // i know there is a toString, but doesn't that do the same thing as circulationStatus? hm
}
