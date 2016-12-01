public class Book {
    private String author;
    private String title;
    private String ISBN;

    public Book() {
	// null constructor
    }
    
    public Book (String author, String title, String ISBN) {
	this.author = author;
	this.title = title;
	this.ISBN = ISBN;
    }

    public String getAuthor() {
	return author;
    }

    public void setAuthor(String newAuthor) {
	author = newAuthor;
    }

    public String getTitle() {
	return title;
    }

    public void setTitle(String newTitle) {
	title = newTitle;
    }

    public String getISBN() {
	return ISBN;
    }

    public void setISBN (int newISBN) {
	ISBN = newISBN;
    }
}
