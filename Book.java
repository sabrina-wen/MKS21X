public class Book {
    private String author;
    private String title;
    private int ISBN;

    public Book() {
	// null constructor
    }
    
    public Book (String author, String title, int ISBN) {
	this.author = author;
	this.title = title;
	this.ISBN = ISBN;
    }
}
