package arrays;

public class Book {

	private Integer bookId;
	private String bookName;
	private String publisher;
	private Double price;
	
	public Book(Integer bookId, String bookName, String publisher, Double price) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.publisher = publisher;
		this.price = price;
	}

	public Book(Integer bookId, String bookName, String publisher) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.publisher = publisher;
	}

	public Book() {
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", publisher=" + publisher + "]";
	}
	
	
}