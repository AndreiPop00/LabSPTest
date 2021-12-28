
import java.util.ArrayList;
import java.util.List;

public class SubChapter extends Chapter{
	private Chapter chapter;
	private String name;	
	private List<Paragraph> paragraphs = new ArrayList<>();
	private List<Image> images = new ArrayList<>();
	private List<Table> tables = new ArrayList<>();

	public SubChapter(String name, Chapter chapter) {
		this.name = name;
		this.chapter = chapter;
	}
	public void print() {
		 System.out.println( "Subchapter: " + name );
		 for(Paragraph p : paragraphs)
			 p.print();
		 for(Image i : images)
			 i.print();
		 for(Table t : tables)
			 t.print();
	}
	
	public void createNewParagraph(String p) {
		Paragraph paragraph = new Paragraph(p, this);
		this.paragraphs.add(paragraph);
	}
	
	public void createNewImage(String i) {
		Image image = new Image(i, this);
		this.images.add(image);
	}
	
	public void createNewTable(String t) {
		Table table = new Table(t, this);
		this.tables.add(table);
	}

	public void setSubChapter(Chapter chapter) {
		this.setChapter(chapter);
	}
	public Chapter getChapter() {
		return chapter;
	}
	public void setChapter(Chapter chapter) {
		this.chapter = chapter;
	}
	
}