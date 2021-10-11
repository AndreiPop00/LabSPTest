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
	public void createNewParagraph (String string) {
		paragraph.add(string);
	}
	public void createNewImage (String string) {
		image.add(string);
	}
	public void createNewTable (String string) {
		table.add(string);
	}
	public void print()
	{
		System.out.print(name + " " + paragraph + " " + image + " " + table);
	}
}
