
import java.util.ArrayList;
import java.util.List;

public class Chapter {
	private String name;
	private List<SubChapter> subChapters = new ArrayList<>();
	private Book book;
	
	public Chapter(String name, Book book) {
		this.name = name;
		this.book = book;
	}
	
	public void print() {
		 System.out.println("Chapter with name: " + name);
		 for (SubChapter sc : subChapters) {
	            sc.print();
	        }
	}
	
	public int createSubChapter(String subChapter) {
		SubChapter subcapitol = new SubChapter(subChapter, this);
		this.subChapters.add(subcapitol);
		return subChapters.indexOf(subcapitol);
	}
	
	public SubChapter getSubChapter(int indexSubChapter) {
		return subChapters.get(indexSubChapter);
	}

}