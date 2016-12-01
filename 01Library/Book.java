public class Book {
    private String author;
    private String title;
<<<<<<< HEAD
    private int ISBN;

    public Book() {
	// null constructor
    }
    
    public Book (String author, String title, int ISBN) {
=======
    private String ISBN;

    public Book() {
	// empty constructor woo
    }
    
    public Book (String author, String title, String ISBN) {
>>>>>>> c64d8cc9c84b83bcbbd8f316f9cacec382a84712
	this.author = author;
	this.title = title;
	this.ISBN = ISBN;
    }

    public String getAuthor() {
<<<<<<< HEAD
	return author;
=======
        return author;
>>>>>>> c64d8cc9c84b83bcbbd8f316f9cacec382a84712
    }

    public void setAuthor(String newAuthor) {
	author = newAuthor;
    }

    public String getTitle() {
	return title;
    }

<<<<<<< HEAD
    public void setTitle(String newTitle) {
	title = newTitle;
    }

    public int getISBN() {
	return ISBN;
    }

    public void setISBN (int newISBN) {
	ISBN = newISBN;
    }
=======

>>>>>>> c64d8cc9c84b83bcbbd8f316f9cacec382a84712
}
