package Collections;

public class Book implements Comparable<Book> {
	
	private int pages;

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public Book(int pages) {
		super();
		this.pages = pages;
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		if(o.pages < 0) {
			int temp = o.pages;
			o.pages -= o.pages; 
			o.pages -= temp; 
		}
		return (this.pages-(o.pages));
	}
	
	
}
