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

    public int getISBN() {
	return ISBN;
    }

    public void setISBN (int newISBN) {
	ISBN = newISBN;
    }
}
