import java.util.List;
import java.util.ArrayList;
public class Book {
	String name;
	List<String> paragraph = new ArrayList<String>();
	List<String> image = new ArrayList<String>();
	List<String> table = new ArrayList<String>();
	public Book (String name) {
		this.name = name;
	}
	public void createNewParagraph (String orice) {
		paragraph.add(orice);
	}
	public void createNewImage (String orice) {
		image.add(orice);
	}
	public void createNewTable (String orice) {
		table.add(orice);
	}
	public void print()
	{
		System.out.print(name + " " + paragraph + " " + image + " " + table);
	}
}
