public class Book {
    private String author;
    private String title;
    private String ISBN;

    public Book() {
	// empty constructor woo
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


}
