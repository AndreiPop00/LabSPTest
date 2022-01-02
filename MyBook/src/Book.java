
import java.util.ArrayList;
import java.util.List;

public class Book extends Section {
	private String title;
	private List<Author> authors = new ArrayList<>();
	private List<Chapter> chapters = new ArrayList<>();
	List<Element> elementList = new ArrayList<>();
	
	public Book(String title) {
		super(title);
		this.title = title;
	}
	
	public void print() {
		
		 System.out.println( "Book: " + title + "\n");
		 System.out.println("Authors: ");
		 for(Author author : authors)
			 author.print();
		 System.out.println();
		 
		 for (Element element : elementList) {
	         element.print();
	     }
	}
	
	public void addAuthor(Author author) {
		this.authors.add(author);
	}
	
	 public void addContent(Element element) {
	        this.elementList.add(element);
	    }
	
	public int createChapter(String chapter) {
		Chapter capitol = new Chapter(chapter, this);
		this.chapters.add(capitol);
		return chapters.indexOf(capitol);
	}
	
	public Chapter getChapter(int indexChapter) {
		return chapters.get(indexChapter);
	}
	
	
}
